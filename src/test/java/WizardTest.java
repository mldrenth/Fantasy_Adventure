import creature.Creature;
import creature.Dragon;
import interfaces.ICast;
import interfaces.IDefend;
import org.junit.Before;
import org.junit.Test;
import players.Wizard;
import spells.FireBall;
import spells.Spell;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WizardTest {

    private Wizard wizard;
    private IDefend creature;
    private ICast spell;

    @Before
    public void before(){
        this.creature = new Dragon();
        this.spell = new FireBall();
        this.wizard = new Wizard("Crystal", creature, spell);
    }

    @Test
    public void hasName(){
        assertEquals("Crystal", wizard.getName());
    }
    
    @Test
    public void hasHP(){
        assertEquals(100, wizard.gethP());
    }

    @Test
    public void hasXP(){
        assertEquals(0, wizard.getxP());
    }

    @Test
    public void hasSpeed(){
        assertEquals(80, wizard.getSpeed());
    }

    @Test
    public void hasPower(){
        assertEquals(25, wizard.getPower());
    }

    @Test
    public void hasMana(){
        assertEquals(80, wizard.getMana());
    }

    @Test
    public void hasCreature(){
        assertNotNull(wizard.getCreature());
    }

    @Test
    public void hasSpell(){
        assertNotNull(wizard.getSpell());
    }

    @Test
    public void canUseSpell(){
        assertEquals("FIREBALL", wizard.getSpell().cast());
    }
}
