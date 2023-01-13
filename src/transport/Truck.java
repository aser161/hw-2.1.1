package transport;

public class Truck extends Transport<DriverC> {

    public enum Carrying {
        N1 (0.001f, 3.5f),
        N2 (3.5f, 12),
        N3 (12,40);
        private float minCarrying;
        private float maxCarrying;

        Carrying(float minCarrying, float maxCarrying) {
            this.minCarrying = minCarrying;
            this.maxCarrying = maxCarrying;
        }

        public float getMinCarrying() {
            return minCarrying;
        }

        public float getMaxCarrying() {
            return maxCarrying;
        }

        @Override
        public String toString() {
            return "грузоподъемность от "+ minCarrying +"т до "+ maxCarrying +"т";
        }
    }
    private Carrying carrying;

    public Truck(String brand, String model, float engineVolume, DriverC driver, Carrying carrying) {
        super(brand, model, engineVolume, driver);
        this.carrying = carrying;
    }

    public Carrying getCarrying() {
        return carrying;
    }

    @Override
    public void printType() {
        if (carrying != null){
            System.out.println(getCarrying() );
        }else {
            System.out.println("Данных по транспортному средству недостаточно!");
        }
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
        return getBrand() + " " + getModel() +  "\n объем двигателя: " + getEngineVolume() + " \n " + carrying;
    }

}
