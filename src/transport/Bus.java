package transport;

public class Bus extends Transport<DriverD> {

public enum Capacity{
    VERY_LITTLE(1, 10),
    LITTLE(1, 25),
    MIDDLE(40, 50),
    BIG(60, 80),
    VERY_BIG(100, 120);
    private int minCapacity;
    private int maxCapacity;


    Capacity(int minCapacity, int maxCapacity) {
        this.minCapacity = minCapacity;
        this.maxCapacity = maxCapacity;
    }
}
    private Capacity capacity;

    public Bus(String brand, String model, float engineVolume, DriverD driver, Capacity capacity) {
        super(brand, model, engineVolume, driver);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    @Override
    public void printType() {
        System.out.println("Вместимость" + getCapacity() );
    }

    @Override
    public void pitStop() {
        super.pitStop();
    }

    @Override
    public void bestTimeRound() {
        super.bestTimeRound();
    }

    @Override
    public void maxSpeed() {
        super.maxSpeed();
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() +  "\n объем двигателя: " + getEngineVolume() + " \n Вместимость " + getCapacity();
    }
}
