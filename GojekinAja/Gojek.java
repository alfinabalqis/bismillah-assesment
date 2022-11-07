/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GojekinAja;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Gojek {
    private ArrayList<Member> mlList = new ArrayList<>();
    
    public static void main(String[] args){
        new Gojek().runThis();
    }    
    
    void runThis(){
       addDriver("1", "Becky", "0811", "D 1 A", "Motor", 100000);
       addDriver("2", "Adrian", "0812", "B 15 A", "Motor", 50000);
       addDriver("3", "Begra", "0813", "J 45A LHO", "Motor", 0);
       addCustomer("4", "Eva", "0814", 100000);
       addCustomer("5", "Celia", "0815", 0);
       addCustomer("6", "Latjuba", "0816", 200000);
       addCustomer("7", "Lesmana", "0817", 0);
       
//       viewCustomer();
//       cekId("8");
       viewDriver("1");
    
    }
    
    public void addDriver(String id, String nama, String telepon, String platNo,String jenisKendaraan, double saldo){
        mlList.add(new Driver(id, nama, telepon, platNo, jenisKendaraan, saldo));
    }
    
    public void addCustomer(String id, String nama, String telepon, double saldo){
        mlList.add(new Customer(id, nama, telepon, saldo));
    }
    
//    public void cekId(String id){
////        if(id.equals(mlList[i])){}
//        boolean cekid = id.isEmpty();
//        if (cekid) System.out.println("Tidak ada data");
//        else System.out.println("data ada");
//    }
    
    
    
    public void topUpSaldo(String id, Double saldo){
        for(int i=1; i<mlList.size(); i++){
            if(mlList == null){
//                mlList[i] = ();
                break;
            }
        }
    }
    
    public void viewCustomer(){
    for (Member member : mlList) {
        
        if(member instanceof Customer) 
            System.out.println(member);
        }
    }
    
    public void viewDriver(String id){
        for (Member member : mlList) {
            if (id.equalsIgnoreCase(id)) {
                if (member instanceof Driver) {
                    System.out.println(member);
                }
        }
    }  
    
//    public void cekId(String id) {
//        for (Member member : mlList) {
//            if (id.equalsIgnoreCase(id)) {
//                if (member instanceof Customer) {
//                    System.out.println("Merupakan data Customer");
//                }
//            } else if (id.equalsIgnoreCase(id)) {
//                if (member instanceof Driver) {
//                    System.out.println("merupakan data driver");
//                }
//            } 
//            else{
//                System.out.println("Data Tidak Ditemukan");
//            }
//            
//        }
//        }
    }
}
