package players;

public abstract class Player {

    private String name;
    private int hP;
    private int xP;

    public Player(String name) {
        this.name = name;
        this.hP = 100;
        this.xP = 0;
    }

    public String getName() {
        return name;
    }

    public int gethP() {
        return hP;
    }

    public int getxP() {
        return xP;
    }

    public void sethP(int hP) {
        this.hP = hP;
    }

    public void setxP(int xP) {
        this.xP = xP;
    }
}
