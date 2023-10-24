import java.util.ArrayList;

public class Flights {

   private ArrayList<Flight> flights;

   public Flights() {
       this.flights = new ArrayList<>();
   }

   public ArrayList<Flight> getFlights(){
       return this.flights;
   }

   public void setFlights(ArrayList<Flight> flights) {
       this.flights = flights;
   }

   public void addFlight(Flight flight) {
       flights.add(flight);
   }

   public void cancelFlight(Flight flight) {
       flights.remove(flight);
   }

}
