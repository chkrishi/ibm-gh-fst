package Activity6;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class plane {
    public List<String> passengers;
    public int maxPassengers;
    public LocalDate lastTimeTookOf;
    public LocalDate lastTimeLanded;
}

class updateDetails extends plane {

    void setDetails(int maxPassengers) {

        Scanner sc = new Scanner(System.in);
        System.out.println("For " + maxPassengers + " enter passenger values");

        for(int i = 0; i < maxPassengers; i++) {
            String name = sc.nextLine();
            passengers.add(name);
        }

        System.out.print("Enter last time flight took off date (yyyy-MM-dd): ");
        lastTimeTookOf = LocalDate.parse(sc.nextLine());

        System.out.print("Enter last time flight landed date (yyyy-MM-dd): ");
        lastTimeLanded = LocalDate.parse(sc.nextLine());
    }

    void getDetails() {

        System.out.println("Passenger Details:");

        for(String passenger : passengers) {
            System.out.println(passenger);
        }

        System.out.println("Last time the flight took off: " + lastTimeTookOf);
        System.out.println("Last time the flight landed: " + lastTimeLanded);
    }
}