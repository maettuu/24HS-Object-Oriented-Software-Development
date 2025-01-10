package behavioral.observer;

import java.util.UUID;

public class Display implements IDisplay {
    private String id = UUID.randomUUID().toString();

    @Override
    public void update() {
        System.out.println("Display '" + id + "' has been updated.");
    }
}
