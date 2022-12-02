import org.junit.Before;

public class BallRoomTest {

    ConferenceRoom ballRoom;
    Guest guest;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() {
        guest = new Guest("Jarrod");
        guest1 = new Guest("Stan");
        guest2 = new Guest("John");
        ballRoom = new ConferenceRoom(RoomType.CONFERENCE, "Ball Room");
    }
}
