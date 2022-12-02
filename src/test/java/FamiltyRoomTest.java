import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamiltyRoomTest {

    BedRoom familyRoom;
    Guest guest;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp(){
        guest = new Guest("Jarrod");
        guest1 = new Guest("Stan");
        guest2 = new Guest("John");
        familyRoom = new BedRoom(RoomType.FAMILY, 12, 45.00);
    }

    @Test
    public void roomHasEmptyListOfGuests() {
        assertEquals(0, familyRoom.getGuests());
    }

    @Test
    public void roomCanAddGuest() {
        familyRoom.addGuest(guest);
        assertEquals(1, familyRoom.getGuests());
    }

    @Test
    public void roomHasSize() {
        assertEquals(40, familyRoom.getRoomSize(), 0.0);
    }

}
