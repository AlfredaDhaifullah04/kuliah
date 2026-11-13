<?php
$a = 10;
$b = 5;

$hasilTambah = $a + $b;
$hasilKurang = $a - $b;
$hasilKali = $a * $b;
$hasilBagi = $a / $b;
$sisaBagi = $a % $b;
$pangkat = $a ** $b ;

echo "hasil tambah: {$hasilTambah}"; echo "<br>";
echo "Hasil kurang: $hasilKurang"; echo "<br>";
echo "Hasil kali: $hasilKali"; echo "<br>";
echo "Hasil bagi: {$hasilBagi}"; echo "<br>";
echo "Sisa bagi: {$sisaBagi}"; echo "<br>";
echo "pangkat: {$pangkat}"; echo "<br>";
echo "<br>";


// Operator Perbandingan
$hasilSama = $a == $b;
$hasilTidakSama = $a != $b;      // true
$hasillebihKecil = $a < $b;      // false
$hasillebihBesar = $a > $b;      // true
$hasillebihKecilSama = $a <= $b; // false
$hasillebihBesarSama = $a >= $b; // true

// Menampilkan hasil
echo "a = $a, b = $b\n"; echo "<br>";
echo "a == b: " . ($hasilSama ? 'true' : 'false') . "\n"; echo "<br>";
echo "a != b: " . ($hasilTidakSama ? 'true' : 'false') . "\n"; echo "<br>";
echo "a < b: " . ($hasillebihKecil ? 'true' : 'false') . "\n"; echo "<br>";
echo "a > b: " . ($hasillebihBesar ? 'true' : 'false') . "\n"; echo "<br>";
echo "a <= b: " . ($hasillebihKecilSama ? 'true' : 'false') . "\n"; echo "<br>";
echo "a >= b: " . ($hasillebihBesarSama ? 'true' : 'false') . "\n"; echo "<br>";
echo "<br>";


// Operator Logika
$hasilAnd = $a && $b;      // true && false = false
$hasilOr = $a || $b;       // true || false = true
$hasilNotA = !$a;          // !true = false
$hasilNotB = !$b;          // !false = true

echo "a = " . ($a ? 'true' : 'false') . ", b = " . ($b ? 'true' : 'false') . "\n"; echo "<br>";
echo "a && b (AND): " . ($hasilAnd ? 'true' : 'false') . "\n"; echo "<br>";
echo "a || b (OR): " . ($hasilOr ? 'true' : 'false') . "\n"; echo "<br>";
echo "!a (NOT a): " . ($hasilNotA ? 'true' : 'false') . "\n"; echo "<br>";
echo "!b (NOT b): " . ($hasilNotB ? 'true' : 'false') . "\n"; echo "<br>";
echo "<br>";

// Operator Penugasan dengan Operasi Aritmatika
echo "Nilai awal: a = $a, b = $b\n\n"; echo "<br>";

$a += $b; // Sama dengan: $a = $a + $b;
echo "Setelah a += b: a = $a\n"; echo "<br>";

$a -= $b; // Sama dengan: $a = $a - $b;
echo "Setelah a -= b: a = $a\n"; echo "<br>";

$a *= $b; // Sama dengan: $a = $a * $b;
echo "Setelah a *= b: a = $a\n"; echo "<br>";

$a /= $b; // Sama dengan: $a = $a / $b;
echo "Setelah a /= b: a = $a\n"; echo "<br>";

$a %= $b; // Sama dengan: $a = $a % $b;
echo "Setelah a %= b: a = $a\n"; echo "<be>";

$hasilIdentik = $a === $b;
$hasilTidakIdentik = $a !== $b;
echo "<br>";
echo "Hasil identik : " . ($hasilIdentik ? 'true' : 'false') . "\n"; echo "<br>";
echo "Hasil tidak identik : " . ($hasilTidakIdentik ? 'true' : 'false') . "\n"; echo "<br>";

$totalKursi = 45;
$kursiDigunakan = 28;
$kursiKosong = $totalKursi - $kursiDigunakan;

//mengitung presentase kursi kosong
$persentase_kosong = ($kursiKosong / $totalKursi) * 100;
echo "Persentase kursi kosong: $persentase_kosong%";
?>

