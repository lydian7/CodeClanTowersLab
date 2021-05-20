import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;
    private HashMap<String, DiningRoom> diningRooms;


    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, HashMap diningRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.bookings = new ArrayList<>();
        this.diningRooms = diningRooms;
    }

    public int getNumberBedrooms() {
        return bedrooms.size();
    }

    public int getNumberConferenceRooms() {
        return conferenceRooms.size();
    }

    public void checkGuestsIn(ArrayList<Guest> guests, Room room){
        if(guests.size() > 0 && guests.size() <= room.getCapacity() && room.getNumberGuests() == 0) {
            room.addGuests(guests);
        }
    }

    public void checkGuestsOut(Room room) {
        room.removeGuests();
    }

    public Booking bookRoom(Bedroom bedroom, int noOfNights, Guest guest) {
        Booking booking = new Booking(bedroom, noOfNights, guest);
        bookings.add(booking);
        return booking;
    }

    public int getNumberBookings() {
        return bookings.size();
    }

    public int getNumberDiningRooms() {
        return diningRooms.size();
    }

    public ArrayList<Bedroom> getEmptyRooms() {
        ArrayList<Bedroom> emptyBedrooms = new ArrayList<>();
        for(Bedroom bedroom : bedrooms){
            if(bedroom.getNumberGuests() == 0){
                emptyBedrooms.add(bedroom);
            }
        }
        return emptyBedrooms;
    }
}
