import Room.Troll;
import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    private Sword sword;
    private Troll troll;

    @Before
    public void before(){
        sword = new Sword(20);
        troll = new Troll(200, 100, 20);
    }

    @Test
    public void hasType(){
        assertEquals("Sword", sword.getType());
    }

    @Test
    public void hasDamageInflicted(){
        assertEquals(20, sword.getDamageInflicted());
    }

    @Test
    public void canDamage(){
        sword.fight(troll);
        assertEquals(80, troll.getHealth());
    }

}
