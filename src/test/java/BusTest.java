import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Passenger passenger;

    @Before
    public void before(){
        bus = new Bus("Dalkeith");
        passenger = new Passenger();
    }

    @Test
    public void startsWithNoPassengers(){
        assertEquals(0, bus.numberOfPassengers());
    }

    @Test
    public void canAddPassengers(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.numberOfPassengers());
    }

    @Test
    public void cannotAddPassengerAsOverCapacity(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        assertEquals(5, bus.numberOfPassengers());
    }
}
