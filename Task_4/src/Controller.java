import Model.Reservation;
import Model.Reservation_DataBase;
import Model.Room;
import Model.Rooms_DataBase;

import java.util.ArrayList;
import java.util.Map;

public class Controller {
    private Rooms_DataBase  roomsDataBase = new Rooms_DataBase();
    private Reservation_DataBase reservationDataBase = new Reservation_DataBase();

    public void showAvailableRooms() {
        System.out.println();
        System.out.println("Available Rooms:");
        for (Room room : roomsDataBase.getRooms()) {
            System.out.println("Category: " + room.getCategory() + " - Available Rooms: " + room.getNumOfAvailableRooms());
        }
        System.out.println();
    }

    public void makeReservation(Map<String, Integer> rooms, int duration) {
        System.out.println();
        for(Map.Entry<String, Integer> entry : rooms.entrySet()) {
            String category = entry.getKey();
            int numRooms = entry.getValue();
            Room room = roomsDataBase.getRoomByCategory(category);
            if (room.getNumOfAvailableRooms() < numRooms) {
                System.out.println("Sorry, there are not enough rooms available for " + category + ".");
                System.out.println("Reservation cannot be made.");
                System.out.println();
                return;
            }
        }

        Float reservationPrice = 0.0f;
        for (Map.Entry<String, Integer> entry : rooms.entrySet()) {
            String category = entry.getKey();
            int numRooms = entry.getValue();
            Room room = roomsDataBase.getRoomByCategory(category);
            room.setNumOfAvailableRooms(room.getNumOfAvailableRooms() - numRooms);
            reservationPrice += room.getPrice() * numRooms;
        }
        reservationPrice = reservationPrice*duration;
        Reservation reservation = new Reservation(rooms, duration, reservationPrice);
        reservationDataBase.addReservation(reservation);
        System.out.println("Reservation made successfully.");
        System.out.println("Your Reservation ID is : " + reservation.getId());
        System.out.println("Reservation Price: " + reservationPrice);
        System.out.println();
    }

    public void viewBookingDetails(int reservationId) {
        System.out.println();
        if (reservationId < 1 || reservationId > reservationDataBase.getReservations().size()) {
            System.out.println("Invalid reservation ID.");
            return;
        }
        for (Reservation reservation : reservationDataBase.getReservations()) {
            if (reservation.getId() == reservationId) {
                System.out.println("Reservation ID: " + reservation.getId());
                System.out.println("Reservation Duration: " + reservation.getDuration());
                System.out.println("Reservation Price: " + reservation.getPrice());
                System.out.println("Rooms:");
                for (Map.Entry<String, Integer> entry : reservation.getRooms().entrySet()) {
                    String category = entry.getKey();
                    int numRooms = entry.getValue();
                    System.out.println("Category: " + category + " - Number of Rooms: " + numRooms);
                }
                return;
            }
        }
        System.out.println("Reservation not found.");
        System.out.println();
    }

}
