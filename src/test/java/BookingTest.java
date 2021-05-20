import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(2, 21, RoomType.DOUBLE, 100);
        booking = new Booking(bedroom, 4);
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
