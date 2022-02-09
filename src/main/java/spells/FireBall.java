package spells;

import interfaces.ICast;

public class FireBall extends Spell implements ICast {



    public FireBall() {
        this.setType("Fireball");
        this.setHealthImpact(20);
        this.setManaCost(15);
    }

    @Override
    public String cast() {
        return "FIREBALL";
    }

}
