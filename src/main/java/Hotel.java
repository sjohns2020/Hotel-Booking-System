import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private ArrayList<BedRoom> bedRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;


    public Hotel() {
        this.bedRooms = new ArrayList<BedRoom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.diningRooms = new HashMap<String, DiningRoom>();
    }

    public ArrayList<BedRoom> getBedRooms() {
        return bedRooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public HashMap<String, DiningRoom> getDiningRooms() {
        return diningRooms;
    }

    public int noOfRooms() {
        return this.bedRooms.size();
    }

    public void addBedRoom(BedRoom bedRoom) {
        this.bedRooms.add(bedRoom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public BedRoom findBedroom(int roomNumber) {
        BedRoom foundRoom = null;
        for (BedRoom bedroom : this.bedRooms) {
            if (bedroom.getRoomNo() == roomNumber) {
                foundRoom = bedroom;
            }
        }
        return foundRoom;
    }

    public void checkInGuest(int roomNo, Guest guest) {
        BedRoom foundRoom = findBedroom(roomNo);
        if (foundRoom.isVacant()) {
            foundRoom.addGuest(guest);
        }
    }


    public void checkOutGuest(int roomNo, Guest guest) {
        BedRoom foundRoom = findBedroom(roomNo);
        foundRoom.removeGuest(guest);
    }

    public Booking bookRoom(BedRoom room, int noOfNights) {
        return new Booking(room, noOfNights);
    }

    public double bookingBill(Booking booking) {
        return booking.getBedRoom().rate * booking.getNumberOfNights();

    }

//    return ArrayList of vacant rooms

    public ArrayList<BedRoom>  noOfVacantRooms() {
        ArrayList<BedRoom> VacantRooms = new ArrayList<>();
        for (BedRoom room : this.bedRooms) {
            if (room.isVacant()) {
                VacantRooms.add(room);
            }
        }
        return VacantRooms;
    }
}
