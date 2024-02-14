package Model;

public class Room {
    private String Category;
    private Float Price;
    private int NumOfAvailableRooms;

    public Room(String Category, Float Price, int NumOfAvailableRooms) {
        this.Category = Category;
        this.Price = Price;
        this.NumOfAvailableRooms = NumOfAvailableRooms;
    }

    public String getCategory() {
        return Category;
    }

    public Float getPrice() {
        return Price;
    }

    public int getNumOfAvailableRooms() {
        return NumOfAvailableRooms;
    }

    public void setNumOfAvailableRooms(int numOfAvailableRooms) {
        NumOfAvailableRooms = numOfAvailableRooms;
    }
}
