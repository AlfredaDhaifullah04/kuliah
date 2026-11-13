<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = $_POST["nama"];
    $email = $_POST["email"];
    $errors = array();

    // Validasi Nama
    if (empty($name)) {  // Diubah dari $nama ke $name
        $errors[] = "Nama harus diisi.";
    }
    // Validasi Email
    if (empty($email)) {
        $errors[] = "Email harus diisi.";
    } elseif (!filter_var($email, FILTER_VALIDATE_EMAIL)) {  // Ditambah ! di depan
        $errors[] = "Format email tidak valid.";
    }
    // Jika ada kesalahan validasi
    if (!empty($errors)) {  // Diubah kondisi menjadi !empty
        foreach ($errors as $error) {  // Dihapus (! dan ) yang tidak perlu
            echo $error . "<br>";
        }
    } else {
        // Lanjutkan dengan pemrosesan data jika semua validasi berhasil
        echo "Data berhasil dikirim: Nama = $name, Email = $email";  // Diubah $nama ke $name
    }
}