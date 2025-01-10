package behavioral.strategy;

public class SlowDriveStyle implements IDriveStyle {
    @Override
    public void displaySpeed() {
        System.out.println("Driving slow.");
    }
}
