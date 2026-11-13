<?php
//stud case nilai siswa
$nilaiSiswa = [85,92,78,64,90,55,88,79,70,96];

$nilaiLulus = [];

foreach ($nilaiSiswa as $nilai) {
    if ($nilai >= 70) {
        $nilaiLulus[] = $nilai;
    }
}
echo "Daftar nilai siswa lulus: " . implode(', ', $nilaiLulus);

//studi case karyawan
$daftarKaryawan = [
    ["alice", 7],
    ["Bob", 3],
    ["Charlie", 9],
    ['David', 5],
    ['Eva', 6],
];

$KaryawanPengalamanLimaTahun = [];
foreach ($daftarKaryawan as $karyawan) {
    if ($karyawan[1] > 5) {
        $KaryawanPengalamanLimaTahun[] = $karyawan[0];
    }
}
echo"<br>";
echo "Daftar Karyawan dengan pengalaan kerja lebih dari 5 tahun: " . implode(', ',
$KaryawanPengalamanLimaTahun); echo "<br> <br>";

// studi case mata kuliah
$daftarNilai = [
    'Matematika' => [
        ['Alice', 85],
        ['Bob', 92],
        ['Charlie', 78]
    ],
    'Fisika' => [
        ['Alice', 90],
        ['Bob', 88],
        ['Charlie', 75]
    ],
    'Kimia' => [
        ['Alice', 92],
        ['Bob', 89],
        ['Charlie', 85]
    ]
];

$mateKuliah = 'Fisika';
echo "Daftar nilai mahasiswa dalam mata kuliah $mateKuliah: <br>";
foreach ($daftarNilai[$mateKuliah] as $nilai) {
    echo "Nama: ($nilai[0]), Nilai: ($nilai[1]) <br>";
}

echo"<br><br>";


// studi case terakhir
$nilaiSiswa = [
    ['Alice', 85],
    ['Bob', 92],
    ['Charlie', 78],
    ['David', 64],
    ['Eva', 90]
];

// Menghitung total nilai dan rata-rata
$totalNilai = 0;
$jumlahSiswa = count($nilaiSiswa);

foreach ($nilaiSiswa as $siswa) {
    $totalNilai += $siswa[1];
}

$rataRata = $totalNilai / $jumlahSiswa;

// Mencetak informasi umum
echo "=== DAFTAR NILAI SISWA ===<br>";
echo "Mata Pelajaran: Matematika<br>";
echo "Rata-rata kelas: " . number_format($rataRata, 2) . "<br>";
echo "Jumlah siswa: $jumlahSiswa<br><br>";

// Mencetak semua nilai siswa
echo "=== SEMUA NILAI SISWA ===<br>";
foreach ($nilaiSiswa as $siswa) {
    echo "Nama: {$siswa[0]}, Nilai: {$siswa[1]}<br>";
}

echo "<br>";

// Mencetak siswa dengan nilai di atas rata-rata
echo "=== SISWA DENGAN NILAI DI ATAS RATA-RATA ===<br>";
$adaSiswaDiAtasRata = false;

foreach ($nilaiSiswa as $siswa) {
    if ($siswa[1] > $rataRata) {
        echo "Nama: {$siswa[0]}, Nilai: {$siswa[1]}<br>";
        $adaSiswaDiAtasRata = true;
    }
}

// Jika tidak ada siswa di atas rata-rata
if (!$adaSiswaDiAtasRata) {
    echo "Tidak ada siswa yang mencapai nilai di atas rata-rata.<br>";
}

// Versi alternatif lebih sederhana
echo "<br>=== HASIL PERHITUNGAN ===<br>";
echo "Rata-rata kelas: " . number_format($rataRata, 2) . "<br>";
echo "Siswa yang nilainya di atas " . number_format($rataRata, 2) . ":<br>";

foreach ($nilaiSiswa as $siswa) {
    if ($siswa[1] > $rataRata) {
        echo "- {$siswa[0]} ({$siswa[1]})<br>";
    }
}
?>