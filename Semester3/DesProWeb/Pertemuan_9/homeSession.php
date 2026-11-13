<html>
    <head>
        <title>Halaman Home</title>
    </head>
    <body>
        <?php
            session_start();
            if ($_SESSION['status'] == 'login') {
                echo "Selamat datang " . $_SESSION['username'];
        ?>

        <?php
            } else {
                echo "Anda belum login,silahkan";
        ?>
            <a href="sessionLoginForm.html"> login</a>
            
        <?php
        }
        ?>
    </body>
</html>