import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Cleric;
import tools.Potion;
import weapons.Axe;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Potion potion;
    private Cleric cleric;
    private Barbarian barbarian;
    private Axe axe;

    @Before
    public void before(){
        axe = new Axe(20);
        potion = new Potion(2, 20);
        barbarian = new Barbarian("Conan", axe);
        cleric = new Cleric("Taric", potion);
    }

    @Test
    public void hasName(){
        assertEquals("Taric", cleric.getName());
    }

    @Test
    public void hasHP200(){
        assertEquals(80, cleric.gethP());
    }

    @Test
    public void hasXP0(){
        assertEquals(0, cleric.getxP());
    }

    @Test
    public void hasTool(){
        assertEquals(potion, cleric.getTool());
    }

    @Test
    public void canUseTool(){
        cleric.useTool(barbarian);
        assertEquals(220, barbarian.gethP());
    }




}
