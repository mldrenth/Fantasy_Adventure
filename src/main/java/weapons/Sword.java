package weapons;

import Room.Enemy;

public class Sword extends Weapon{


    public Sword( int damageInflicted) {
        super(damageInflicted);
        this.setType("Sword");
    }

    public void fight(Enemy enemy) {
        enemy.setHealth(enemy.getHealth()- this.getDamageInflicted());
    }
}
