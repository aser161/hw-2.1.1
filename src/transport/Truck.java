package transport;

public class Truck extends Transport<DriverC> {


    public Truck(String brand, String model, float engineVolume, DriverC driver) {
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
