/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameCharacter;

/**
 *
 * @author Lenovo
 */
public class Main {
   public static void main(String[] args){
        GameCharacter raiden = new GameCharacter("Raiden", 10, 20);
        GameCharacter subZero = new GameCharacter("Sub-Zero", 5, 25);
        
        System.out.println("Nama Pemain : " +raiden.getName());
        System.out.println("Nama pemain : " +subZero.getName());
        System.out.println("Darah Raiden : " +raiden.getLifePoint());
        System.out.println("Darah Raiden : " +subZero.getLifePoint());
        raiden.kick(subZero);
        System.out.println("");
        System.out.println("Darah Raiden : " +raiden.getLifePoint());
        System.out.println("Darah SubZero : " +subZero.getLifePoint());
        subZero.kick(raiden);
        System.out.println();
        System.out.println("Darah Raiden : " +raiden.getLifePoint());
        System.out.println("Darah SubZero : " +subZero.getLifePoint());
        
        for(int i =1; i<=3; i++){
            subZero.hit(raiden);
        }
        System.out.println();
        System.out.println("Darah Raiden : " +raiden.getLifePoint());
        System.out.println("Darah SubZero : " +subZero.getLifePoint());
        
        for(int i =1; i<=4; i++){
            raiden.kick(subZero);
        }
        System.out.println();
        System.out.println("Darah Raiden : " +raiden.getLifePoint());
        System.out.println("Darah SubZero : " +subZero.getLifePoint());
        
        System.out.print("Pemenangnya adalah : ");
        
        if(raiden.getLifePoint() > subZero.getLifePoint()){
            System.out.print(raiden.getName());
        } else{
            System.out.print(subZero.getName());
        }
        System.out.println();
   }
}
