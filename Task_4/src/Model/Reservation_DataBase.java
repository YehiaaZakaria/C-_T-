package Model;

import java.util.ArrayList;

public class Reservation_DataBase {
    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
}
