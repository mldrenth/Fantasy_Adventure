import org.junit.Before;
import org.junit.Test;
import players.Knight;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    private Knight knight;
    private Club club;

    @Before
    public void before(){
        club = new Club(20);
        knight = new Knight("Sir Lancelot", club);
    }

    @Test
    public void hasName(){
        assertEquals("Sir Lancelot", knight.getName());
    }

    @Test
    public void hasHP200(){
        assertEquals(200, knight.gethP());
    }

    @Test
    public void hasXP0(){
        assertEquals(0, knight.getxP());
    }

    @Test
    public void hasWeapon(){
        assertEquals(club, knight.getWeapon());
    }

    @Test
    public void hasArmor(){
        assertEquals(50, knight.getArmor());
    }

}
