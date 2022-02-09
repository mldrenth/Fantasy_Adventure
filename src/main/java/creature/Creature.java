package creature;

public abstract class Creature {

    private String type;
    private int hP;

    public Creature() {
        this.type = "";
        this.hP = 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int gethP() {
        return hP;
    }

    public void sethP(int hP) {
        this.hP = hP;
    }
}
