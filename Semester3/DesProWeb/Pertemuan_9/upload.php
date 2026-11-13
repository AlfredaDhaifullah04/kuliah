<?php
if (isset($_POST["submit"])) {
    $targerdir = "uploads/";
    $targetfile = $targerdir . basename($_FILES["myfile"]["name"]);
    $filetype = strtolower(pathinfo($targetfile, PATHINFO_EXTENSION));

    $allowedExtension = array ("txt", "pdf", "doc", "docx");
    $maxsize = 5*1024*1024;

    // Perbaikan: kondisi seharusnya file size <= maxsize
    if (in_array($filetype, $allowedExtension) && ($_FILES["myfile"]["size"] <= $maxsize)) {
        if (move_uploaded_file($_FILES["myfile"]["tmp_name"], $targetfile)) {
            echo "File berhasil diunggah<br>";
            
            // Membuat dan menampilkan thumbnail
            // createThumbnail($targetfile, $filetype, 200);
            
        } else {
            echo "Gagal mengunggah file";
        }
    } else {
        echo "File tidak valid atau melebihi ukuran maksimum yang diizinkan";
    }
}

// // Fungsi untuk membuat thumbnail
// function createThumbnail($sourceFile, $fileType, $newWidth) {
//     // Membuat nama file thumbnail
//     $thumbnailFile = "uploads/thumb_" . basename($sourceFile);
    
//     // Mendapatkan dimensi gambar asli
//     list($originalWidth, $originalHeight) = getimagesize($sourceFile);
    
//     // Menghitung tinggi baru secara proporsional
//     $newHeight = intval(($originalHeight / $originalWidth) * $newWidth);
    
//     // Membuat gambar resource berdasarkan tipe file
//     switch($fileType) {
//         case 'jpg':
//         case 'jpeg':
//             $sourceImage = imagecreatefromjpeg($sourceFile);
//             break;
//         case 'png':
//             $sourceImage = imagecreatefrompng($sourceFile);
//             break;
//         case 'gif':
//             $sourceImage = imagecreatefromgif($sourceFile);
//             break;
//         default:
//             return false;
//     }
    
//     // Membuat canvas untuk thumbnail
//     $thumbnail = imagecreatetruecolor($newWidth, $newHeight);
    
//     // Preserve transparency untuk PNG dan GIF
//     if($fileType == 'png' || $fileType == 'gif') {
//         imagealphablending($thumbnail, false);
//         imagesavealpha($thumbnail, true);
//         $transparent = imagecolorallocatealpha($thumbnail, 255, 255, 255, 127);
//         imagefilledrectangle($thumbnail, 0, 0, $newWidth, $newHeight, $transparent);
//     }
    
//     // Resize gambar
//     imagecopyresampled($thumbnail, $sourceImage, 0, 0, 0, 0, 
//                       $newWidth, $newHeight, $originalWidth, $originalHeight);
    
//     // Simpan thumbnail
//     switch($fileType) {
//         case 'jpg':
//         case 'jpeg':
//             imagejpeg($thumbnail, $thumbnailFile, 90);
//             break;
//         case 'png':
//             imagepng($thumbnail, $thumbnailFile, 8);
//             break;
//         case 'gif':
//             imagegif($thumbnail, $thumbnailFile);
//             break;
//     }
    
//     // Menampilkan thumbnail
//     echo "<h3>Thumbnail Gambar (Lebar: {$newWidth}px, Tinggi: {$newHeight}px):</h3>";
//     echo "<img src='$thumbnailFile' alt='Thumbnail' style='border: 2px solid #ddd; border-radius: 5px;'>";
//     echo "<br><small>File: " . basename($thumbnailFile) . "</small>";
    
//     // Bersihkan memory
//     imagedestroy($sourceImage);
//     imagedestroy($thumbnail);
    
//     return true;
// }
?>