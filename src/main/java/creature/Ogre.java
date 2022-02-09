package creature;

import interfaces.IDefend;

public class Ogre extends Creature implements IDefend {
    public Ogre() {
        this.sethP(75);
        this.setType("Ogre");
    }

    @Override
    public String defend() {
        return "OGRE DEFENDS";
    }
}
