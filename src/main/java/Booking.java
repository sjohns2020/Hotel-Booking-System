public class Booking {

    private BedRoom bedRoom;

    private int numberOfNights;

    public Booking(BedRoom bedRoom, int numberOfNights) {
        this.bedRoom = bedRoom;
        this.numberOfNights = numberOfNights;
    }

//    public void addBooking(BedRoom room, int noOfNights) {
//        this.bedRoom = room;
//        this.numberOfNights = noOfNights;
//    }

    public BedRoom getBedRoom() {
        return bedRoom;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }
}
