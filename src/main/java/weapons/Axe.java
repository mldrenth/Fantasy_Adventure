package weapons;

import Room.Enemy;
import players.Player;

public class Axe extends Weapon{

    public Axe(int damageInflicted) {
        super(damageInflicted);
        this.setType("Axe");
    }

    public void fight(Enemy enemy) {
        enemy.setHealth(enemy.getHealth()- this.getDamageInflicted());
    }
}
