package tools;

import interfaces.IHeal;

public abstract class Tool implements IHeal {

    private String type;
    private int uses;
    private int healing;

    public Tool(int uses, int healing) {
        this.type = "";
        this.uses = uses;
        this.healing = healing;
    }

    public String getType() {
        return type;
    }

    public int getUses() {
        return uses;
    }

    public int getHealing() {
        return healing;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUses(int uses) {
        this.uses = uses;
    }
}
