package behavioral.observer;

public interface IWeatherStation {
    void attach(IDisplay display);
    void notifyDisplays();
}
