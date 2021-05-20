import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(2, 21, RoomType.DOUBLE, 100);
        guest = new Guest("Frank Zappa");
        booking = new Booking(bedroom, 4, guest);
    }

    @Test
    public void hasBedroom() {
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void hasNoOfNights() {
        assertEquals(4, booking.getNoOfNightsBooked());
    }

    @Test
    public void canGetTotalBill() {
        assertEquals(400, booking.getTotalBill());
    }
}
