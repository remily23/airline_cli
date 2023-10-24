import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Passenger passenger1;
        Flight flight;
        FlightManager flightManager;

        PromptForInput  method= new PromptForInput();


        System.out.println("Welcome to the BN airlines");
        Scanner scanner= new Scanner(System.in);

        System.out.println("what do you want to do? \n 1.Make a booking \n 2.Cancel a booking \n 3.Add passenger details");


        String response = scanner.nextLine();

        HashMap<String, Location> locations = new HashMap<>();
        locations.put("London", Location.HEATHROW);
        locations.put("Bristol", Location.BRISTOL);
        locations.put("Istanbul", Location.ISTANBUL);
        locations.put("Paris", Location.PARIS);

        HashMap<String, PassengerType> types = new HashMap<>();
        types.put("Economy", PassengerType.ECONOMY);
        types.put("Business", PassengerType.BUSINESS);
        types.put("First", PassengerType.FIRST);



        switch(response){
            case "1":{
                System.out.println("To:");
                String arrivaInput = scanner.nextLine();
                Location arrival = locations.get(arrivaInput);

                System.out.println("From:");
                String departureInput = scanner.nextLine();
                Location departure = locations.get(departureInput);

                System.out.println("Departure date:");
                int y = scanner.nextInt();
                int m = scanner.nextInt();
                int d = scanner.nextInt();

                LocalDate depDate = LocalDate.of(y,m,d);

                System.out.println("Arrival date:");
                y = scanner.nextInt();
                m = scanner.nextInt();
                d = scanner.nextInt();

                LocalDate arrDate = LocalDate.of(y,m,d);

                flight = new Flight(1051, departure, arrival, depDate, arrDate, 3);

                System.out.println("Flight found. Your flight ID is:" + flight.getFlightID());

                System.out.println("How many passengers?");
                int numberPassengers = scanner.nextInt();

                for (int i = 0; i <numberPassengers ; i++) {

                    System.out.println("Passenger name:");
                    String name = scanner.nextLine();

                    System.out.println("Passenger Age:");
                    int age = scanner.nextInt();

                    System.out.println("Passenger Passport number:");
                    long PN = scanner.nextLong();

                    System.out.println("Passenger Phone number:");
                    long P = scanner.nextLong();


                    System.out.println("Economy, Business or First class?");
                    String type = scanner.nextLine();
                    PassengerType PType = types.get(type);

                    passenger1 = new Passenger(name,PN,age,P, PType,23);

                    flight.addPassenger(passenger1);

                }

            }

        }

    }

}
