package transport;

public class DriverB extends Driver {


    public DriverB(String fullName, boolean driverLicense, int practice, String category) throws LicenseTypeException {
        super(fullName, driverLicense, practice, category);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель В категории" + getFullName() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель В категории" + getFullName() + " закончил движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель В категории" + getFullName() + " заправляется");
    }
}
