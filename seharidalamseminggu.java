/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package natasya_020426;

/**
 *
 * @author LAB-SI-PC
 */
public class seharidalamseminggu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Menggunakan for-loop:");
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        System.out.println("\nMenggunakan while-loop:");
        int i = 0;
        while (i < days.length) {
            System.out.println(days[i]);
            i++;
        }

        System.out.println("\nMenggunakan do-while:");
        int j = 0;
        do {
            System.out.println(days[j]);
            j++;
        } while (j < days.length);
    }
}