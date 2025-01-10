package structural.bridge;

public class BasicRemote implements IRemote {
    private IDevice device;

    public BasicRemote(IDevice device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (device.isTurnedOn()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    @Override
    public void increaseVolume() {
        device.setVolume();
    }
}
