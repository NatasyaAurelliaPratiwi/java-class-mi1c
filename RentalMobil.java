/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package natasya300426;

/**
 *
 * @author LAB-SI-PC
 */
public class RentalMobil {
    
    // Atribut
    String idSewa;
    String namaPenyewa;
    String jenisMobil;
    int lamaSewa;
    double hargaSewa;
    double biayaSewa;
    double biayaTambahan;
    double totalBayar;

    void setHargaSewa() {
        if (jenisMobil.equalsIgnoreCase("Avanza")) {
            hargaSewa = 300000;
        } else if (jenisMobil.equalsIgnoreCase("Innova")) {
            hargaSewa = 500000;
        } else if (jenisMobil.equalsIgnoreCase("Fortuner")) {
            hargaSewa = 800000;
        } else {
            hargaSewa = 0;
        }
    }

    void hitungTotal() {
        biayaSewa = hargaSewa * lamaSewa;
 
        if (lamaSewa > 5) {
            biayaTambahan = 0.1 * biayaSewa;
        } else {
            biayaTambahan = 0;
        }

        totalBayar = biayaSewa - biayaTambahan;
    }

    void tampilData() {
        System.out.println("ID Sewa        : " + idSewa);
        System.out.println("Nama Penyewa   : " + namaPenyewa);
        System.out.println("Jenis Mobil    : " + jenisMobil);
        System.out.println("Lama Sewa      : " + lamaSewa + " hari");
        System.out.println("Harga Sewa     : " + hargaSewa);
        System.out.println("Biaya Sewa     : " + biayaSewa);
        System.out.println("Diskon         : " + biayaTambahan);
        System.out.println("Total Bayar    : " + totalBayar);
    }
}

