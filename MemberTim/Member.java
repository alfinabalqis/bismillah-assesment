/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MemberTim;

/**
 *
 * @author Lenovo
 */
public class Member {
    protected String nama;
    protected int umur;

    public Member(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void display(){
        System.out.println("Nama : " +nama+
                "\nUmur : " +umur);
    }
}
