package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(21, 200.5, 100.01);
        visitor1 = new Visitor(22, 65.01,25.30);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRideRollerCoaster(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void willChargeTallPeopleMore(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.1);
    }

    @Test
    public void willChargeNormalSizedPeopleDefaultPrice(){
        assertEquals(8.4, rollerCoaster.priceFor(visitor1), 0.1);
    }

}
