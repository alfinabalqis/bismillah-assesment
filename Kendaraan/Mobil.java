/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author Lenovo
 */
public class Mobil {
    private String merek, noPlat;
    private long tahunKeluaran;

    public Mobil(String merek, String noPlat, long tahunKeluaran) {
        this.merek = merek;
        this.noPlat = noPlat;
        this.tahunKeluaran = tahunKeluaran;
    }

    public String getMerek() {
        return merek;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public long getTahunKeluaran() {
        return tahunKeluaran;
    }
    
    
    
    
}
