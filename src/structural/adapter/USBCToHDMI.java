package structural.adapter;

public class USBCToHDMI implements IMyCable {
    private HDMI hdmi;

    public USBCToHDMI() {
        this.hdmi = new HDMI();
    }

    @Override
    public void project() {
        hdmi.projectContent();
    }
}
