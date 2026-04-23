/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package natasya160426;

/**
 *
 * @author LAB-SI-PC
 */
public class BukuAlamatt {
    public class BukuAlamat {
    
    private String nama;
    private String alamat;
    private String Telpon;
    private String email;
    
    public BukuAlamat(String nama, String alamat, String Telpon, String email){
        this.nama = nama;
        this.alamat = alamat;
        this.Telpon = Telpon;
        this.email = email;
    }
        
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public String getTelpon() { return Telpon; }
    public String getEmail() { return email; }
    
    public void setNama(String nama) {this.nama = nama; }
    public void setAlamat(String alamat) {this.alamat = alamat; }
    public void setTelpon(String Telpon) {this.Telpon = Telpon; }
    public void setEmail(String email) {this.email = email; }

    }
}
