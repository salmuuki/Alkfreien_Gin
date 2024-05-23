public class Application {

    public static void main(String[] args) {
        // Initialize components
        Tank tank = new Tank();
        Track track = new Track();
        StorageArea storageArea = new StorageArea();
        FillingMachine fillingMachine = new FillingMachine(tank, track);
        Roboter01 roboter01 = new Roboter01(track, storageArea);
        Roboter02 roboter02 = new Roboter02(storageArea);

        // Switch on machines
        fillingMachine.switchOn();
        roboter01.switchOn();
        roboter02.switchOn();

        // Fill and store bottles
        for (int i = 0; i < 27; i++) {
            Bottle bottle = fillingMachine.fillBottle();
            if (bottle != null) {
                roboter01.placeBottleInBox(bottle);
            }
        }

        // Check StorageArea
        int storedBoxes = storageArea.getStoredBoxesCount();
        if (storedBoxes == 3) {
            System.out.println("Test Passed: All boxes filled and stored correctly.");
        } else {
            System.out.println("Test Failed: Expected 3 boxes, found " + storedBoxes);
        }
    }
}
