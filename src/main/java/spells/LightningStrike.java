package spells;

import interfaces.ICast;

public class LightningStrike extends Spell implements ICast {

    public LightningStrike() {
        this.setType("Lightning Strike");
        this.setHealthImpact(30);
        this.setManaCost(35);
    }

    @Override
    public String cast() {
        return "LIGHTNING STRIKE";
    }
}
