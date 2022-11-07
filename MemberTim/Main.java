/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MemberTim;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args){
        Tim t = new Tim();
        t.setNama("Tim");
        
        Member m1 = new Member("Alfina",2);
        Member m2 = new Member("Zai", 30);
        
        Trainee t1 = new Trainee("Zai lagi", 40,10);
        Trainee t2 = new Trainee("Zai aja", 30, 5);
        
        t.setMember(m1);
        t.setMember(m2);
        t.setMember(t1);
        t.setMember(t2);
        
        System.out.println("Full Member : ");
        t.displayFullMember();
        System.out.println();
        System.out.println("Full Trainee : ");
        t.displayTrainee();
    }
}
