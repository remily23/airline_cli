import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {
    Passenger passenger;

    @BeforeEach
    public void setUp(){
        passenger= new Passenger(
                "Spongebob",
                12345678,
                25,
                87654321,
                PassengerType.ECONOMY,
                23);
    }


    @Test
    public void canGetName(){
        assertThat(passenger.getName()).isEqualTo("Spongebob");
    }
    @Test
    public void canSetName(){
        passenger.setName("Squidward");
        assertThat(passenger.getName()).isEqualTo("Squidward");
    }
    @Test
    public void canGetPassportNumber(){
        assertThat(passenger.getPassportNumber()).isEqualTo(12345678);
    }
//    @Test
//    public void canSetName(){
//        passenger.setName("Squidward");
//        assertThat(passenger.getName()).isEqualTo("Squidward");
//    }
//    @Test
//    public void canGetName(){
//        assertThat(passenger.getName()).isEqualTo("Spongebob");
//    }
//    @Test
//    public void canSetName(){
//        passenger.setName("Squidward");
//        assertThat(passenger.getName()).isEqualTo("Squidward");
//    }
//    @Test
//    public void canGetName(){
//        assertThat(passenger.getName()).isEqualTo("Spongebob");
//    }
//    @Test
//    public void canSetName(){
//        passenger.setName("Squidward");
//        assertThat(passenger.getName()).isEqualTo("Squidward");
//    }
//    @Test
//    public void canGetName(){
//        assertThat(passenger.getName()).isEqualTo("Spongebob");
//    }
//    @Test
//    public void canSetName(){
//        passenger.setName("Squidward");
//        assertThat(passenger.getName()).isEqualTo("Squidward");
//    }
//    @Test
//    public void canGetName(){
//        assertThat(passenger.getName()).isEqualTo("Spongebob");
//    }
//    @Test
//    public void canSetName(){
//        passenger.setName("Squidward");
//        assertThat(passenger.getName()).isEqualTo("Squidward");
//    }
//    @Test
//    public void canGetName(){
//        assertThat(passenger.getName()).isEqualTo("Spongebob");
//    }
//    @Test
//    public void canSetName(){
//        passenger.setName("Squidward");
//        assertThat(passenger.getName()).isEqualTo("Squidward");
//    }
//
//}
