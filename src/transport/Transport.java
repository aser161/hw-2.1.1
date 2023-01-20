package transport;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport<A extends Driver> implements Competing {
    public static List<Mechanic> mechanics = new ArrayList<>();
    private final String brand;
    private final String model;
    private float engineVolume;

    private A driver;

    public Transport(String brand, String model, float engineVolume, A driver) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.driver = driver;
    }

    public void startMove(){
        System.out.println(getBrand() + " " + getModel() + " начал движение ");
    }

    public void finishMove(){
        System.out.println(getBrand() + " " + getModel() + " закончип движение ");
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public A getDriver() {
        return driver;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setDriver(A driver) {
        this.driver = driver;
    }

    public abstract void printType();

    public abstract void passDiagnostics();

    @Override
    public String toString() {

        return getBrand() + " " + getModel() +  "\n объем двигателя: " + getEngineVolume() + " \n ";
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand()+ " " + getModel());
        System.out.println("Остановился");
        System.out.println("Заправился");
        System.out.println("Прошел ТО");
        System.out.println("Продолжил гонку");
    }

    @Override
    public void bestTimeRound() {
        System.out.println(getBrand()+ " " + getModel());

        System.out.println(" Лучшее время круга");
    }

    @Override
    public void maxSpeed() {
        System.out.println(getBrand()+ " " + getModel());

        System.out.println(" Максимальная скорость");
    }
}

