import java.time.LocalDate;
import java.util.ArrayList;

public class Flight {

    private long flightID;

    private Location departureLocation;
    private Location arrivalLocation;
    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private double duration;
    private ArrayList<Passenger> passengers;

    public Flight(long flightID, Location departureLocation, Location arrivalLocation, LocalDate departureTime, LocalDate arrivalTime, double duration) {
        this.flightID = flightID;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.departureDate = departureTime;
        this.arrivalDate = arrivalTime;
        this.duration = duration;
        this.passengers = new ArrayList<>();
    }

    public long getFlightID() {
        return flightID;
    }

    public void setFlightID(long flightID) {
        this.flightID = flightID;
    }

    public Location getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(Location departureLocation) {
        this.departureLocation = departureLocation;
    }

    public Location getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(Location arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public LocalDate getDepartureTime() {
        return departureDate;
    }

    public void setDepartureTime(LocalDate departureTime) {
        this.departureDate = departureTime;
    }

    public LocalDate getArrivalTime() {
        return arrivalDate;
    }

    public void setArrivalTime(LocalDate arrivalTime) {
        this.arrivalDate = arrivalTime;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger){
        this.passengers.remove(passenger);
    }

}
