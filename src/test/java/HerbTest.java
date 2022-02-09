import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import tools.Herb;
import tools.Potion;

import static org.junit.Assert.assertEquals;

public class HerbTest {
    private Herb herb;
    private Cleric cleric;

    @Before
    public void before(){
        herb = new Herb(2, 10);
        cleric = new Cleric("Taric", herb);
    }

    @Test
    public void hasType(){
        assertEquals("Herb", herb.getType());
    }

    @Test
    public void hasUses(){
        assertEquals(2, herb.getUses());
    }

    @Test
    public void hasHealing(){
        assertEquals(10, herb.getHealing());
    }

    @Test
    public void canHealPlayer(){
        herb.heal(cleric);
        assertEquals(90, cleric.gethP());
    }

    @Test
    public void healingReducedUses(){
        herb.heal(cleric);
        assertEquals(1, herb.getUses());
    }

    @Test
    public void cannotUseIfEmpty(){
        herb.heal(cleric);
        herb.heal(cleric);
        herb.heal(cleric);
        assertEquals(0, herb.getUses());
        assertEquals(100, cleric.gethP());
    }

}
