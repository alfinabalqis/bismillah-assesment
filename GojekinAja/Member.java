/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GojekinAja;

/**
 *
 * @author Lenovo
 */
public class Member {
    private String id, nama, telepon;
    private Double saldo;

    public Member(String id, String nama, String telepon, Double saldo) {
        this.id = id;
        this.nama = nama;
        this.telepon = telepon;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getTelepon() {
        return this.telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    public String getId() {
        return this.id;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Member{" + "id=" + id + ", nama=" + nama + ", telepon=" + telepon + ", saldo=" + saldo + '}';
    }

    
}
