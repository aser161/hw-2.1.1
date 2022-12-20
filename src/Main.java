import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta", 1.7f, "желтый", 2015, "Россия",
                "механика", "седан", "а121ее", 5, true);
        System.out.println(ladaGranta);

        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3, "черный", 2020, "Германия",
                "автомат", "седан", "а122ее", 5, true);
        System.out.println(audiA8);

        Car bMWZ8 = new Car("BMW", "Z8", 3, "черный", 2021, "Германия",
                "автомат", "седан", "а123ее", 5, true);
        System.out.println(bMWZ8);

        Car kiaSportage = new Car("Kia", "Sportage", 2.4f, "красный", 2018, "Южная Корея",
                "механика", "внедорожник", "а124ее", 5, true);
        System.out.println(kiaSportage);

        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Корея",
                "автомат", "седан", "а125ее", 5, true);
        System.out.println(hyundaiAvante);

        hyundaiAvante.setSeasonRubber(11);
        System.out.println(hyundaiAvante.getSeasonRubber());

    }
}