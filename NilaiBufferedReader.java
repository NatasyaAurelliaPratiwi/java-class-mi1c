/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Natasya_260326;

/**
 *
 * @author LAB-SI-PC
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NilaiBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan nilai 1: ");
        double n1 = Double.parseDouble(br.readLine());

        System.out.print("Masukkan nilai 2: ");
        double n2 = Double.parseDouble(br.readLine());

        System.out.print("Masukkan nilai 3: ");
        double n3 = Double.parseDouble(br.readLine());

        double rata = (n1 + n2 + n3) / 3;

        System.out.println("Rata-rata: " + rata);

        if (rata >= 60) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
    }
}
