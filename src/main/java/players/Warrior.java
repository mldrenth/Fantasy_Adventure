package players;

import interfaces.IFight;

public abstract class Warrior extends Player{

    private IFight weapon;

    public Warrior(String name, IFight weapon) {
        super(name);
        this.sethP(200);
        this.weapon = weapon;
    }

    public IFight getWeapon() {
        return weapon;
    }

    public void setWeapon(IFight weapon) {
        this.weapon = weapon;
    }
}
