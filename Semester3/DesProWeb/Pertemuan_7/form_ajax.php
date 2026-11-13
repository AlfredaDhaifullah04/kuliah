<!DOCTYPE html>
<html>
    <head>
        <title>Contoh Form Dengan PHP</title>
        <script src= "https://code.jquery.com/jquery-3.6.0.min.js"></script>
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

        <div id="hasil">
            <!-- hasil akan ditampilkan disini -->
        </div>

        <script>
            $(document).ready(function() {
                $("myForm").submit(function(e) {
                    e.preventDefault(); //mencegah pengiriman form secara Default

                    //mengumpulkan data form
                    var formData = $("#myForm").serialize();

                    //kirim data ke server php
                    $.ajax({
                        url : "proses_lanjut.php",
                        type: "POST",
                        data: formData,
                        success:function(response) {
                            // tampilkan hasul dari server di div "hasil"
                            $("#hasil").html(response);
                        }
                    });
                });
            });
        </script>
    </body>
</html>