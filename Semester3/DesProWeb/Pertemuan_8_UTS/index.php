<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cek Tahun Kabisat</title>
    <style>
        /* CSS Styling Sederhana (Jobsheet 2) */
        body {
            font-family: Arial, sans-serif;
            background-color: #e9ecef;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
        }

        .container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 380px;
        }

        h2 {
            text-align: center;
            color: #212529;
            margin-bottom: 25px;
        }

        label {
            display: block;
            margin-bottom: 8px;
            font-weight: 600;
            color: #495057;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ced4da;
            border-radius: 5px;
            box-sizing: border-box; 
        }

        button {
            width: 100%;
            padding: 12px;
            background-color: #28a745; /* Warna hijau untuk Kabisat */
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            font-weight: bold;
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #218838;
        }

        .error-message {
            color: #dc3545;
            font-size: 0.9em;
            margin-top: -15px;
            margin-bottom: 15px;
            display: none;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Cek Tahun Kabisat</h2>
    
    <form action="proses.php" method="POST" onsubmit="return validateForm()">
        <label for="tahun">Masukkan Tahun:</label>
        <input type="text" id="tahun" name="tahun" placeholder="Contoh: 2024" required>
        
        <p id="tahunError" class="error-message">Input harus berupa empat digit angka.</p>

        <button type="submit">CEK</button>
    </form>
</div>

<!-- <script>
    function validateForm() {
        const tahunInput = document.getElementById('tahun');
        const tahunValue = tahunInput.value.trim();
        const errorElement = document.getElementById('tahunError');
        
        // 1. Cek apakah input adalah 4 digit angka (RegEx)
        const isFourDigitNumber = /^\d{4}$/.test(tahunValue);
        
        if (!isFourDigitNumber) {
            errorElement.textContent = "Masukkan tahun dalam format empat digit angka (misal: 2024).";
            errorElement.style.display = 'block';
            return false; // Mencegah form terkirim
        }
        
        errorElement.style.display = 'none';
        return true; // Form terkirim ke proses.php
    }

    // Menghilangkan pesan error saat user mulai mengetik
    document.getElementById('tahun').addEventListener('input', function() {
        document.getElementById('tahunError').style.display = 'none';
    });
</script> -->

</body>
</html>