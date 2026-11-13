<!-- <?php
// okasi penyimpanan file yang diunggah
$targetDirectory = "documents/";

//Periksa apakah direktori penyimpanan ada, jika tidak ada maka buat
if (!file_exists($targetDirectory)) {
    mkdir($targetDirectory,0777, true);
}

if ($_FILES["files"]["name"] [0]) {
    $totalFiles = count($_FILES['files']['name']);

    // Loop melalui semua file yang diunggah 
    for ($i = 0; $i < $totalFiles; $i++) {
        $fileName = $_FILES['files']['name'][$i];
        $targetFile = $targetDirectory . $fileName;

        // pindahkan file yang diunggah ke direktori penyimpanan 
        if (move_uploaded_file($_FILES['files']['tmp_name'][$i], $targetFile))  {
            echo "File $fileName berhasil diunggah .<br>";
        } else {
            echo "Gagal mengunggah file $fileName. <br>";
        }
    }
} else {
    echo "Tidak ada file yang diunggah.";
} 
?>-->



<?php
// lokasi penyimpanan file yang diunggah
$targetDirectory = "images/";

// Periksa apakah direktori penyimpanan ada, jika tidak ada maka buat
if (!file_exists($targetDirectory)) {
    mkdir($targetDirectory, 0777, true);
}

// Jenis file gambar yang diizinkan
$allowedTypes = ['jpg', 'jpeg', 'png', 'gif', 'webp'];
$maxFileSize = 5 * 1024 * 1024; // 5MB

if ($_FILES["files"]["name"][0]) {
    $totalFiles = count($_FILES['files']['name']);
    $uploadResults = [];

    // Loop melalui semua file yang diunggah 
    for ($i = 0; $i < $totalFiles; $i++) {
        $fileName = $_FILES['files']['name'][$i];
        $fileSize = $_FILES['files']['size'][$i];
        $fileTmpName = $_FILES['files']['tmp_name'][$i];
        $fileError = $_FILES['files']['error'][$i];
        $fileType = strtolower(pathinfo($fileName, PATHINFO_EXTENSION));
        
        $targetFile = $targetDirectory . basename($fileName);
        
        // Validasi file
        $isValid = true;
        $errorMessage = "";
        
        // Cek apakah file adalah gambar asli
        $checkImage = getimagesize($fileTmpName);
        if ($checkImage === false) {
            $isValid = false;
            $errorMessage = "File $fileName bukan gambar yang valid.";
        }
        
        // Cek ukuran file
        if ($fileSize > $maxFileSize) {
            $isValid = false;
            $errorMessage = "File $fileName terlalu besar. Maksimal 5MB.";
        }
        
        // Cek tipe file
        if (!in_array($fileType, $allowedTypes)) {
            $isValid = false;
            $errorMessage = "Tipe file $fileName tidak diizinkan. Hanya JPG, JPEG, PNG, GIF, dan WebP.";
        }
        
        // Cek error dari sistem
        if ($fileError !== UPLOAD_ERR_OK) {
            $isValid = false;
            $errorMessage = "Terjadi error saat upload file $fileName. Error code: $fileError";
        }
        
        // Cek apakah file sudah ada
        if (file_exists($targetFile)) {
            $isValid = false;
            $errorMessage = "File $fileName sudah ada.";
        }
        
        // Jika valid, pindahkan file
        if ($isValid) {
            // Generate nama file unik untuk menghindari konflik
            $newFileName = uniqid() . '_' . date('Ymd_His') . '.' . $fileType;
            $targetFile = $targetDirectory . $newFileName;
            
            if (move_uploaded_file($fileTmpName, $targetFile)) {
                $uploadResults[] = [
                    'status' => 'success',
                    'message' => "File $fileName berhasil diunggah sebagai $newFileName",
                    'file_name' => $newFileName
                ];
            } else {
                $uploadResults[] = [
                    'status' => 'error',
                    'message' => "Gagal mengunggah file $fileName."
                ];
            }
        } else {
            $uploadResults[] = [
                'status' => 'error',
                'message' => $errorMessage
            ];
        }
    }
    
    // Tampilkan hasil upload
    echo "<h3>Hasil Upload:</h3>";
    foreach ($uploadResults as $result) {
        $color = $result['status'] === 'success' ? 'green' : 'red';
        echo "<p style='color: $color;'><strong>" . 
             ($result['status'] === 'success' ? '✓' : '✗') . 
             " " . $result['message'] . "</strong></p>";
    }
    
} else {
    echo "<p style='color: orange;'>Tidak ada file yang diunggah.</p>";
}
?>

<!-- Form HTML untuk upload -->
<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Upload Gambar</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            max-width: 600px;
            margin: 50px auto;
            padding: 20px;
        }
        .upload-form {
            border: 2px dashed #ccc;
            padding: 30px;
            text-align: center;
            border-radius: 10px;
        }
        .file-input {
            margin: 20px 0;
        }
        .submit-btn {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .submit-btn:hover {
            background-color: #45a049;
        }
        .info {
            font-size: 12px;
            color: #666;
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <div class="upload-form">
        <h2>Upload Multiple Gambar</h2>
        <form action="" method="post" enctype="multipart/form-data">
            <div class="file-input">
                <input type="file" name="files[]" multiple accept=".jpg,.jpeg,.png,.gif,.webp" required>
            </div>
            <button type="submit" class="submit-btn">Upload Gambar</button>
        </form>
        <div class="info">
            <p><strong>Format yang didukung:</strong> JPG, JPEG, PNG, GIF, WebP</p>
            <p><strong>Ukuran maksimal per file:</strong> 5MB</p>
        </div>
    </div>
</body>
</html>