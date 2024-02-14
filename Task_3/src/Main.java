import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TravelLtineraryPlanner planner = new TravelLtineraryPlanner();
        System.out.println("Welcome to the Travel Planner!");

        System.out.println("Enter the number of destinations you want to visit:");
        Scanner scanner = new Scanner(System.in);
        int numOfDesitinations = scanner.nextInt();

        System.out.println("Enter your budget:");
        float budget = scanner.nextFloat();

        if (budget < 0) {
            System.out.println("Invalid budget");
            return;
        }
        else if(budget < numOfDesitinations * 1200) {
            System.out.println("Insufficient budget");
            return;
        }

        Map<String,String>Trip =new HashMap<>();
        for (int i = 0; i < numOfDesitinations; i++) {
            System.out.println("Enter desitination " +"#"+ (i + 1) + " :");
            String destination = scanner.next();
            System.out.println("Enter date for desitination " +"#"+ (i + 1) + " :");
            String date = scanner.next();
            Trip.put(destination,date);
        }
        planner.Planner(Trip,budget);

    }
}