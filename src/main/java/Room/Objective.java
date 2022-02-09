package Room;

import interfaces.IObjective;

public abstract class Objective implements IObjective {

    private String type;
    private int xP;

    public Objective(int xP) {
        this.type = "";
        this.xP = xP;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getxP() {
        return xP;
    }

    public void setxP(int xP) {
        this.xP = xP;
    }
}
