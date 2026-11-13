<?php
// membuat fungsi
function hitungUmur ($tahun_lahir, $thn_sekarang) {
    $umur = $thn_sekarang - $tahun_lahir;
    return $umur;
}

function perkenalan($nama, $salam = "Assalamualaikum") {
    echo $salam. ", ";
    echo "Perkenalkan, nama saya" .$nama."<br/>";

    //memanggil fungsi lain
    echo "Saya berusia ". hitungUmur(1988, 2023) ." tahun<br/>";
    echo "Senang bisa berkenalan dengan anda";
}

// memanggil fungsi perkenalan 
perkenalan("Cihuy");
?>