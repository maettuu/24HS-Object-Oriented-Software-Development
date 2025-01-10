package structural.bridge;

public class TV implements IDevice {
    private boolean isTurnedOn = false;

    @Override
    public void turnOn() {
        System.out.println("TV is turned on.");
        isTurnedOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned off.");
        isTurnedOn = false;
    }

    @Override
    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    @Override
    public void setVolume() {
        System.out.println("New TV volume set.");
    }
}
