package players;

import interfaces.ICast;
import interfaces.IDefend;

public class Wizard extends Mage{

    public Wizard(String name, IDefend creature, ICast spell) {
        super(name, creature, spell);
        this.setSpeed(this.getSpeed() * 2);
    }


}
