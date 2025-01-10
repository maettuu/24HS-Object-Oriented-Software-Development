package structural.adapter;

public class USBC implements IMyCable {
    @Override
    public void project() {
        System.out.println("USB C is projecting.");
    }
}
