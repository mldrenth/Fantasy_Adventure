package Room;

import players.Player;

public class Troll extends Enemy {

    public Troll(int xP, int health, int damageInflicted) {
        super(xP, health, damageInflicted);
        this.setType("Troll");
    }


    public void inflictDamage(Player player) {
        player.sethP(player.gethP() - this.getDamageInflicted());
    }

    public void canComplete(Player player) {
        player.setxP(player.getxP() + this.getxP());

    }
}
