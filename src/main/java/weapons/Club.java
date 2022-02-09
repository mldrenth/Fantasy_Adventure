package weapons;

import Room.Enemy;

public class Club extends Weapon{

    public Club(int damageInflicted) {
        super(damageInflicted);
        this.setType("Club");
    }


    public void fight(Enemy enemy) {
        enemy.setHealth(enemy.getHealth()- this.getDamageInflicted());
    }
}
