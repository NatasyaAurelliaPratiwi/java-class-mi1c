/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package natasya_18juni26;

/**
 *
 * @author LAB-SI-PC
 */
public class MahasiswaNilaiExample {
    public static void main(String[] args){
   MahasiswaNilai m = new MahasiswaNilai();

        m.setNim("2501092025");
        m.setNama("Natasya");
        m.setAlamat("Padang");
        m.setTugas(90.0);
        m.setUts(90.0);
        m.setUas(85.0);

        System.out.println("NIM          : " + m.getNim());
        System.out.println("Nama         : " + m.getNama());
        System.out.println("Alamat       : " + m.getAlamat());
        System.out.println("Nilai Tugas  : " + m.getTugas());
        System.out.println("Nilai UTS    : " + m.getUts());
        System.out.println("Nilai UAS    : " + m.getUas());
        System.out.println("Nilai Angka  : " + m.getNilaiAngka());
        System.out.println("Nilai Huruf  : " + m.getNilaiHuruf());
    }
}
