/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author asfin
 */
import java.util.Scanner;

public class mencariLuasLIngkaran {
    public static void main(String[] args) {
        
        double luas;
        
        Scanner jari_jari = new Scanner(System.in);
        System.out.print("Java LuasLingkaran : ");
        int jjLingkaran = jari_jari.nextInt();
        
        luas = Math.PI * Math.pow(jjLingkaran, 2);
        
        System.out.println("Luas Lingkaran = " + luas);
    }
}
