/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameCharacter;

/**
 *
 * @author Lenovo
 */
public class GameCharacter {
    private String name;
    private int lifePoint, attackHitPoint, attackKickPoint;

    public GameCharacter(String name, 
            int attackHitPoint, 
            int attackKickPoint) {
        this.name = name;
        this.lifePoint = 100;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public String getName() {
        return this.name;
    }

    public int getLifePoint() {
        return this.lifePoint;
    }
        
    public void hit(GameCharacter karB){
        karB.lifePoint-=  this.attackHitPoint;
    }
    
    public void kick(GameCharacter karB){
        karB.lifePoint -= this.attackKickPoint;
    }
    
}
