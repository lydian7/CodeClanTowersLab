import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
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
}
