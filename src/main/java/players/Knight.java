package players;

import interfaces.IFight;

public class Knight extends Warrior {

    private int armor;

    public Knight(String name, IFight weapon) {
        super(name, weapon);
        this.armor = 50;
    }

    public int getArmor(){
        return this.armor;
    }
}
