/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author MAHESA
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NewInputForm extends JFrame {

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
        private JButton addButton; // tombol penjumlahan
    private JPanel panel;

    public NewInputForm() {
        createTextField();
        createButton();
            createAddButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

// method text field    
    private void createTextField() {
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai B: ");
        cLabel = new JLabel("Hasil: ");

        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

// method create button    
    private void createButton() {
        button = new JButton("Calculate"); // untuk membuat tombol "Calculate"

        class AddInterestListener implements ActionListener {
            // untuk event klik

            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(aField.getText());
                // mengambil inputan textbox
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil: " + c);
            }
        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }

        // method create add button
        private void createAddButton() {
            addButton = new JButton("Tambah"); // tombol penjumlahan

            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        int a = Integer.parseInt(aField.getText());
                        int b = Integer.parseInt(bField.getText());
                        int hasil = a + b;
                        cLabel.setText("Hasil: " + hasil);
                    } catch (NumberFormatException ex) {
                        cLabel.setText("Input tidak valid!");
                    }
                }
            });
        }

    private void createPanel() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(addButton); // tambahkan tombol penjumlahan ke panel
        panel.add(cLabel);
        add(panel);
    }

    public static void main(String[] args) {
        JFrame frame = new NewInputForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
