package transport;

public class DriverB extends Driver {

    public DriverB(
            String fullName,
            boolean driverLicense,
            int practice
    ) {
        super(fullName, driverLicense, practice);
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
