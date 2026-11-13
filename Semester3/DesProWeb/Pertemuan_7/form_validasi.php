<!DOCTYPE html>
<html>
    <head>
        <title> Form input dengan validasi</title>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    </head>
    <body>
        <h1> Form Input dengan validasi</h1>
        <form method="post" action="proses_validasi.php">
            <label for="nama"> Nama:</label>
            <input type="text" id="nama" name="nama">
            <br>
    
            <label for="email"> Email:</label>
            <input type="text" id="email" name="email">
            <br>
    
            <input type="submit" value="submit">
        </form>

        <script>
            $(doocument).ready(function () {
                $("#myForm").submit(function (event) {
                    var nama = $("#nama").val();
                    var email = $("#email").val();
                    var valid = true;

                    if (nama == "" ) {
                        $("#nama-error").text("Nama harus diisi.");
                    } else {
                        $("#nama-error").text("");
                    }

                    if (email === "") {
                        $("#email-error").text("Email harus diisi.");
                        valid = false;
                    } else {
                        $("#email-error").text("");
                    }

                    if (valid) {
                        (!event.preventDefault());
                    }
                });
            });
        </script>
    </body>
</html>