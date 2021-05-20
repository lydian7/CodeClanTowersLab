public class Booking {

    private Bedroom bedroom;
    private int noOfNightsBooked;
    private Guest guest;

    public Booking(Bedroom bedroom, int noOfNightsBooked, Guest guest) {
        this.bedroom = bedroom;
        this.noOfNightsBooked = noOfNightsBooked;
        this.guest = guest;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNoOfNightsBooked() {
        return noOfNightsBooked;
    }

    public int getTotalBill() {
        return bedroom.getNightlyRate() * noOfNightsBooked;
    }

    public Guest getGuest() {
        return guest;
    }
}
