import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import tools.Potion;

import static org.junit.Assert.assertEquals;

public class PotionTest {

    private Potion potion;
    private Cleric cleric;

    @Before
    public void before(){
        potion = new Potion(5, 20);
        cleric = new Cleric("Taric", potion);
    }

    @Test
    public void hasType(){
        assertEquals("Potion", potion.getType());
    }

    @Test
    public void hasUses(){
        assertEquals(5, potion.getUses());
    }

    @Test
    public void hasHealing(){
        assertEquals(20, potion.getHealing());
    }

    @Test
    public void canHealPlayer(){
        potion.heal(cleric);
        assertEquals(100, cleric.gethP());
    }

    @Test
    public void healingReducedUses(){
        potion.heal(cleric);
        assertEquals(4, potion.getUses());
    }

    @Test
    public void cannotUseIfEmpty(){
        potion.heal(cleric);
        potion.heal(cleric);
        potion.heal(cleric);
        potion.heal(cleric);
        potion.heal(cleric);
        potion.heal(cleric);
        assertEquals(0, potion.getUses());
        assertEquals(180, cleric.gethP());
    }

}
