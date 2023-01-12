package transport;

public class Car extends Transport <DriverB> {


    public Car(String brand, String model, float engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand()+ " " + getModel());
        System.out.println("Остановился");
        System.out.println("Заправился");
        System.out.println("Поменял шины");
        System.out.println("Прошел ТО");
        System.out.println("Продолжил гонку");
    }

    @Override
    public void bestTimeRound() {
        super.bestTimeRound();
    }

    @Override
    public void maxSpeed() {
        super.maxSpeed();
    }
}