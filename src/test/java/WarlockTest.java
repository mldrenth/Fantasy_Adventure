import creature.Dragon;
import interfaces.ICast;
import interfaces.IDefend;
import org.junit.Before;
import org.junit.Test;
import players.Warlock;
import spells.FireBall;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WarlockTest {

    private Warlock warlock;
    private IDefend creature;
    private ICast spell;

    @Before
    public void before(){
        this.creature = new Dragon();
        this.spell = new FireBall();
        this.warlock = new Warlock("Bobby", creature, spell);
    }

    @Test
    public void hasName(){
        assertEquals("Bobby", warlock.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, warlock.gethP());
    }

    @Test
    public void hasXP(){
        assertEquals(0, warlock.getxP());
    }

    @Test
    public void hasSpeed(){
        assertEquals(40, warlock.getSpeed());
    }

    @Test
    public void hasPower(){
        assertEquals(50, warlock.getPower());
    }

    @Test
    public void hasMana(){
        assertEquals(80, warlock.getMana());
    }

    @Test
    public void hasCreature(){
        assertNotNull(warlock.getCreature());
    }

    @Test
    public void hasSpell(){
        assertNotNull(warlock.getSpell());
    }

    @Test
    public void canUseSpell(){
        assertEquals("FIREBALL", warlock.getSpell().cast());
    }


}
