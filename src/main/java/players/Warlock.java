package players;

import interfaces.ICast;
import interfaces.IDefend;

public class Warlock extends Mage{

    public Warlock(String name, IDefend creature, ICast spell) {
        super(name, creature, spell);
        this.setPower(getPower() * 2);
    }


}
