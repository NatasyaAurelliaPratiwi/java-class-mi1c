/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package natasya160426;

/**
 *
 * @author LAB-SI-PC
 */
public class BukuAlamatExample {
    public static void main(String[] args) {
        
        BukuAlamat bukuAlamat = new BukuAlamat();
        bukuAlamat.setNama("Ali");
        bukuAlamat.setAlamat("Padang");
        bukuAlamat.setTelpon("0878254364");
        bukuAlamat.setEmail("ali@coba.com");
        data.insert(bukuAlamat, 0);
        BukuAlamat bukuAlamat2 = new BukuAlamat2();
        bukuAlamat2.setNama("Budi");
        bukuAlamat2.setAlamat("Padang");
        bukuAlamat2.setTelpon("093453657");
        bukuAlamat2.setEmail("budi@coba.com");
        data.insert(bukuAlamat2, 1);
        data.view();
  
    }
}

