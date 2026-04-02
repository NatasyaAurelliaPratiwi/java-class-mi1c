/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Natasya_260326;

/**
 *
 * @author LAB-SI-PC
 */

    import javax.swing.JOptionPane;

    public class NilaiJOption{
    public static void main(String[] args) {

        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai 1:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai 2:"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai 3:"));

        double rata = (n1 + n2 + n3) / 3;

        String hasil;

        if (rata >= 60) {
            hasil = " Lulus";
        } else {
            hasil = " Tidak Lulus";
        }

        JOptionPane.showMessageDialog(null, "Rata-rata: " + rata + "\n" + hasil);
    }
}

