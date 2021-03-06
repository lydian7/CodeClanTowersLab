import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberGuests(){
        return guests.size();
    }

    public void addGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public void removeGuests() {
        this.guests.clear();
    }
}
