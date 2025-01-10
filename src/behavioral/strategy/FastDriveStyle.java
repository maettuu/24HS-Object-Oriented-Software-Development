package behavioral.strategy;

public class FastDriveStyle implements IDriveStyle {
    @Override
    public void displaySpeed() {
        System.out.println("Driving fast.");
    }
}
