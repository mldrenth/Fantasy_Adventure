package Room;

import interfaces.IObjective;

public abstract class Objective implements IObjective {

    private String type;
    private int xP;

    public Objective(String type, int xP) {
        this.type = type;
        this.xP = xP;
    }
}
