package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Thor extends Hero{
    private double stunChance = 0.5;
    public Thor(int health, int damage, String name){
        super(health, damage, SuperAbility.STUN, name);
    }
    public void applySuperPower(Boss boss , Hero[] heroes){
           if (Math.random() < stunChance && boss.getHealth() > 0 && boss.getDamage() != 0){
               boss.setDamage(0);
               System.out.println("--> Boss stunned this round");
           } else if(boss.getDamage() == 0){
               boss.setDamage(50);
           }
    }
}
