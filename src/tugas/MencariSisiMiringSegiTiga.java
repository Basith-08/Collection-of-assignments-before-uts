package tugas;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MencariSisiMiringSegiTiga {

    public static void main(String[] args) {

        double miring;

        Scanner alas = new Scanner(System.in); // Untuk mendapatkan inputan pengguna
        System.out.print("Alas : ");
        int alasSegiTiga = alas.nextInt();

        Scanner tinggi = new Scanner(System.in);
        System.out.print("TInggi : ");
        int tinggiSegiTiga = tinggi.nextInt();

        miring = Math.pow(alasSegiTiga, 2) + Math.pow(tinggiSegiTiga, 2);

        JOptionPane.showMessageDialog(null, "Panjang sisi miring : " + Math.sqrt(miring));
    }
}
