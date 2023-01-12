package transport;

public class Bus extends Transport<DriverD> {


    public Bus(String brand, String model, float engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
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
}
