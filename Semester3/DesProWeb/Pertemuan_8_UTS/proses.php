<?php
// Jobsheet 7: Form Processing - Menggunakan isset() dan $_POST
if (!isset($_POST['tahun'])) {
    // Redirect atau tampilkan pesan jika diakses langsung tanpa submit form
    header('Location: index.php');
    exit;
}

// Ambil input tahun
$tahun = filter_input(INPUT_POST, 'tahun', FILTER_VALIDATE_INT);

// Definisikan fungsi untuk mengecek kabisat (Jobsheet 5: Fungsi PHP)
function isKabisat($year) {
    // Logika Tahun Kabisat:
    // 1. Habis dibagi 400 (selalu kabisat)
    // 2. Atau habis dibagi 4 TAPI tidak habis dibagi 100
    if (($year % 400 == 0) || (($year % 4 == 0) && ($year % 100 != 0))) {
        return true;
    } else {
        return false;
    }
}

// Inisialisasi variabel hasil
$hasil_teks = "";
$hasil_style = "";

if ($tahun !== false && $tahun > 0) {
    if (isKabisat($tahun)) {
        $hasil_teks = "Tahun **$tahun** adalah **TAHUN KABISAT**! (Februari memiliki 29 hari)";
        $hasil_style = "color: green; border: 2px solid green;";
    } else {
        $hasil_teks = "Tahun **$tahun** **BUKAN** Tahun Kabisat. (Februari memiliki 28 hari)";
        $hasil_style = "color: red; border: 2px solid red;";
    }
} else {
    $hasil_teks = "Input tidak valid. Silakan kembali dan masukkan tahun yang benar.";
    $hasil_style = "color: darkred; border: 2px solid darkred;";
}

?>
<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hasil Pengecekan Kabisat</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e9ecef;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
            text-align: center;
        }
        .result-box {
            background-color: #ffffff;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 550px;
        }
        h2 {
            color: #212529;
            margin-bottom: 30px;
        }
        .result-text {
            font-size: 1.3em;
            padding: 20px;
            margin-bottom: 30px;
            font-weight: bold;
            border-radius: 8px;
            /* Style dari PHP akan ditambahkan di sini */
        }
        .back-link {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 25px;
            background-color: #007bff;
            color: white;
            text-decoration: none;
            border-radius: 5px;
            font-weight: 600;
            transition: background-color 0.3s;
        }
        .back-link:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="result-box">
    <h2>Hasil Pengecekan Tahun Kabisat</h2>
    
    <p class="result-text" style="<?php echo $hasil_style; ?>">
        <?php echo $hasil_teks; ?>
    </p>
    
    <a href="index.php" class="back-link">Cek Tahun Lain</a>
</div>

</body>
</html>