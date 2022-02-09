package weapons;

import interfaces.IFight;

public abstract class Weapon implements IFight {

    private String type;
    private int damageInflicted;

    public Weapon(int damageInflicted) {
        this.type = "";
        this.damageInflicted = damageInflicted;
    }

    public String getType() {
        return type;
    }

    public int getDamageInflicted() {
        return damageInflicted;
    }

    public void setType(String type) {
        this.type = type;
    }
}
