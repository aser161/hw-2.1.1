import transport.*;

public class Main {
    public static void main(String[] args) {

        DriverB driverB = new DriverB("Иванов ИИ", true, 5);
        DriverC driverC = new DriverC("Петров ИИ", true, 7);
        DriverD driverD = new DriverD("Котов ИИ", true, 9);


        Car ladaGranta = new Car("Lada", "Granta", 1.7f, driverB);
        printInfo(ladaGranta);

        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3, driverB);
        printInfo(audiA8);

        Car bMWZ8 = new Car("BMW", "Z8", 3, driverB);
        printInfo(bMWZ8);

        Car kiaSportage = new Car("Kia", "Sportage", 2.4f, driverB);
        printInfo(kiaSportage);


        Bus ford1 = new Bus("Ford", "Transit", 2, driverD);
        printInfo(ford1);

        Bus ford2 = new Bus("Ford", "Transit", 2, driverD);
        printInfo(ford2);

        Bus ford3 = new Bus("Ford", "Transit", 2,driverD);
        printInfo(ford3);

        Bus ford4 = new Bus("Ford", "Transit", 2,driverD);
        printInfo(ford4);

        Truck man1 = new Truck("MB", "Actros", 5,driverC);
        printInfo(man1);

        Truck man2 = new Truck("MB", "Actros", 5,driverC);
        printInfo(man2);

        Truck man3 = new Truck("MB", "Actros", 5,driverC);
        printInfo(man3);

        Truck man4 = new Truck("MB", "Actros", 5,driverC);
        printInfo(man4);
    }
    private static void printInfo(Transport <?> transport){
        System.out.println("водитель "+ transport.getDriver() +" управляет автомобилем "+ transport.getBrand() +" "+ transport.getModel() +" и будет участвовать в заезде");
    }
}