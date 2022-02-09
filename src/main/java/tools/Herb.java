package tools;

import players.Player;

public class Herb extends Tool{
    public Herb(int uses, int healing) {
        super(uses, healing);
        this.setType("Herb");
    }

    public void heal(Player player) {
        if (getUses() > 0) {
            player.sethP(player.gethP() + this.getHealing());
            this.setUses(this.getUses() - 1);
        }
    }
}
