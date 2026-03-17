/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;

/**
 *
 * @author LAB-SI-PC
 */
public class latihanmodul5_2 {
    public static void main(String[] args) {

        String word1 = JOptionPane.showInputDialog("Enter word 1");
        String word2 = JOptionPane.showInputDialog("Enter word 2");
        String word3 = JOptionPane.showInputDialog("Enter word 3");

        String hasil = word1 + " " + word2 + " " + word3;

        JOptionPane.showMessageDialog(null, hasil);
    }
}

