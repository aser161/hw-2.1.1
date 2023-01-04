package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;



    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.maxSpeed = maxSpeed;

        if (color == null || color == ""){
            this.color = "default";
        }
        if (maxSpeed<= 0){
            this.maxSpeed = 100;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {

        return getBrand() + " " + getModel() +  "\n цвет кузова: " + getColor() + "\n год производства: " + getYear() +
                "\n страна сборки: " + getCountry() + "\n макс скорость: " + getMaxSpeed()  + " \n ";
    }

}

