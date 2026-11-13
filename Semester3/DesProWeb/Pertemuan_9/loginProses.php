<?php
include "koneksi.php";

$username = $_POST['username'];
$password = md5($_POST['password']);

// Gunakan prepared statement untuk keamanan
$query = "SELECT * FROM user WHERE username=? and password=?";
$stmt = mysqli_prepare($connect, $query);
mysqli_stmt_bind_param($stmt, "ss", $username, $password);
mysqli_stmt_execute($stmt);
$result = mysqli_stmt_get_result($stmt);
$cek = mysqli_num_rows($result);

if($cek > 0){
    echo "Anda berhasil login. silahkan menuju ";
    echo "<a href='homeAdmin.html'>Halaman HOME</a>";
} else {
    echo "Anda gagal login. silahkan ";
    echo "<a href='loginForm.html'>Login kembali</a>";
    echo mysqli_error($connect);
}

mysqli_stmt_close($stmt);
?>