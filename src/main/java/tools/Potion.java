package tools;

import players.Player;

public class Potion extends Tool{
    public Potion(int uses, int healing) {
        super(uses, healing);
        this.setType("Potion");
    }

    public void heal(Player player) {
        if (getUses() > 0) {
            player.sethP(player.gethP() + this.getHealing());
            this.setUses(this.getUses() - 1);
        }
    }
}
