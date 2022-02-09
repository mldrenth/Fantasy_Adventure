import org.junit.Before;
import org.junit.Test;
import spells.LightningStrike;

import static org.junit.Assert.assertEquals;

public class LightningStrikeTest {

    private LightningStrike lightningStrike;

    @Before
    public void before(){
        lightningStrike = new LightningStrike();
    }

    @Test
    public void hasType(){
        assertEquals("Lightning Strike", lightningStrike.getType());
    }

    @Test
    public void hasManaCost(){
        assertEquals(35, lightningStrike.getManaCost());
    }

    @Test
    public void hasHealthImpact(){
        assertEquals(30, lightningStrike.getHealthImpact());
    }

    @Test
    public void canCast(){
        assertEquals("LIGHTNING STRIKE", lightningStrike.cast());
    }
}
