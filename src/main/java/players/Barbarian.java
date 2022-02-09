package players;

import interfaces.IFight;

public class Barbarian extends Warrior {

    private int damageInflicted;

    public Barbarian(String name, IFight weapon) {
        super(name, weapon);
        this.damageInflicted = 2;
    }

    public int getDamageInflicted(){
        return this.damageInflicted;
    }
}
