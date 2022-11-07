/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GojekinAja;

/**
 *
 * @author Lenovo
 */
public class Driver extends Member {
    private String platNo, jenisKendaraan;

    public Driver(String id, String nama, String telepon, String platNo, String jenisKendaraan, Double saldo) {
        super(id, nama, telepon, saldo);
        this.platNo = platNo;
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getPlatNo() {
        return platNo;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nDriver { " + 
                "platNo=" + platNo + 
                ", jenisKendaraan = " + jenisKendaraan + '}';
    }

    

    
    
}
