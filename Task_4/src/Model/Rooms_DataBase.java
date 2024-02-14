package Model;

import java.util.ArrayList;

public class Rooms_DataBase {
    private ArrayList<Room> rooms = new ArrayList<Room>();

    public Rooms_DataBase() {
        rooms.add(new Room("Single", 100.0f, 10));
        rooms.add(new Room("Double", 200.0f, 10));
        rooms.add(new Room("Triple", 300.0f, 10));
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public Room getRoomByCategory(String category) {
        for (Room room : rooms) {
            if (room.getCategory().equals(category)) {
                return room;
            }
        }
        return null;
    }
}
