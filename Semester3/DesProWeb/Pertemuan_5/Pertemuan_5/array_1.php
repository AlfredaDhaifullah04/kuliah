<!DOCRYPE html>
<html>
    <head>
    </head>
    <body>
        <h2>Array Terindeks</h2>
        <?php
        $listDosen = ["Elok Nur Hamdana", "Unggul Pemenang", "Bagas Nugraha"];

        echo $listDosen[2] . "<br>";
        echo $listDosen[0] . "<br>";
        echo $listDosen[1] . "<br>";

        echo "== Menampilkan List Dosen Menggunakan Loop == "; echo "<br>";
        foreach ($listDosen as $nama) { 
            echo $nama . "<br>" ;
        }
        ?>
    </body>
</html>