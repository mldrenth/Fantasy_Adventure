package spells;

import interfaces.ICast;

public abstract class Spell {

    private String type;
    private int manaCost;
    private int healthImpact;

    public Spell() {
        this.type = "";
        this.manaCost = 0;
        this.healthImpact = 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public int getHealthImpact() {
        return healthImpact;
    }

    public void setHealthImpact(int healthImpact) {
        this.healthImpact = healthImpact;
    }
}
