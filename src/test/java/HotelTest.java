import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    Guest guest5;
    ArrayList<Guest> guests;
    Bedroom singleRoom;
    ConferenceRoom conferenceRoom;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    Booking booking;
    DiningRoom diningRoom;
    HashMap<String, DiningRoom> diningRooms;

    @Before
    public void before(){
        guest1 = new Guest("Barry Johnson");
        guest2 = new Guest("Steve Culprit");
        guest3 = new Guest("Katherine Suspicious");
        guest4 = new Guest("Mike Itwasntme");
        guest5 = new Guest("Mary Mendacious");
        guests = new ArrayList<>();
        guests.add(guest1);
        singleRoom = new Bedroom(4, 13, RoomType.SINGLE, 100);
        conferenceRoom = new ConferenceRoom(4, "The Ambassador's Suite");
        bedrooms = new ArrayList<Bedroom>();
        conferenceRooms = new ArrayList<ConferenceRoom>();
        bedrooms.add(singleRoom);
        conferenceRooms.add(conferenceRoom);
        diningRoom = new DiningRoom("The Trough", 5);
        diningRooms = new HashMap<>();
        diningRooms.put(diningRoom.getName(), diningRoom);
        hotel = new Hotel(bedrooms, conferenceRooms, diningRooms);
        booking = new Booking(singleRoom, 3, guest1);
    }

    @Test
    public void hasBedrooms() {
        assertEquals(1, hotel.getNumberBedrooms());
    }

    @Test
    public void hasConferenceRooms() {

        assertEquals(1, hotel.getNumberConferenceRooms());

    }

    @Test
    public void testCheckIn() {
        hotel.checkGuestsIn(guests, singleRoom);
        assertEquals(1, singleRoom.getNumberGuests());
    }

    @Test
    public void testCheckOut(){
        hotel.checkGuestsOut(singleRoom);
        assertEquals(0, singleRoom.getNumberGuests());
    }

    @Test
    public void canBookRoom() {
        hotel.bookRoom(singleRoom, 4, guest1);
        assertEquals(1, hotel.getNumberBookings());
    }

    @Test
    public void hasDiningRooms() {
        assertEquals(1, hotel.getNumberDiningRooms());
    }

    @Test
    public void canReturnEmptyRooms() {
        Bedroom emptyRoom = new Bedroom(1, 25, RoomType.SINGLE, 100);
        bedrooms.add(emptyRoom);
        Hotel hotel2 = new Hotel(bedrooms, conferenceRooms, diningRooms);
        hotel2.checkGuestsIn(guests, singleRoom);
        ArrayList<Bedroom> emptyBedrooms = hotel.getEmptyRooms();
        assertEquals(1, emptyBedrooms.size());
    }
}

