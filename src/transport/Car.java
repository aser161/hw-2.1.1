package transport;

public class Car extends Transport <DriverB> {

    public enum TypeOfBody {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private String typeOfBodyTranslate;

        TypeOfBody(String typeOfBodyTranslate) {
            this.typeOfBodyTranslate = typeOfBodyTranslate;
        }

        public String getTypeOfBodyTranslate() {
            return typeOfBodyTranslate;
        }

        @Override
        public String toString() {
            return typeOfBodyTranslate;
        }
    }

    private TypeOfBody typeOfBody;

    public Car(String brand, String model, float engineVolume, DriverB driver, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume, driver);
        this.typeOfBody = typeOfBody;
    }


    @Override
    public void pitStop() {
        System.out.println(getBrand()+ " " + getModel());
        System.out.println("Остановился");
        System.out.println("Заправился");
        System.out.println("Поменял шины");
        System.out.println("Прошел ТО");
        System.out.println("Продолжил гонку");
    }

    @Override
    public void bestTimeRound() {
        super.bestTimeRound();
    }

    @Override
    public void maxSpeed() {
        super.maxSpeed();
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    @Override
    public void printType() {
        if (typeOfBody != null){
            System.out.println("тип кузова " + getTypeOfBody());
        }else {
            System.out.println("Данных по транспортному средству недостаточно!");
        }
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Авто "+ getBrand() + " " + getModel() + " прошёл диагностику");
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() +  "\n объем двигателя: " + getEngineVolume() + " \n тип кузова " + typeOfBody.getTypeOfBodyTranslate();
    }

}