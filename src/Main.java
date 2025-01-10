import behavioral.observer.*;
import behavioral.strategy.*;
import creational.abstractfactory.*;
import creational.builder.*;
import creational.factorymethod.*;
import creational.singleton.*;
import structural.adapter.*;
import structural.bridge.*;
import structural.composite.*;
import structural.decorator.*;

public class Main {

    public static void main(String[] args) {
        executeCreational();
        executeStructural();
        executeBehavioral();
    }

    private static void executeCreational() {
        executeSingleton();
        executeFactoryMethod();
        executeAbstractFactory();
        executeBuilder();
    }

    private static void executeStructural() {
        executeAdapter();
        executeBridge();
        executeDecorator();
        executeComposite();
    }

    private static void executeBehavioral() {
        executeObserver();
        executeStrategy();
    }

    private static void executeSingleton() {
        Game.getInstance();
    }

    private static void executeFactoryMethod() {
        IGameFactory myGameFactory = new SinglePlayerGameFactory();
        IGame myGame = myGameFactory.createGame();
        myGame.start();

        myGameFactory = new MultiPlayerGameFactory();
        myGame = myGameFactory.createGame();
        myGame.start();
    }

    private static void executeAbstractFactory() {
        IUIFactory myUIFactory = new DarkThemeUIFactory();
        IButton myButton = myUIFactory.createButton();
        ITextField myTextField = myUIFactory.createTextField();
        myButton.render();
        myTextField.render();

        myUIFactory = new LightThemeUIFactory();
        myButton = myUIFactory.createButton();
        myTextField = myUIFactory.createTextField();
        myButton.render();
        myTextField.render();
    }

    private static void executeBuilder() {
        Model myModel = new Model.Builder("Alice", Gender.FEMALE)
                .height(170)
                .eyeColor(EyeColor.BLUE)
                .age(25)
                .hairColor(HairColor.BLONDE)
                .create();
        System.out.println(myModel);

        myModel = new Model.Builder("Max", Gender.MALE)
                .height(180)
                .eyeColor(EyeColor.BROWN)
                .age(28)
                .create();
        System.out.println(myModel);
    }

    private static void executeAdapter() {
        IMyCable myCable = new USBC();
        myCable.project();

        myCable = new USBCToHDMI();
        myCable.project();
    }

    private static void executeBridge() {
        IDevice myDevice = new Radio();
        IRemote myRemote = new BasicRemote(myDevice);
        myRemote.power();
        myRemote.increaseVolume();
        myRemote.power();

        myDevice = new TV();
        myRemote = new BasicRemote(myDevice);
        myRemote.power();
        myRemote.increaseVolume();
        myRemote.power();
    }

    private static void executeDecorator() {
        IFood myFood = new Pizza();
        System.out.println(myFood.getDescription());
        System.out.println("Cost: " + myFood.cost() + "$");

        myFood = new Salami(myFood);
        myFood = new Mushroom(myFood);
        myFood = new BellPepper(myFood);
        System.out.println(myFood.getDescription());
        System.out.println("Cost: " + myFood.cost() + "$");
    }

    private static void executeComposite() {
        ITask myTask1 = new Task("Task1");
        ITask myTask2 = new Task("Task2");

        TaskList myTaskList = new TaskList("TaskList");
        myTaskList.append(myTask1);
        myTaskList.append(myTask2);

        System.out.println(myTask1.getDescription());
        System.out.println(myTaskList.getDescription());
    }

    private static void executeObserver() {
        IDisplay myDisplay1 = new Display();
        IDisplay myDisplay2 = new Display();
        WeatherStation myWeatherStation = new WeatherStation();
        myWeatherStation.attach(myDisplay1);
        myWeatherStation.attach(myDisplay2);
        myWeatherStation.setTemperature(24);
    }

    private static void executeStrategy() {
        Car myCar = new Car(new SlowDriveStyle());
        myCar.drive();
        myCar.setDriveStyle(new FastDriveStyle());
        myCar.drive();
    }
}
