import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Passenger> passengers;

    public Bus(String destination){
        this.destination = destination;
        this.capacity = 5;
        this.passengers = new ArrayList<Passenger>();
    }

    public int numberOfPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if (this.passengers.size() < this.capacity){
            this.passengers.add(passenger);
        }
    }

    public void removePassenger() {
        if (this.passengers.size() > 0){
            this.passengers.remove(0);
        }
    }
}
