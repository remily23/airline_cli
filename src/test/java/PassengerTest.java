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
    public void canAddLuggage(){
        passenger.addLuggage(20);
        assertThat(passenger.getLuggageAllowance()).isEqualTo(43);
    }
    @Test
    public void canRemoveLuggage(){
        passenger.removeLuggage(20);
        assertThat(passenger.getLuggageAllowance()).isEqualTo(3);
    }

    @Test
    public void canUpgradePassengerEconomy(){
        passenger.upgradePassenger();
        assertThat(passenger.getPassengerType()).isEqualTo(PassengerType.BUSINESS);
    }
    @Test
    public void canUpgradePassengerBusiness(){
        passenger.setPassengerType(PassengerType.BUSINESS);
        passenger.upgradePassenger();
        assertThat(passenger.getPassengerType()).isEqualTo(PassengerType.FIRST);
    }
    @Test
    public void canUpgradePassengerFirst(){
        passenger.setPassengerType(PassengerType.FIRST);
        passenger.upgradePassenger();
        assertThat(passenger.getPassengerType()).isEqualTo(PassengerType.FIRST);
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
}
