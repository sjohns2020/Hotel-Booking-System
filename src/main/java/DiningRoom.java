import java.util.ArrayList;

public class DiningRoom extends Room{

    private String name;
    private static double width = 3;
    private static double length = 10;

    protected DiningRoom(RoomType roomType, String name) {
        super(roomType.getCapacity(), width, length);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
