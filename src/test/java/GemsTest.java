import Room.Gems;
import creature.Dragon;
import interfaces.ICast;
import interfaces.IDefend;
import org.junit.Before;
import org.junit.Test;
import players.Wizard;
import spells.FireBall;

import static org.junit.Assert.assertEquals;

public class GemsTest {
    private Gems gems;
    private Wizard wizard;
    private IDefend creature;
    private ICast spell;

    @Before
    public void before(){
        gems = new Gems(60);
        this.creature = new Dragon();
        this.spell = new FireBall();
        wizard = new Wizard("Crystal", creature, spell);
    }

    @Test
    public void hasXP(){
        assertEquals(60, gems.getxP());
    }

    @Test
    public void hasPieces(){
        assertEquals(30, gems.getPieces());
    }

    @Test
    public void canComplete(){
        gems.canComplete(wizard);
        assertEquals(60, wizard.getxP());
    }
}
