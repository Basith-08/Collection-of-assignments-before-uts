/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;

/**
 *
 * @author asfin
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TugasPertama {

    //    Menampilkan popUp nama
    public static void main(String[] args) {
        
        Scanner name = new Scanner(System.in);
        System.out.print("Nama : ");
        String usrName = name.nextLine(); // Membaca nilai String dari pengguna
        
        Scanner matKul = new Scanner(System.in);
        System.out.print("Saya sedang mengikuti praktikum : ");
        String study = matKul.nextLine();
        
        
        JOptionPane.showMessageDialog(null, "Nama saya adalah " + usrName + " Saya sedang mengikuti praktikum " + study);
        
        
    }
    
}
