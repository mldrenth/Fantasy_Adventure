package Room;

import players.Player;

public abstract class Treasure extends Objective{

    private int pieces;

    @Override
    public void canComplete(Player player) {
        player.setxP(player.getxP() + this.getxP());
    }

    public Treasure(int xP) {
        super(xP);
        this.pieces = 0;
    }


    public int getPieces() {
        return this.pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
}
