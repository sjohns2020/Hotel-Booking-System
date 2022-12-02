import java.util.ArrayList;

public abstract class Room {

    private double w;
    private double l;
    private int capacity;
    private ArrayList<Guest> guests;


    protected Room(int capacity, double w, double l) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.w = w;
        this.l = l;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getGuests() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }

    public double getRoomSize() {
        return this.w * this.l;
    }

    public Boolean isVacant() {
        return this.guests.size() == 0;
    }

    public Boolean isOccupied() {
        return this.guests.size() > 0;
    }

}
