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
        room.addGuests(guests);
    }

    public void checkGuestsOut(Room room) {
        room.removeGuests();
    }

    public Booking bookRoom(Bedroom bedroom, int noOfNights) {
        Booking booking = new Booking(bedroom, noOfNights);
        bookings.add(booking);
        return booking;
    }

    public int getNumberBookings() {
        return bookings.size();
    }

    public int getNumberDiningRooms() {
        return diningRooms.size();
    }
}
