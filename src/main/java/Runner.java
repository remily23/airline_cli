import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

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

            }

        }




        System.out.println("How many passengers?");

    }

}
