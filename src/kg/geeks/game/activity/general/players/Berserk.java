package kg.geeks.game.activity.general.players;

import kg.geeks.game.activity.general.RPG_Game;

public class Berserk extends Hero{
    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        int revers = boss.getDamage() / 2;
            boss.setHealth(boss.getHealth() - this.getDamage() + revers);
            int hi =  this.getDamage() + revers;
            System.out.println("Berserk нанес ему урон " + hi);
        }
    }
