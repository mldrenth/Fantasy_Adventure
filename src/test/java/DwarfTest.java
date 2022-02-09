import org.junit.Before;
import org.junit.Test;
import players.Dwarf;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;
    private Sword sword;

    @Before
    public void before(){
        sword = new Sword(20);
        dwarf = new Dwarf("Gimli", sword);

    }

    @Test
    public void hasName(){
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void hasHP400(){
        assertEquals(400, dwarf.gethP());
    }

    @Test
    public void hasXP0(){
        assertEquals(0, dwarf.getxP());
    }

    @Test
    public void hasWeapon(){
        assertEquals(sword, dwarf.getWeapon());
    }


}
