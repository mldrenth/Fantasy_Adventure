package players;

import interfaces.ICast;
import interfaces.IDefend;

public abstract class Mage extends  Player{

    private int speed;
    private int power;
    private int mana;
    private IDefend creature;
    private ICast spell;
    private int hp;

    public Mage(String name, IDefend creature, ICast spell) {
        super(name);
        this.speed = 40;
        this.power = 25;
        this.mana = 80;
        this.creature = creature;
        this.spell = spell;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPower() {
        return power;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public IDefend getCreature() {
        return creature;
    }

    public ICast getSpell() {
        return spell;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setCreature(IDefend creature) {
        this.creature = creature;
    }

    public void setSpell(ICast spell) {
        this.spell = spell;
    }
}
