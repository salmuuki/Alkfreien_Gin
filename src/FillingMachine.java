public class FillingMachine {
    private Tank tank;
    private Track track;
    private boolean isOn;

    public FillingMachine(Tank tank, Track track) {
        this.tank = tank;
        this.track = track;
        this.isOn = false;
    }

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

    public Bottle fillBottle() {
        if (isOn && tank.getContent() >= 500) {
            Bottle bottle = track.getBottleQueue().poll();
            if (bottle != null) {
                bottle.setFilled(true);
                tank.setContent(tank.getContent() - 500);
                track.getBottleQueue().offer(bottle);
                return bottle;
            }
        }
        return null;
    }
}
