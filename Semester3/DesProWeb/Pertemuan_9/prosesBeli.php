<?php
    if(isset($_POST["beliNovel"]) && isset($_POST["beliBuku"])) {
        // sanitize and cast to int
        $novel = (int) $_POST["beliNovel"];
        $buku = (int) $_POST["beliBuku"];

        // set cookies for 1 day
        setcookie("beliNovel", $novel, time() + 86400, "/");
        setcookie("beliBuku", $buku, time() + 86400, "/");

        // redirect after setting cookies
        header("Location: keranjangBelanja.php");
        exit;
    }
?>