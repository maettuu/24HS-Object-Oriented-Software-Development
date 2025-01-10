package behavioral.strategy;

public class Car {
    private IDriveStyle driveStyle;

    public Car(IDriveStyle driveStyle) {
        this.driveStyle = driveStyle;
    }

    public void setDriveStyle(IDriveStyle driveStyle) {
        this.driveStyle = driveStyle;
    }

    public void drive() {
        driveStyle.displaySpeed();
    }
}
