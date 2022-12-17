public class Car {

    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    @Override
   public String toString() {
    return brand + " " + model + "\n объем двигателя: " +engineVolume + "\n цвет кузова: " + color +
            "\n год производства: " + year + "\n страна сборки: " + country + "\n";
    }


}
