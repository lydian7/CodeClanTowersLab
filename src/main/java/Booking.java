public class Booking {

    private Bedroom bedroom;
    private int noOfNightsBooked;

    public Booking(Bedroom bedroom, int noOfNightsBooked) {
        this.bedroom = bedroom;
        this.noOfNightsBooked = noOfNightsBooked;
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
}
