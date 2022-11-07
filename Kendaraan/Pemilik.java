/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author Lenovo
 */
public class Pemilik {
    private String nama, alamat;
    private Integer jumlahMobil;
    private String[] noPlatMobil = new String[5];

    public Pemilik(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public void jualMobil(Mobil mobil){
        for(int i=1; i<= noPlatMobil.length; i++){
            if(noPlatMobil[i].equals(mobil.getNoPlat())){
                noPlatMobil[i] = null;
                break;
            }
        }
    }
    
    public void beliMobil(Mobil mobil){
        for(int i=1; i<noPlatMobil.length; i++){
            if(noPlatMobil == null){
                noPlatMobil[i] = mobil.getNoPlat();
                break;
            }
        }
    }

    public String getNama() {
        return this.nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public Integer getJumlahMobil() {
        return this.jumlahMobil;
    }

    public String[] getNoPlatMobil() {
        return noPlatMobil;
    }
    
    
    
    
    
}
