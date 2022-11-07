/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MemberTim;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Tim {
    private String nama;
    private ArrayList<Member> listMember = new ArrayList<>();

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMember(Member member) {
        listMember.add(member);
    }

    public String getNama() {
        return nama;
    }
    
    public void displayFullMember(){
        for(Member member: listMember){
            if(!(member instanceof Trainee))
                member.display();
        }
    }
    public void displayTrainee(){
        for(Member member: listMember){
            if(member instanceof Trainee)
                member.display();
        }
    }
}
