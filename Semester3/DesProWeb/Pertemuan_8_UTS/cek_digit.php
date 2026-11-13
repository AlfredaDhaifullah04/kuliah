<?php
// Jobsheet 7: Form Processing - Menggunakan isset() dan $_POST
if (isset($_POST['angka'])) {
    // Ambil data yang dikirim dari form
    $angka = $_POST['angka'];
    
    // Hilangkan spasi di awal/akhir jika ada
    $angka = trim($angka);

    // Jobsheet 4: Validasi menggunakan fungsi PHP (tambahan keamanan Server-Side)
    // Cek apakah input benar-benar angka (terlepas dari JS client-side)
    if (is_numeric($angka)) {
        
        // Hitung jumlah digit
        $jumlah_digit = strlen((string)$angka);

        // Tentukan hasil pengecekan
        if ($jumlah_digit > 8) {
            $hasil = "Angka **$angka** memiliki **$jumlah_digit** digit. Jumlah ini **melebihi** batas (misalnya 8 digit).";
            $style = "color: red;";
        } elseif ($jumlah_digit == 8) {
            $hasil = "Angka **$angka** memiliki **$jumlah_digit** digit. Ini adalah **jumlah digit yang tepat**.";
            $style = "color: green;";
        } else {
             $hasil = "Angka **$angka** memiliki **$jumlah_digit** digit. Jumlah ini **kurang** dari batas (misalnya 8 digit).";
            $style = "color: orange;";
        }

    } else {
        // Error server-side jika ada upaya bypass JS validation
        $hasil = "Error: Input yang dimasukkan bukan angka yang valid.";
        $style = "color: darkred;";
    }
} else {
    // Jika form belum disubmit (misalnya diakses langsung)
    $hasil = "Silakan masukkan angka pada form sebelumnya.";
    $style = "color: #555;";
}

?>
<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hasil Cek Digit</title>
    <style>
        /* CSS Styling Sederhana */
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
            text-align: center;
        }
        .result-box {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.15);
            width: 100%;
            max-width: 500px;
        }
        h2 {
            color: #333;
            margin-bottom: 20px;
        }
        p {
            font-size: 1.2em;
            line-height: 1.6;
        }
        .back-link {
            display: inline-block;
            margin-top: 25px;
            padding: 10px 20px;
            background-color: #007bff;
            color: white;
            text-decoration: none;
            border-radius: 4px;
            transition: background-color 0.3s;
        }
        .back-link:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="result-box">
    <h2>Hasil Pengecekan Digit</h2>
    
    <p style="<?php echo $style; ?>"><?php echo nl2br($hasil); ?></p>
    
    <a href="index.php" class="back-link">Kembali ke Form</a>
</div>

</body>
</html>