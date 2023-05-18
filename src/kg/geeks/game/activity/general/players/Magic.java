package kg.geeks.game.activity.general.players;

import kg.geeks.game.activity.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage,SuperAbility.MAGIC_POWER);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        int plusDamage = 5;
        for (int i = 0; i < hero.length ; i++) {
            hero[i].setDamage(plusDamage + hero[i].getDamage());
            System.out.println("Magic увеличил атаку героя " + hero[i].getClass().getSimpleName() + " на " +  plusDamage);
        }
    }
}
