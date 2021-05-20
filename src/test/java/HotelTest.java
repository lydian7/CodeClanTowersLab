import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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

    @Before
    public void before(){
        guest1 = new Guest("Barry Johnson");
        guest2 = new Guest("Steve Culprit");
        guest3 = new Guest("Katherine Suspicious");
        guest4 = new Guest("Mike Itwasntme");
        guest5 = new Guest("Mary Mendacious");
        guests = new ArrayList<>();
        guests.add(guest1);
//        guests.add(guest2);
//        guests.add(guest3);
//        guests.add(guest4);
//        guests.add(guest5);
        singleRoom = new Bedroom(4, 13, RoomType.SINGLE);
        conferenceRoom = new ConferenceRoom(4, "The Ambassador's Suite");
        bedrooms = new ArrayList<Bedroom>();
        conferenceRooms = new ArrayList<ConferenceRoom>();
        bedrooms.add(singleRoom);
        conferenceRooms.add(conferenceRoom);
        hotel = new Hotel(bedrooms, conferenceRooms);
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
}

