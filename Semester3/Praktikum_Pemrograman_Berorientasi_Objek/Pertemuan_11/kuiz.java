import javax.swing.*;
import java.awt.*;

public class kuiz extends JFrame {
    public kuiz() {
        setTitle("Aplikasi Pembelanjaan");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    // Deklarasi komponen utama
    JTextField txtNama = new JTextField();
    JComboBox<String> cbBarang = new JComboBox<>(new String[]{"Buku", "Pensil", "Penghapus", "Pulpen", "Penggaris"});
    JTextField txtHarga = new JTextField();
    JSpinner spinnerJumlah = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
    JCheckBox cbMember = new JCheckBox("Member (Diskon 10%)");
    JPasswordField pfPassword = new JPasswordField();
    JRadioButton rbTunai = new JRadioButton("Tunai");
    JRadioButton rbKredit = new JRadioButton("Kredit");
    ButtonGroup groupBayar = new ButtonGroup();
    groupBayar.add(rbTunai);
    groupBayar.add(rbKredit);
    JSlider sliderDiskon = new JSlider(0, 20, 0);
    sliderDiskon.setMajorTickSpacing(5);
    sliderDiskon.setPaintTicks(true);
    sliderDiskon.setPaintLabels(true);
    JTextArea taCatatan = new JTextArea(2, 15);
    JScrollPane scrollCatatan = new JScrollPane(taCatatan);
    JButton btnHitung = new JButton("Hitung Total");
    JButton btnReset = new JButton("Reset");
    JTextField txtTotal = new JTextField();
    txtTotal.setEditable(false);
    String[] columnNames = {"Nama Pelanggan", "Barang", "Jumlah", "Harga", "Total"};
    javax.swing.table.DefaultTableModel tableModel = new javax.swing.table.DefaultTableModel(columnNames, 0);
    JTable table = new JTable(tableModel);
    JScrollPane scrollTable = new JScrollPane(table);
    JProgressBar progressBar = new JProgressBar();
    progressBar.setStringPainted(true);
    JLabel lblStatus = new JLabel("");

    // Tooltips
    txtNama.setToolTipText("Masukkan nama pelanggan");
    cbBarang.setToolTipText("Pilih barang yang ingin dibeli");
    txtHarga.setToolTipText("Masukkan harga barang");
    spinnerJumlah.setToolTipText("Pilih jumlah barang");
    cbMember.setToolTipText("Centang jika Anda member");
    pfPassword.setToolTipText("Masukkan password member jika ada");
    sliderDiskon.setToolTipText("Diskon tambahan (0-20%)");
    taCatatan.setToolTipText("Catatan pembelian");

    // MenuBar
    JMenuBar menuBar = new JMenuBar();
    JMenu menuFile = new JMenu("File");
    JMenuItem menuOpen = new JMenuItem("Open");
    JMenuItem menuExit = new JMenuItem("Exit");
    menuFile.add(menuOpen);
    menuFile.add(menuExit);
    menuBar.add(menuFile);
    setJMenuBar(menuBar);

    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

    // Panel Data Pelanggan
    JPanel panelPelanggan = new JPanel(new GridLayout(1, 2, 10, 10));
    panelPelanggan.add(new JLabel("Nama Pelanggan:"));
    panelPelanggan.add(txtNama);
    mainPanel.add(panelPelanggan);

    // Panel Barang
    JPanel panelBarang = new JPanel(new GridLayout(1, 2, 10, 10));
    panelBarang.add(new JLabel("Nama Barang:"));
    panelBarang.add(cbBarang);
    mainPanel.add(panelBarang);

    // Panel Harga dan Jumlah
    JPanel panelHargaJumlah = new JPanel(new GridLayout(1, 4, 10, 10));
    panelHargaJumlah.add(new JLabel("Harga Barang:"));
    panelHargaJumlah.add(txtHarga);
    panelHargaJumlah.add(new JLabel("Jumlah:"));
    panelHargaJumlah.add(spinnerJumlah);
    mainPanel.add(panelHargaJumlah);

    // Panel Member dan Password
    JPanel panelMember = new JPanel(new GridLayout(1, 4, 10, 10));
    panelMember.add(cbMember);
    panelMember.add(new JLabel("Password Member:"));
    panelMember.add(pfPassword);
    panelMember.add(new JLabel(""));
    mainPanel.add(panelMember);

    // Panel Metode Pembayaran
    JPanel panelBayar = new JPanel();
    panelBayar.add(new JLabel("Metode Pembayaran:"));
    panelBayar.add(rbTunai);
    panelBayar.add(rbKredit);
    mainPanel.add(panelBayar);

    // Panel Diskon
    JPanel panelDiskon = new JPanel(new GridLayout(1, 2, 10, 10));
    panelDiskon.add(new JLabel("Diskon Tambahan:"));
    panelDiskon.add(sliderDiskon);
    mainPanel.add(panelDiskon);

    // Panel Catatan
    JPanel panelCatatan = new JPanel(new GridLayout(1, 2, 10, 10));
    panelCatatan.add(new JLabel("Catatan:"));
    panelCatatan.add(scrollCatatan);
    mainPanel.add(panelCatatan);

    // Panel Tombol
    JPanel panelTombol = new JPanel();
    panelTombol.add(btnHitung);
    panelTombol.add(btnReset);
    mainPanel.add(panelTombol);

    // Panel Total
    JPanel panelTotal = new JPanel(new GridLayout(1, 2, 10, 10));
    panelTotal.add(new JLabel("Total Harga:"));
    panelTotal.add(txtTotal);
    mainPanel.add(panelTotal);

    // Panel Riwayat Belanja
    JPanel panelTable = new JPanel(new BorderLayout());
    panelTable.add(new JLabel("Riwayat Belanja:"), BorderLayout.NORTH);
    panelTable.add(scrollTable, BorderLayout.CENTER);
    mainPanel.add(panelTable);

    // Panel Progress
    JPanel panelProgress = new JPanel(new GridLayout(1, 2, 10, 10));
    panelProgress.add(new JLabel("Progress:"));
    panelProgress.add(progressBar);
    mainPanel.add(panelProgress);


        // Tooltips
        txtNama.setToolTipText("Masukkan nama pelanggan");
        cbBarang.setToolTipText("Pilih barang yang ingin dibeli");
        txtHarga.setToolTipText("Masukkan harga barang");
        spinnerJumlah.setToolTipText("Pilih jumlah barang");
        cbMember.setToolTipText("Centang jika Anda member");
        pfPassword.setToolTipText("Masukkan password member jika ada");
        sliderDiskon.setToolTipText("Diskon tambahan (0-20%)");
        taCatatan.setToolTipText("Catatan pembelian");

    add(mainPanel, BorderLayout.CENTER);
    add(lblStatus, BorderLayout.SOUTH);

        // Event
        btnHitung.addActionListener(e -> {
            try {
                double harga = Double.parseDouble(txtHarga.getText());
                int jumlah = (Integer) spinnerJumlah.getValue();
                double total = harga * jumlah;
                if (cbMember.isSelected()) {
                    total *= 0.9;
                }
                total *= (1 - sliderDiskon.getValue() / 100.0);
                txtTotal.setText(String.format("%.2f", total));
                lblStatus.setText("Total harga berhasil dihitung.");
                progressBar.setValue(100);

                // Tambahkan ke riwayat belanja
                String namaPelanggan = txtNama.getText();
                String barang = cbBarang.getSelectedItem().toString();
                tableModel.addRow(new Object[]{namaPelanggan, barang, jumlah, harga, String.format("%.2f", total)});
            } catch (NumberFormatException ex) {
                lblStatus.setText("Input harga/jumlah tidak valid!");
                progressBar.setValue(0);
            }
        });

        btnReset.addActionListener(e -> {
            txtNama.setText("");
            txtHarga.setText("");
            txtTotal.setText("");
            spinnerJumlah.setValue(1);
            cbMember.setSelected(false);
            pfPassword.setText("");
            taCatatan.setText("");
            sliderDiskon.setValue(0);
            rbTunai.setSelected(false);
            rbKredit.setSelected(false);
            lblStatus.setText("");
            progressBar.setValue(0);
            // Kosongkan riwayat belanja
            tableModel.setRowCount(0);
        });

        menuExit.addActionListener(e -> System.exit(0));
        menuOpen.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                lblStatus.setText("File dipilih: " + fileChooser.getSelectedFile().getName());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new kuiz().setVisible(true);
        });
    }
}
