package transport;

public class DriverD extends Driver{


    public DriverD(String fullName, boolean driverLicense, int practice) {
        super(fullName, driverLicense, practice);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель С категории" + getFullName() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель С категории" + getFullName() + " закончил движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель С категории" + getFullName() + " заправляется");
    }
}