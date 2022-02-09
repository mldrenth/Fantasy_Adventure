package creature;

import interfaces.IDefend;

public class Dragon extends Creature implements IDefend {

    public Dragon() {
        this.sethP(120);
        this.setType("Dragon");
    }

    @Override
    public String defend() {
        return "DRAGON DEFENDS";
    }
}
