import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(5, "The Ambassador's Lounge");
    }

    @Test
    public void hasCapacity() {
        assertEquals(5, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("The Ambassador's Lounge", conferenceRoom.getName());
    }
}
