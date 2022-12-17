public class Car {

    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, float engineVolume, String color, int year, String country){
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        if (brand==null || brand == ""){
            this.brand = "default";
        }
        if (model == null || model == ""){
            this.model = "default";
        }
        if (country == null || country == ""){
            this.country = "default";
        }
        if (color == null || color == ""){
            this.color = "default";
        }
        if (engineVolume <= 0){
            this.engineVolume = 1.5f;
        }
        if (year <= 0){
            this.year = 2000;
        }
    }

    @Override
   public String toString() {
    return brand + " " + model + "\n объем двигателя: " +engineVolume + "\n цвет кузова: " + color +
            "\n год производства: " + year + "\n страна сборки: " + country + "\n";
    }


}
