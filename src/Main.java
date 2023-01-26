import transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws LicenseTypeException {

        List<Transport>autos = new ArrayList<>();
        Set <Driver> drivers = new HashSet<>();

        Mechanic mechanic1 = new Mechanic("Солерно", "Tetra");
        Mechanic mechanic2 = new Mechanic("Бородин", "Petra");
        Mechanic mechanic3 = new Mechanic("Капустин", "Metro");

        ServiceStation alexAuto = new ServiceStation("Alex Auto");


        DriverB driverB = new DriverB("Иванов ИИ", true, 5, "B");
        drivers.add(driverB);
        try {
            driverB.checkCategory();
        } catch (LicenseTypeException e){
            System.err.println(e.getMessage());
        }

        DriverD driverD = new DriverD("Котов ИИ", true, 9, "D");
        drivers.add(driverD);
        try {
            driverD.checkCategory();
        } catch (LicenseTypeException e){
            System.err.println(e.getMessage());
        }

        DriverC driverC = new DriverC("Петров ИИ", true, 7,"C");
        drivers.add(driverC);
        try {
            driverC.checkCategory();
        } catch (LicenseTypeException e){
            System.err.println(e.getMessage());
        }

        System.out.println(drivers);

        Iterator <Driver> iteratorDrivers = drivers.iterator();
        while (iteratorDrivers.hasNext()){
            System.out.println(iteratorDrivers.next());
        }

        Car ladaGranta = new Car("Lada", "Granta", 1.7f, driverB, Car.TypeOfBody.SEDAN);
        autos.add(ladaGranta);
        alexAuto.addAuto(ladaGranta);

//        printInfo(ladaGranta);
//        System.out.println(ladaGranta);

        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3, driverB, Car.TypeOfBody.SEDAN);
        autos.add(audiA8);
        alexAuto.addAuto(audiA8);
//        printInfo(audiA8);
 //       System.out.println(audiA8);

        Car bMWZ8 = new Car("BMW", "Z8", 3, driverB, Car.TypeOfBody.SEDAN);
        autos.add(bMWZ8);
//        printInfo(bMWZ8);
//        bMWZ8.printType();


        Car kiaSportage = new Car("Kia", "Sportage", 2.4f, driverB, Car.TypeOfBody.SUV);
        autos.add(kiaSportage);
//        printInfo(kiaSportage);


        Bus ford1 = new Bus("Ford", "Transit", 2, driverD, Bus.Capacity.VERY_LITTLE);
        autos.add(ford1);
        alexAuto.addAuto(ford1);
//        printInfo(ford1);
//        System.out.println(ford1);


        Bus ford2 = new Bus("Ford", "Transit", 2, driverD, Bus.Capacity.VERY_LITTLE);
        autos.add(ford2);
//        printInfo(ford2);
//        ford2.printType();

        Bus ford3 = new Bus("Ford", "Transit", 2,driverD, Bus.Capacity.LITTLE);
        autos.add(ford3);
//        printInfo(ford3);
//        ford3.passDiagnostics();

        Bus ford4 = new Bus("Ford", "Transit", 2,driverD, Bus.Capacity.LITTLE);
        autos.add(ford4);
 //       printInfo(ford4);


        Truck man1 = new Truck("MB", "Actros", 5,driverC, Truck.Carrying.N2);
        autos.add(man1);
//        printInfo(man1);
//        System.out.println(man1.getCarrying());

        Truck man2 = new Truck("MB", "Actros", 5,driverC, Truck.Carrying.N2);
        autos.add(man2);
        //printInfo(man2);
        //man2.printType();

        Truck man3 = new Truck("MB", "Actros", 5,driverC, Truck.Carrying.N2);
        autos.add(man3);
        //printInfo(man3);
       // System.out.println(man3);

        Truck man4 = new Truck("MB", "Actros", 5,driverC, Truck.Carrying.N2);
        autos.add(man4);
        //printInfo(man4);

        Transport.mechanics.put(ladaGranta, mechanic1);
        Transport.mechanics.put(bMWZ8, mechanic1);
        Transport.mechanics.put(audiA8, mechanic2);
        Transport.mechanics.put(kiaSportage, mechanic2);
        Transport.mechanics.put(man1, mechanic3);
        Transport.mechanics.put(man1, mechanic1);
        System.out.println(Transport.mechanics);


//        System.out.println(autos);
//        alexAuto.carryTO();
//        alexAuto.carryTO();
//        alexAuto.carryTO();
    }
    private static void printInfo(Transport <?> transport){
        System.out.println("водитель "+ transport.getDriver() +" управляет автомобилем "+ transport.getBrand() +" "+ transport.getModel() +" и будет участвовать в заезде");
    }
}
