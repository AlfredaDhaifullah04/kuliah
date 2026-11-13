<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Validasi Email - HTML Aman</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 20px;
        }
        
        .container {
            background: white;
            border-radius: 15px;
            box-shadow: 0 20px 40px rgba(0,0,0,0.1);
            padding: 40px;
            width: 100%;
            max-width: 500px;
        }
        
        h1 {
            color: #333;
            text-align: center;
            margin-bottom: 10px;
            font-size: 28px;
        }
        
        .subtitle {
            text-align: center;
            color: #666;
            margin-bottom: 30px;
            font-size: 14px;
        }
        
        .form-group {
            margin-bottom: 25px;
        }
        
        label {
            display: block;
            margin-bottom: 8px;
            color: #333;
            font-weight: 600;
        }
        
        input[type="email"] {
            width: 100%;
            padding: 12px 15px;
            border: 2px solid #e1e5e9;
            border-radius: 8px;
            font-size: 16px;
            transition: all 0.3s ease;
        }
        
        input[type="email"]:focus {
            outline: none;
            border-color: #667eea;
            box-shadow: 0 0 0 3px rgba(102, 126, 234, 0.1);
        }
        
        button {
            width: 100%;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
            border: none;
            padding: 15px;
            border-radius: 8px;
            font-size: 16px;
            font-weight: 600;
            cursor: pointer;
            transition: transform 0.2s ease;
        }
        
        button:hover {
            transform: translateY(-2px);
        }
        
        .result {
            margin-top: 25px;
            padding: 20px;
            border-radius: 8px;
            text-align: center;
            font-weight: 500;
        }
        
        .success {
            background: #d4edda;
            color: #155724;
            border: 1px solid #c3e6cb;
        }
        
        .error {
            background: #f8d7da;
            color: #721c24;
            border: 1px solid #f5c6cb;
        }
        
        .info {
            background: #d1ecf1;
            color: #0c5460;
            border: 1px solid #bee5eb;
            font-size: 14px;
        }
        
        .email-display {
            font-weight: bold;
            margin: 10px 0;
            padding: 10px;
            background: rgba(255,255,255,0.5);
            border-radius: 5px;
            word-break: break-all;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Validasi Email</h1>
        <p class="subtitle">Form Validasi Alamat Email yang Aman</p>
        
        <form method="POST" action="">
            <div class="form-group">
                <label for="email">Alamat Email:</label>
                <input type="email" id="email" name="email" 
                       placeholder="contoh: user@example.com"
                       value="<?php echo isset($_POST['email']) ? htmlspecialchars($_POST['email'], ENT_QUOTES, 'UTF-8') : ''; ?>">
            </div>
            <button type="submit">Validasi Email</button>
        </form>

        <?php
        if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['email'])) {
            $email = $_POST['email'];
            $email_clean = htmlspecialchars($email, ENT_QUOTES, 'UTF-8');
            
            echo '<div class="result info">';
            echo '<strong>Email yang dimasukkan:</strong>';
            echo '<div class="email-display">' . $email_clean . '</div>';
            echo '</div>';
            
            // Memeriksa apakah input adalah email yang valid
            if (filter_var($email, FILTER_VALIDATE_EMAIL)) {
                echo '<div class="result success">';
                echo '✅ <strong>VALID</strong><br>';
                echo 'Format email valid dan aman untuk diproses.';
                echo '</div>';
                
                // Lanjutkan dengan pengolahan email yang aman
                // Contoh: menyimpan ke database, mengirim email, dll.
                echo '<div class="result info">';
                echo '<strong>Proses Lanjutan:</strong><br>';
                echo 'Email dapat diproses lebih lanjut secara aman.';
                echo '</div>';
                
            } else {
                echo '<div class="result error">';
                echo '❌ <strong>TIDAK VALID</strong><br>';
                echo 'Format email tidak valid. Silakan periksa kembali.';
                echo '</div>';
                
                // Tangani input yang tidak valid
                echo '<div class="result info">';
                echo '<strong>Penanganan Error:</strong><br>';
                echo 'Input tidak valid telah ditangani dengan aman.';
                echo '</div>';
            }
        } else {
            echo '<div class="result info">';
            echo 'Silakan masukkan alamat email untuk divalidasi.';
            echo '</div>';
        }
        ?>
        
        <div class="result info" style="margin-top: 20px; font-size: 12px;">
            <strong>Fitur Keamanan:</strong><br>
            ✅ Validasi format email<br>
            ✅ Sanitasi output dengan htmlspecialchars()<br>
            ✅ Pencegahan XSS attacks<br>
            ✅ Form handling yang aman
        </div>
    </div>
</body>
</html>