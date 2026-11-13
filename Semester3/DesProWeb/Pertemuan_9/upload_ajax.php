<?php
// Handle multiple image uploads via AJAX. Saves files into 'uploads/' directory.
if (!empty($_FILES['files'])) {
    $allowed_ext = array('jpg', 'jpeg', 'png', 'gif', 'webp');
    $max_size = 2 * 1024 * 1024; // 2 MB
    $messages = array();

    // Ensure uploads directory exists
    $uploadDir = __DIR__ . DIRECTORY_SEPARATOR . 'uploads' . DIRECTORY_SEPARATOR;
    if (!is_dir($uploadDir)) {
        mkdir($uploadDir, 0755, true);
    }

    // Normalize files array
    $files = $_FILES['files'];
    $count = is_array($files['name']) ? count($files['name']) : 0;

    for ($i = 0; $i < $count; $i++) {
        $name = $files['name'][$i];
        $tmp = $files['tmp_name'][$i];
        $size = $files['size'][$i];
        $error = $files['error'][$i];

        if ($error !== UPLOAD_ERR_OK) {
            $messages[] = htmlspecialchars($name) . ' - Gagal mengunggah (error code: ' . $error . ').';
            continue;
        }

        // get extension
        $ext = strtolower(pathinfo($name, PATHINFO_EXTENSION));
        if (!in_array($ext, $allowed_ext)) {
            $messages[] = htmlspecialchars($name) . ' - Format tidak diizinkan. Hanya: ' . implode(', ', $allowed_ext) . '.';
            continue;
        }

        if ($size > $max_size) {
            $messages[] = htmlspecialchars($name) . ' - Ukuran melebihi 2 MB.';
            continue;
        }

        // generate unique name to avoid collisions
        $safeName = preg_replace('/[^A-Za-z0-9._-]/', '_', pathinfo($name, PATHINFO_FILENAME));
        $newName = $safeName . '_' . time() . '_' . bin2hex(random_bytes(4)) . '.' . $ext;
        $destination = $uploadDir . $newName;

        if (move_uploaded_file($tmp, $destination)) {
            $messages[] = htmlspecialchars($name) . ' - Berhasil diunggah sebagai: ' . htmlspecialchars($newName) . '.';
        } else {
            $messages[] = htmlspecialchars($name) . ' - Gagal menyimpan file.';
        }
    }

    // Return simple HTML with messages
    echo '<ul>';
    foreach ($messages as $m) {
        echo '<li>' . $m . '</li>';
    }
    echo '</ul>';
}
?>