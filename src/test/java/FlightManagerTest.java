import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightManagerTest {
    FlightManager flights;
    Flight flight;


    @BeforeEach
    public void setUp(){
        flights = new FlightManager();
        flight = new Flight(1051, Location.HEATHROW, Location.PARIS, LocalDate.of(2023,10,24), LocalDate.of(2023, 10,31), 1.5);
    }

    @Test
    public void canAddFlight(){
        flights.addFlight(flight);
        assertThat(flights.getFlights().size()).isEqualTo(1);
    }

    @Test
    public void canRemoveFlight(){
        flights.addFlight(flight);
        flights.cancelFlight(flight);
        assertThat(flights.getFlights().size()).isEqualTo(0);
    }

}
