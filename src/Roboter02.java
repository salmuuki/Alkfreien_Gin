public class Roboter02 {
    private StorageArea storageArea;
    private boolean isOn;

    public Roboter02(StorageArea storageArea) {
        this.storageArea = storageArea;
        this.isOn = false;
    }

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

    public Box provideEmptyBox() {
        if (isOn) {
            Box emptyBox = new Box();
            storageArea.push(emptyBox);
            return emptyBox;
        }
        return null;
    }
}
