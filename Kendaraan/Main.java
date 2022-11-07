/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pemilik pemilik = new Pemilik("Zai aja", "Bojongsoang, Bandung");
        
        int opsi;
        
        do{
            System.out.print("\n1. Beli Mobil"
                    + "\n2. Jual Mobil"
                    + "\n3. Display Mobil"
                    + "\n4. Exit"
                    + "\nPilihan: ");

            opsi = sc.nextInt();
            
            switch(opsi){
                case 1:
                    System.out.print("Masukkan merk mobil : ");
                    String merek = sc.next();
                    System.out.print("Masukkan warna mobil :");
                    String warna = sc.next();
                    System.out.print("Mauskkan tahun keluaran mobil : ");
                    Long tahun = sc.nextLong();
                    
                    Mobil mobil = new Mobil(merek,warna,tahun);
                    pemilik.beliMobil(mobil);
                    break;
                case 2:break;
                case 3:break;
                case 4:break;
                default:
            
            }
        
        
        }
        while(false);
        
        Pemilik orang = new Pemilik("Wakwaw", "Bojongsoang, Bandung");
        Mobil avanza = new Mobil("Toyota", "B 3901", 2013);
        Mobil xenia = new Mobil("Daihatsu", "B 1235", 2006);
        Mobil jazz = new Mobil("Honda", "A 5121", 2017);
        Mobil carry = new Mobil("Suzuki", "Z 9121", 2004);
        Mobil veyron = new Mobil("Buggati", "F 1512", 2006);
        
        orang.beliMobil(avanza);
        orang.beliMobil(xenia);
        orang.beliMobil(jazz);
        orang.beliMobil(carry);
        orang.beliMobil(veyron);
        
        System.out.println("\nNama Pemilik\t:\t\t" + orang.getNama());
        System.out.println("Alamat Pemilik\t:\t\t" + orang.getAlamat());
        System.out.println(orang.getNoPlatMobil());
        
        orang.jualMobil(carry);
        
        System.out.println("\nNama Pemilik\t:\t\t" + orang.getNama());
        System.out.println("Alamat Pemilik\t:\t\t" + orang.getAlamat());
        System.out.println(orang.getNoPlatMobil());
    }
}
