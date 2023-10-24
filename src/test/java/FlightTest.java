import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    Flight flight;
    Passenger passenger;

    @BeforeEach
    public void setUp(){
        flight = new Flight(1051, Location.HEATHROW, Location.PARIS, LocalDate.of(2023,10,24), LocalDate.of(2023, 10,31), 1.5);
        passenger = new Passenger("Spongebob", 12345678, 25, 87654321, PassengerType.ECONOMY, 23);
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger);
        assertThat(flight.getPassengers().size()).isEqualTo(1);
    }

    @Test
    public void canRemovePassenger(){
        flight.removePassenger(passenger);
        assertThat(flight.getPassengers().size()).isEqualTo(0);
    }

}
