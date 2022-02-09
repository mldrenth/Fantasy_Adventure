import creature.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {

    private Ogre ogre;

    @Before
    public void before(){
        this.ogre = new Ogre();
    }

    @Test
    public void hasHP(){
        assertEquals(75, ogre.gethP());
    }

    @Test
    public void hasType(){
        assertEquals("Ogre", ogre.getType());
    }

    @Test
    public void canDefend(){
        assertEquals("OGRE DEFENDS", ogre.defend());
    }
}
