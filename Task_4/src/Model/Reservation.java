package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Reservation {
    private Map<String,Integer> rooms = new HashMap<>();
    private static int id = 0;
    private int duration; // in days
    private float price;

    public Reservation(Map<String,Integer>rooms, int duration , float price) {
        this.duration = duration;
        this.price = price;
        this.rooms = rooms;
        id++;
    }

    public int getId() {
        return id;
    }

    public Map<String, Integer> getRooms() {
        return rooms;
    }

    public int getDuration() {
        return duration;
    }

    public float getPrice() {
        return price;
    }
}
