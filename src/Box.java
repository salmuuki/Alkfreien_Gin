public class Box {
    private Bottle[][] storageArea;
    private int bottleCount;

    public Box() {
        this.storageArea = new Bottle[3][3];
        this.bottleCount = 0;
    }

    public boolean addBottle(Bottle bottle) {
        if (bottleCount < 9) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (storageArea[i][j] == null) {
                        storageArea[i][j] = bottle;
                        bottleCount++;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int getBottleCount() {
        return bottleCount;
    }
}
