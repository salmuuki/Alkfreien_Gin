public class Roboter01 {
    private Track track;
    private StorageArea storageArea;
    private boolean isOn;

    public Roboter01(Track track, StorageArea storageArea) {
        this.track = track;
        this.storageArea = storageArea;
        this.isOn = false;
    }

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

    public boolean placeBottleInBox(Bottle bottle) {
        if (isOn) {
            Box box = track.getBoxQueue().peek();
            if (box != null && box.addBottle(bottle)) {
                if (box.getBottleCount() == 9) {
                    storageArea.push(track.getBoxQueue().poll());
                    track.getBoxQueue().offer(new Box());
                }
                return true;
            }
        }
        return false;
    }
}
