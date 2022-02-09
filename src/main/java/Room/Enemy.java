package Room;

import interfaces.IAttack;

public abstract class Enemy extends Objective implements IAttack {

    private int health;
    private int damageInflicted;

    public Enemy(int xP,int health, int damageInflicted) {
        super(xP);
        this.health = health;
        this.damageInflicted = damageInflicted;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamageInflicted() {
        return damageInflicted;
    }

    public void setDamageInflicted(int damageInflicted) {
        this.damageInflicted = damageInflicted;
    }
}
