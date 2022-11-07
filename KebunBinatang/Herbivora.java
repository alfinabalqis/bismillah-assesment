/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KebunBinatang;

/**
 *
 * @author Lenovo
 */
public class Herbivora extends Hewan {
    private String namaHewan;

    public Herbivora(String habitat, String namaHewan) {
        super(habitat);
        this.namaHewan = namaHewan;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }
    
    @Override
    public String toString() {   
        return "Nama hewan \t: " + namaHewan + "\nJenis hewan \t:Herbivora " + "\nHabitanya \t:" + super.habitat;  
    }
}
