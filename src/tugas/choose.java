/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import javax.swing.JOptionPane;

public class choose {

    public static void main(String[] args) {
        while (true) {
            try {
                String pilih = JOptionPane.showInputDialog("Pilih a, b, atau c ");
                switch (pilih) {
                    case "a":
                        JOptionPane.showMessageDialog(null, "Informatika");
                        break;
                    case "b":
                        JOptionPane.showMessageDialog(null, "Sistem Informasi");
                        break;
                    case "c":
                        JOptionPane.showMessageDialog(null, "Teknologi Informasi");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Pilihan kamu salah");
                }
            } catch (Exception e) {
                
            }
        }
    }
}
