public class ConferenceRoom extends Room{

    private static final double length = 10;
    private static final double width = 9;

    protected String name;

    protected ConferenceRoom(RoomType roomType, String name) {
        super(roomType.getCapacity(), width, length);
        this.name = name;
    }
}
