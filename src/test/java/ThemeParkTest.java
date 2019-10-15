import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.ParkingSpot;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    CandyflossStall candyflossStall;
    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        themePark = new ThemePark("CodeLand");
        candyflossStall = new CandyflossStall("CandyLand", "Tony", ParkingSpot.A2, 4);
        rollerCoaster = new RollerCoaster("WhirlyGig", 10);
        visitor1 = new Visitor(21, 145.54, 154.32);
        visitor2 = new Visitor(34, 125.54, 54.67);
    }

    @Test
    public void canGetName(){
        assertEquals("CodeLand", themePark.getName());
    }

    @Test
    public void ThemeParkStartsEmpty(){
        assertEquals(0, themePark.getStallsAndAttractions()) ;
    }

    @Test
    public void canAddStallsAndAttractions(){
        themePark.addAllReviewed(candyflossStall);
        assertEquals(1, themePark.getStallsAndAttractions());
    }

    @Test
    public void canMakeAVisit(){
        themePark.visit(visitor1, rollerCoaster);
        themePark.visit(visitor2, rollerCoaster);
        assertEquals(2, rollerCoaster.getVisitCount());
        assertEquals(1, visitor1.getVisitedAttractions());

    }
}
