<!DOCTYPE html>
<html>
    <head>
        <title>Contoh Form Dengan PHP</title>
    </head>
    <body>
        <h2> Form Contoh</h2>
        <form method="POST" action="proses_lanjut.php">
            <label for="buah"> Pilih Buah:</label>
            <select name="buah" id="buah">
                <option value="apel">Apel</option>
                <option value="pisangg"> Pisang</option>
                <option value="mangga">Mangga</option>
                <option value="jeruk">jeruk</option>
            </select>
    
            <br>
    
            <label>Pilih warna favorit</label> <br>
            <input type="checkbox" name="warna[]" value="merah">Merah <br>
            <input type="checkbox" name="warna[]" value="Biru">Biru <br>
            <input type="checkbox" name="warna[]" value="Hijau">hijau<br>
    
            <br>
    
            <label>Pilih jenis kelamin:</label>
            <input type="radio" name="jenis_kelamin" value="laki-laki"> laki-laki <br>
            <input type="radio" name="jenis_kelamin" value="Perempuan"> Perempuan <br>

            <br>

            <input type="submit" value="submit">
        </form>

    </body>
</html>