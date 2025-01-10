package structural.bridge;

public class Radio implements IDevice {
    private boolean isTurnedOn = false;

    @Override
    public void turnOn() {
        System.out.println("Radio is turned on.");
        isTurnedOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is turned off.");
        isTurnedOn = false;
    }

    @Override
    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    @Override
    public void setVolume() {
        System.out.println("New radio volume set.");
    }
}
