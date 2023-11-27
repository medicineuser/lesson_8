package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Magic extends Hero {
    private int plusDamage;
    public Magic(int health, int damage, int plusDamage, String name){
        super(health, damage, SuperAbility.PLUSDAMAGE, name);
        this.plusDamage = plusDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes){
        for (int i = 0; i < heroes.length; i++){
            if (heroes[i].getHealth() > 0 && heroes[i].getName() != "Rubick"){
                heroes[i].setDamage(heroes[i].getDamage() + this.plusDamage );
            }
        }
        System.out.println("--> Damage plused +2");
    }
}
