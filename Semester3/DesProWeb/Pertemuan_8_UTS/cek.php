<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Cek Digit Angka</title>
    <style>
        /* Sesuai referensi Jobsheet CSS (Box Model, Styling) */
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
        }

        .container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
            color: #555;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box; /* Sesuai Box Model CSS */
        }

        button {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #0056b3;
        }

        .error-message {
            color: red;
            font-size: 0.9em;
            margin-top: -10px;
            margin-bottom: 15px;
            display: none; /* Awalnya disembunyikan */
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Pengecekan Digit Angka</h2>
    
    <form action="cek_digit.php" method="POST" onsubmit="return validateForm()">
        <label for="angka">Masukkan Angka/Nomor:</label>
        <input type="text" id="angka" name="angka" placeholder="Contoh: 12345678" required>
        
        <p id="angkaError" class="error-message">Hanya boleh memasukkan digit angka (0-9).</p>

        <button type="submit">Cek Digit</button>
    </form>
</div>

<script>
    function validateForm() {
        // Ambil nilai input
        const angkaInput = document.getElementById('angka');
        const angkaValue = angkaInput.value;
        const errorElement = document.getElementById('angkaError');
        
        // Ekspresi Reguler untuk memastikan hanya digit 0-9
        const isOnlyDigits = /^\d+$/.test(angkaValue);
        
        if (angkaValue.trim() === "") {
            // Cek jika kosong
            errorElement.textContent = "Angka tidak boleh kosong.";
            errorElement.style.display = 'block';
            return false;
        } else if (!isOnlyDigits) {
            // Cek jika mengandung karakter non-digit
            errorElement.textContent = "Hanya boleh memasukkan digit angka (0-9).";
            errorElement.style.display = 'block';
            return false;
        } else {
            // Jika valid
            errorElement.style.display = 'none';
            return true; // Lanjutkan pengiriman form ke cek_digit.php
        }
    }

    // Menghilangkan pesan error saat user mengetik
    document.getElementById('angka').addEventListener('input', function() {
        document.getElementById('angkaError').style.display = 'none';
    });
</script>

</body>
</html>