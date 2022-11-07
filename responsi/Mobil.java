/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author Lenovo
 */
public class Mobil extends Kendaraan {
    private String jumlahPintu;

    public Mobil(String nama, String brand, String jumlahPintu) {
        super(nama, brand); // extend dari kelas parent
        this.jumlahPintu = jumlahPintu;
    }

//    @Override
    public void Display() {
//        System.out.println("Mobil dengan brand +" super.brand+);
    }
    
    
}
