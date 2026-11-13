<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Data Dosen</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            background-color: #f5f5f5;
        }
        
        table {
            border-collapse: collapse;
            width: 400px;
            background-color: white;
            margin: 0 auto;
        }
        
        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: left;
        }
        
        th {
            background-color: #f2f2f2;
            width: 120px;
        }
        
        .table-title {
            text-align: center;
            margin-bottom: 15px;
            font-size: 18px;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="table-title">Data Dosen</div>
    
    <table>
        <?php
        $Dosen = [
            'nama' => 'Elok Nur Hamdana',
            'domisili' => 'Malang',
            'jenis_kelamin' => 'Perempuan'
        ];
        ?>
        
        <tr>
            <th>Nama</th>
            <td><?php echo $Dosen['nama']; ?></td>
        </tr>
        
        <tr>
            <th>Domisili</th>
            <td><?php echo $Dosen['domisili']; ?></td>
        </tr>
        
        <tr>
            <th>Jenis Kelamin</th>
            <td><?php echo $Dosen['jenis_kelamin']; ?></td>
        </tr>
    </table>
</body>
</html>