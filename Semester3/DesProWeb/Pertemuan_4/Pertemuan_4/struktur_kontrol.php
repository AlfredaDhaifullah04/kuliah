<?php
$nilaiNumerik = 92;

if ($nilaiNumerik >= 90 && $nilaiNumerik <= 100) {
    echo "Nilai huruf A";
} else if ($nilaiNumerik >= 80 && $nilaiNumerik <= 90) {
    echo "Nilai huruf B";
} else if ($nilaiNumerik >= 70 && $nilaiNumerik <= 80) {
    echo "Nilai huruf C";
} else if ($nilaiNumerik < 70) {
    echo "Nilai huruf D";
}

echo "<br>";
$jarakSaatIni = 0;
$jarakTarget = 500;
$peningkatanHarian = 30;
$hari = 0;

while ($jarakSaatIni < $jarakTarget) {
    $jarakSaatIni += $peningkatanHarian;
    $hari++;
}
echo "$jarakSaatIni"; echo "<br>";
echo "Atlet tersebut memerlukan $hari hari untuk mencapai jarak 500 kilometer.";


echo "<br>";

$jumlahLahan = 10;
$tanamanPerlahan = 5;
$buahPerTanaman = 10;
$jumlahBuah = 0;

for ($i = 1; $i <= $jumlahLahan; $i++) {
    $jumlahBuah += ($tanamanPerlahan * $buahPerTanaman);
}

echo "Jumlah buah yang akan dipanen adalah : $jumlahBuah"; echo "<br>";

//
$skorUjian = [85, 92, 78, 96, 88];
$totalSkor = 0;

foreach ($skorUjian as $skor) {
    $totalSkor += $skor;
}

echo "Total skor ujian adalah: $totalSkor" ; echo "<br>";

//
$nilaisiswa = [85, 92, 58, 64, 90, 55, 88, 79, 70, 96];

foreach ($nilaisiswa as $nilai) {
    if ($nilai < 60) {
    echo "Nilai: $nilai (Tidak lulus) <br>";
    continue;
    }
    echo "Nilai: $nilai (lulus) <br>";
}

echo "<br>";
// studi case guru
$nilaiMurid = [85, 92, 78, 64, 90, 75, 88, 79,70 , 96];
$totalNilai = 0;
for ($i = 0; $i < 10; $i++) {
    if ($nilaiMurid[$i] > 75 &&  $nilaiMurid[$i] < 92) {
        $totalNilai = ($totalNilai + $nilaiMurid[$i]); 
    }
    echo "Total nilai sementara: $totalNilai"; echo "<br>";
}

echo "Total Nilai : $totalNilai";
echo "<br>";

// studi case belanja
$totalBelanja = 120000;
$diskon = 0.2;

if ($totalBelanja > 100000) {
    $totalBayar = $totalBelanja * $diskon;
} else {
    $totalBayar = $totalBelanja;
}
echo "<br>";
echo "Total yang harus dibayarkan: Rp $totalBayar" ; echo "<br>";

// studi case permainan
$poinPlayer = 467;

echo "Total poin pemain adalah: $poinPlayer"; echo "<br>";
echo "Apakah player mendapatkan hadiah tambahan ?";
if ( $poinPlayer > 500) {
    echo "YA";
} else {
    echo "Tidak";
}
?>