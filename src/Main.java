import transport.*;

public class Main {
    public static void main(String[] args) {

        DriverB driverB = new DriverB("Иванов ИИ", true, 5);
        DriverC driverC = new DriverC("Петров ИИ", true, 7);
        DriverD driverD = new DriverD("Котов ИИ", true, 9);


        Car ladaGranta = new Car("Lada", "Granta", 1.7f, driverB, Car.TypeOfBody.SEDAN);
        printInfo(ladaGranta);
        System.out.println(ladaGranta);

        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3, driverB, Car.TypeOfBody.SEDAN);
        printInfo(audiA8);
        System.out.println(audiA8);

        Car bMWZ8 = new Car("BMW", "Z8", 3, driverB, Car.TypeOfBody.SEDAN);
        printInfo(bMWZ8);
        bMWZ8.printType();


        Car kiaSportage = new Car("Kia", "Sportage", 2.4f, driverB, Car.TypeOfBody.SUV);
        printInfo(kiaSportage);


        Bus ford1 = new Bus("Ford", "Transit", 2, driverD, Bus.Capacity.VERY_LITTLE);
        printInfo(ford1);
        System.out.println(ford1);


        Bus ford2 = new Bus("Ford", "Transit", 2, driverD, Bus.Capacity.VERY_LITTLE);
        printInfo(ford2);
        ford2.printType();

        Bus ford3 = new Bus("Ford", "Transit", 2,driverD, Bus.Capacity.LITTLE);
        printInfo(ford3);

        Bus ford4 = new Bus("Ford", "Transit", 2,driverD, Bus.Capacity.LITTLE);
        printInfo(ford4);


        Truck man1 = new Truck("MB", "Actros", 5,driverC, Truck.Carrying.N2);
        printInfo(man1);
        System.out.println(man1.getCarrying());

        Truck man2 = new Truck("MB", "Actros", 5,driverC, Truck.Carrying.N2);
        printInfo(man2);
        man2.printType();

        Truck man3 = new Truck("MB", "Actros", 5,driverC, Truck.Carrying.N2);
        printInfo(man3);
        System.out.println(man3);

        Truck man4 = new Truck("MB", "Actros", 5,driverC, Truck.Carrying.N2);
        printInfo(man4);
    }
    private static void printInfo(Transport <?> transport){
        System.out.println("водитель "+ transport.getDriver() +" управляет автомобилем "+ transport.getBrand() +" "+ transport.getModel() +" и будет участвовать в заезде");
    }
}