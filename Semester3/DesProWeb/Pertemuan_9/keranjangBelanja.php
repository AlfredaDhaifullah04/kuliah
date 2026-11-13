<html>
    <head>
    </head>
    <body>
        <h2> Keranjang Belanja</h2>

        <?php
            // Use null coalescing to avoid undefined index warnings and cast to int
            $beliNovel = isset($_COOKIE['beliNovel']) ? (int) $_COOKIE['beliNovel'] : 0;
            $beliBuku = isset($_COOKIE['beliBuku']) ? (int) $_COOKIE['beliBuku'] : 0;

            echo "Jumlah novel: " . $beliNovel . "<br>";
            echo "Jumlah buku: " . $beliBuku;
        ?>
    </body>
</html>