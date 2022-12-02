public class BedRoom extends Room{

    private static double length = 4;
    private static double width = 10;


    protected double rate;
    protected int roomNumber;

    protected BedRoom(RoomType roomType, int roomNumber, double rate) {
        super(roomType.getCapacity(), width, length);
        this.roomNumber = roomNumber;
        this.rate = rate;
    }

    public int getRoomNo() {
        return roomNumber;
    }

    public double getRate() {
        return rate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
