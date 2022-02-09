import Room.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Cleric;
import tools.Potion;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    private Troll troll;
    private Barbarian barbarian;
    private Sword sword;

    @Before
    public void before(){
        sword = new Sword(50);
        barbarian = new Barbarian("Conan", sword);
        troll = new Troll(100, 200, 20);
    }

    @Test
    public void hasxP(){
        assertEquals(100, troll.getxP());
    }

    @Test
    public void hasHealth(){
        assertEquals(200, troll.getHealth());
    }

    @Test
    public void hasDamage(){
        assertEquals(20, troll.getDamageInflicted());
    }

    @Test
    public void canAttackPlayer(){
        troll.inflictDamage(barbarian);
        assertEquals(180, barbarian.gethP());
    }

    @Test
    public void canRewardXp(){
        troll.canComplete(barbarian);
        assertEquals(100, barbarian.getxP());
    }

}
