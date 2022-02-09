import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    private Axe axe;

    @Before
    public void before(){
        axe = new Axe(20);
    }

    @Test
    public void hasType(){
        assertEquals("Axe", axe.getType());
    }

    @Test
    public void hasDamageInflicted(){
        assertEquals(20, axe.getDamageInflicted());
    }


}
