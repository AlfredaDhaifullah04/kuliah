/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author MAHESA
 */
import javax.swing.*;
public class HelloGUI {

    public static void main(String[] args) {
        // Todo code aplication logic here
        JFrame frame;
        frame = new JFrame ("ini percobaan HelloGui Frame");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600,300);
                frame.setLocation(200,200); //x,y tampilan pada winddows
                // frame.setLocationRelativeTo(null); // menempatkan frame di tengah-tengah layar
                frame.setVisible(true);// untku menampilkan frame
    }
}
