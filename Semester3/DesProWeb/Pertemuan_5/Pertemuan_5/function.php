<?php

//membuat fungsi
function perkenalan ($nama, $salam = "Assalamualaikum") {
    echo "$salam, ";
    echo "Perkenalkan, nama saya $nama <br/>";
    echo "Senang bisa berkenalan dengan anda <br/>";
}

// memanggil fungsi yang sudah di buat
perkenalan ("Handana", "Halo"); echo "<br/>";

echo "<hr>";

$saya = "elok";
$ucapan_selamat = "Selamat pagi";

perkenalan($saya, $ucapan_selamat);echo "<br>";

// memanggil function tanpa mengisi parameter salam
perkenalan($saya); echo "<br>";
perkenalan();
?>