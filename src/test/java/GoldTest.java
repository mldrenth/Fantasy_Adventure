import Room.Gold;
import creature.Dragon;
import interfaces.ICast;
import interfaces.IDefend;
import org.junit.Before;
import org.junit.Test;
import players.Wizard;
import spells.FireBall;

import static org.junit.Assert.assertEquals;

public class GoldTest {

    private Gold gold;
    private Wizard wizard;
    private IDefend creature;
    private ICast spell;

    @Before
    public void before(){
        gold = new Gold(50);
        this.creature = new Dragon();
        this.spell = new FireBall();
        wizard = new Wizard("Crystal", creature, spell);
    }

    @Test
    public void hasXP(){
        assertEquals(50, gold.getxP());
    }

    @Test
    public void hasPieces(){
        assertEquals(14, gold.getPieces());
    }

    @Test
    public void canComplete(){
        gold.canComplete(wizard);
        assertEquals(50, wizard.getxP());
    }
}
