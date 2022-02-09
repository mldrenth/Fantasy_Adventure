import org.junit.Before;
import org.junit.Test;
import weapons.Club;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class ClubTest {

    private Club club;

    @Before
    public void before(){
        club = new Club(20);
    }

    @Test
    public void hasType(){
        assertEquals("Club", club.getType());
    }

    @Test
    public void hasDamageInflicted(){
        assertEquals(20, club.getDamageInflicted());
    }
}
