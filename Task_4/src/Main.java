import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO HOTEL MANAGEMENT SYSTEM");
        Controller controller = new Controller();
        int choice;
        do {
            System.out.println("Choose one of the following options:");
            System.out.println("1.Available Rooms");
            System.out.println("2.Make a reservation");
            System.out.println("3.View Booking details");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    controller.showAvailableRooms();
                } break;
                case 2: {
                    int categoryChoice;
                    Map<String, Integer> rooms = new HashMap<>();
                    do {
                        System.out.println();
                        System.out.println("Choose the category of the room you want to reserve: , if you need no more rooms, press 0");
                        System.out.println("1.Single");
                        System.out.println("2.Double");
                        System.out.println("3.Triple");
                        System.out.println("0.Enough");
                        System.out.print("Enter your choice: ");
                        categoryChoice = sc.nextInt();
                        switch (categoryChoice) {
                            case 1: {
                                System.out.print("Enter the number of rooms you want to reserve: ");
                                int numRooms = sc.nextInt();
                                rooms.put("Single", rooms.getOrDefault("Single", 0) + numRooms);
                            } break;
                            case 2: {
                                System.out.print("Enter the number of rooms you want to reserve: ");
                                int numRooms = sc.nextInt();
                                rooms.put("Double", rooms.getOrDefault("Double", 0) + numRooms);
                            } break;
                            case 3: {
                                System.out.print("Enter the number of rooms you want to reserve: ");
                                int numRooms = sc.nextInt();
                                rooms.put("Triple", rooms.getOrDefault("Triple", 0) + numRooms);
                            } break;
                            case 0: {
                                System.out.println("Enter the duartion of the reservation: (in days)");
                                int duration = sc.nextInt();
                                controller.makeReservation(rooms, duration);
                            } break;
                            default: {
                                System.out.println("Invalid choice. Please try again.");
                            }break;
                        }
                    }while(categoryChoice != 0);

                }break;
                case 3: {
                    System.out.print("Enter the reservation ID: ");
                    int reservationId = sc.nextInt();
                    controller.viewBookingDetails(reservationId);
                }break;
                case 4: {
                    System.out.println("Thank you for using the hotel management system.");
                    break;
                }
                default: {
                    System.out.println("Invalid choice. Please try again.");
                }break;
            }
        }while (choice != 4);

    }
}