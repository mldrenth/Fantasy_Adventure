import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import weapons.Axe;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;
    private Axe axe;

    @Before
    public void before(){
        axe = new Axe(20);
        barbarian = new Barbarian("Conan", axe);

    }

    @Test
    public void hasName(){
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void hasHP200(){
        assertEquals(200, barbarian.gethP());
    }

    @Test
    public void hasXP0(){
        assertEquals(0, barbarian.getxP());
    }

    @Test
    public void hasWeapon(){
        assertEquals(axe, barbarian.getWeapon());
    }

    @Test
    public void hasDamageInflicted2(){
        assertEquals(2, barbarian.getDamageInflicted());
    }

}
