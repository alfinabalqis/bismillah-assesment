/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MemberTim;

/**
 *
 * @author Lenovo
 */
public class Trainee extends Member {
    private int lamaTraining;
    
    public Trainee(String nama, int umur, int lamaTraining) {
        super(nama, umur);
        this.lamaTraining = lamaTraining;
    }

    public int getLamaTraining() {
        return this.lamaTraining;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Lama Traing : "+ lamaTraining);
    }
}
