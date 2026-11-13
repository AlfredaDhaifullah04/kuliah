<?php
$pesan = "saya arek malang";
// echo strrev($pesan) . "<br>";

#  ubah variable $pesan menjadi array dengan perintah explore
$pesanPerkata = explode(",", $pesan);
#ubah setiap kata dalam array menjadi kebalikanya
$pesanPerkata = array_map(fn($pesan) => strrev($pesan), $pesanPerkata);
#gabungkan kembali array menjadi string
$pesan = implode(",", $pesanPerkata);

echo $pesan . "<br>";
?>
