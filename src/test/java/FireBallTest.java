import org.junit.Before;
import org.junit.Test;
import spells.FireBall;

import static org.junit.Assert.assertEquals;

public class FireBallTest {

    private FireBall fireBall;

    @Before
    public void before(){
        this.fireBall = new FireBall();
    }

    @Test
    public void hasType(){
        assertEquals("Fireball", fireBall.getType());
    }

    @Test
    public void hasManaCost(){
        assertEquals(15, fireBall.getManaCost());
    }

    @Test
    public void hasHealthImpact(){
        assertEquals(20, fireBall.getHealthImpact());
    }

    @Test
    public void canCast(){
        assertEquals("FIREBALL", fireBall.cast());
    }
}
