import creature.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    private Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon();
    }

    @Test
    public void hasHP(){
        assertEquals(120, dragon.gethP());
    }

    @Test
    public void hasType(){
        assertEquals("Dragon", dragon.getType());
    }

    @Test
    public void canDefend(){
        assertEquals("DRAGON DEFENDS", dragon.defend());
    }
}
