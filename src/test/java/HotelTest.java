import org.junit.Before;
import org.junit.Test;

import java.net.ProtocolFamily;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    BedRoom familyRoom;
    Guest guest;
    Guest guest1;
    Guest guest2;
    ConferenceRoom ballRoom;
    BedRoom singleRoom;
    Hotel hotel;

    DiningRoom breakFastBuffet;

    @Before
    public void setUp(){
        guest = new Guest("Jarrod");
        guest1 = new Guest("Stan");
        guest2 = new Guest("John");
        familyRoom = new BedRoom(RoomType.FAMILY, 12, 45);
        singleRoom = new BedRoom(RoomType.SINGLE, 40, 90);
        ballRoom = new ConferenceRoom(RoomType.CONFERENCE, "Ball Room");
        hotel = new Hotel();
        breakFastBuffet = new DiningRoom(RoomType.DINING,"Breakfast Room" );
    }

    @Test
    public void hotelCanAddBedRooms() {
        hotel.addBedRoom(singleRoom);
        assertEquals(1, hotel.noOfRooms());
    }
    @Test
    public void hotelCanAddConferenceRooms() {
        hotel.addConferenceRoom(ballRoom);
        assertEquals(1, hotel.noOfRooms());
    }

    @Test
    public void hotelCanCheckInGuest() {
        hotel.addBedRoom(singleRoom);
        hotel.checkInGuest(40, guest);
        assertEquals(1, singleRoom.getGuests());
    }

    @Test
    public void hotelCanCheckOutGuest() {
        hotel.addBedRoom(singleRoom);
        hotel.checkInGuest(40, guest);
        hotel.checkOutGuest(40, guest);
        assertEquals(0, singleRoom.getGuests());
    }

    @Test
    public void hotelCreateBooking() {
        hotel.bookRoom(singleRoom, 3);
        assertEquals(0, singleRoom.getGuests());
    }

    @Test
    public void getBookingBill() {
        Booking booking = hotel.bookRoom(singleRoom, 3);
        double bill = hotel.bookingBill(booking);
        assertEquals(270, bill, 0.0);
    }

    @Test
    public void hotelCanAddDiningRoom() {
        hotel.addDiningRoom(breakFastBuffet);
        assertEquals(1, hotel.getDiningRooms().size());
    }

    @Test
    public void hotelHasVacantRooms() {
        hotel.addBedRoom(singleRoom);
        hotel.addBedRoom(familyRoom);
        hotel.checkInGuest(40, guest);
        assertEquals(1, hotel.noOfVacantRooms().size());
    }

    @Test
    public void hotelCantCheckInGuestToOccupiedRoom() {
        hotel.addBedRoom(singleRoom);
        hotel.checkInGuest(40, guest);
        hotel.checkInGuest(40, guest1);
        assertEquals(1, singleRoom.getGuests());
    }

}
