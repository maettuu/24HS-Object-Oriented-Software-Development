package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IWeatherStation {
    private int temperature = 0;
    private List<IDisplay> displays = new ArrayList<>();

    @Override
    public void attach(IDisplay display) {
        displays.add(display);
    }

    @Override
    public void notifyDisplays() {
        for (IDisplay display : displays) {
            display.update();
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyDisplays();
    }
}
