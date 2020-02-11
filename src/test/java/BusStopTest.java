import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger();
        busStop = new BusStop("Prestonfield");
    }

    @Test
    public void checkBusStopIsEmpty(){
        assertEquals(0, busStop.numberOfPassengers());
    }

    @Test
    public void addPassengerToBusStop(){
        busStop.addPassenger(passenger);
        assertEquals(1, busStop.numberOfPassengers());
    }

    @Test
    public void removePassengerFromQueue(){
        busStop.addPassenger(passenger);
        busStop.addPassenger(passenger);
        busStop.removePassenger();
        assertEquals(1, busStop.numberOfPassengers());
    }
}
