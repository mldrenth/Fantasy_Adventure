import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    private Sword sword;

    @Before
    public void before(){
        sword = new Sword(20);
    }

    @Test
    public void hasType(){
        assertEquals("Sword", sword.getType());
    }

    @Test
    public void hasDamageInflicted(){
        assertEquals(20, sword.getDamageInflicted());
    }

}
