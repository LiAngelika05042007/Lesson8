package kg.geeks.game.activity.general.players;

import kg.geeks.game.activity.general.RPG_Game;

public class Thor extends Hero {

    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.STUN);
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {



    }
}
