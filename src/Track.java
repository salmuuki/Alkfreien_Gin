import java.util.LinkedList;
import java.util.Queue;

public class Track {
    private Queue<Bottle> bottleQueue;
    private Queue<Box> boxQueue;

    public Track() {
        this.bottleQueue = new LinkedList<>();
        for (int i = 0; i < 27; i++) {
            bottleQueue.add(new Bottle("Lab Gin 2008", 500, "CARNETTE", 164.5, 86, 545, 400, false));
        }
        this.boxQueue = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            boxQueue.add(new Box());
        }
    }

    public Queue<Bottle> getBottleQueue() {
        return bottleQueue;
    }

    public Queue<Box> getBoxQueue() {
        return boxQueue;
    }
}
