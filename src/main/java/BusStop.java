import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Passenger> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Passenger>();
    }

    public int numberOfPassengers() {
        return this.queue.size();
    }

    public void addPassenger(Passenger passenger) {
        this.queue.add(passenger);
    }

    public Passenger removePassenger() {
        if (this.queue.size() > 0) {
            return this.queue.remove(0);
        } else {
            return null;
        }
    }
}
