import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Passenger passenger;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Dalkeith");
        passenger = new Passenger();
        busStop = new BusStop("Granton");
        busStop.addPassenger(passenger);
        busStop.addPassenger(passenger);
        busStop.addPassenger(passenger);
        busStop.addPassenger(passenger);
        busStop.addPassenger(passenger);
    }

    @Test
    public void startsWithNoPassengers(){
        assertEquals(0, bus.numberOfPassengers());
    }

    @Test
    public void canAddPassengers(){
        bus.removePassengerFromBusStop(busStop);
        assertEquals(1, bus.numberOfPassengers());
    }

    @Test
    public void cannotAddPassengerAsOverCapacity(){
        bus.removePassengerFromBusStop(busStop);
        bus.removePassengerFromBusStop(busStop);
        bus.removePassengerFromBusStop(busStop);
        bus.removePassengerFromBusStop(busStop);
        bus.removePassengerFromBusStop(busStop);
        bus.removePassengerFromBusStop(busStop);
        bus.removePassengerFromBusStop(busStop);
        assertEquals(5, bus.numberOfPassengers());
    }

    @Test
    public void canRemovePassengerifPassengers(){
        bus.removePassengerFromBusStop(busStop);
        bus.removePassengerFromBusStop(busStop);
        bus.removePassenger();
        assertEquals(1, bus.numberOfPassengers());
    }

    @Test
    public void cannotRemoveAsNoPassengers(){
        bus.removePassengerFromBusStop(busStop);
        bus.removePassenger();
        bus.removePassenger();
        assertEquals(0, bus.numberOfPassengers());
    }

}
