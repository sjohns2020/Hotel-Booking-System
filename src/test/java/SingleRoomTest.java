import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleRoomTest {

    BedRoom singleRoom;
    Guest guest;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp(){
        guest = new Guest("Jarrod");
        guest1 = new Guest("Stan");
        guest2 = new Guest("John");
        singleRoom = new BedRoom(RoomType.SINGLE, 40, 90.00);

    }

//    @Test
//    public void roomHasType() {
//        assertEquals(RoomType.SINGLE, singleRoom.getRoomType());
//    }

    @Test
    public void roomHasEmptyListOfGuests() {
        assertEquals(0, singleRoom.getGuests());
    }

    @Test
    public void roomCanAddGuest() {
        singleRoom.addGuest(guest);
        assertEquals(1, singleRoom.getGuests());
    }


}
