<?php
$umur;
if (isset($umur) && $umur >= 18) {
    echo "Anda sudah dewasa.";
} else {
    echo "Anda belum dewasa atau variable 'umur' tidak ditemukan";
}

echo "<br><br>";

$data = array("nama" => "Jane", "Usia" => 25);
if (isset($data["nama"])) {
    echo "Nama: " . $data["nama"];
} else {
    echo "Variable 'nama' tidak ditentukan dalam array";
}
?>