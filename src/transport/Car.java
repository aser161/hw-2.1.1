package transport;

public class Car extends Transport {

    public class Key {
        private final String remoteEngineStart;
        private final String keylessEntry;

        public Key(String remoteEngineStart, String keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }


        @Override
        public String toString() {

            return "Удаленный запуск двигателя: " + remoteEngineStart +
                    "\n"+ " Бесключевой доступ: " + keylessEntry ;
        }
    }


    private float engineVolume;

    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberSeats;
    private boolean isSummerRubber;



    public Car(String brand, String model, float engineVolume, String color,
               int year, String country, String transmission, String bodyType,
               String registrationNumber, int numberSeats, boolean isSummerRubber, int maxSpeed) {
        super(brand,model,year,country,color,maxSpeed);
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberSeats = numberSeats;
        this.isSummerRubber = isSummerRubber;


        if (engineVolume <= 0){
            this.engineVolume = 1.5f;
        }
        if (transmission == null || transmission == ""){
            this.transmission = "default";
        }
        if (registrationNumber == null || registrationNumber == ""){
            this.registrationNumber = "default";
        }
    }




    @Override
    public String toString() {

        return getBrand() + " " + getModel() + "\n объем двигателя: " +getEngineVolume() + "\n цвет кузова: " + getColor() +
                "\n год производства: " + getYear() + "\n страна сборки: " + getCountry() + "\n Коробка передач: " + getTransmission() + "\n Тип кузова: " +
                getBodyType() + "\n Регистрационный номер: " + getRegistrationNumber() + "\n Количество мест: " + getNumberSeats() +
                "\n резина: " + getSeasonRubber()  + "\n макс скорость: " + super.getMaxSpeed() +  " \n ";
    }



    public String getBodyType() {
        return bodyType;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public float getEngineVolume() {
        return engineVolume;
    }


    public String getTransmission() {
        return transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getSeasonRubber() {
        String season;
        if (isSummerRubber){
            season = "летняя";
        }else {
            season = "зимняя";
        }
        return season;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setSeasonRubber(int season) {
        if (season >= 1 && season <=3 || season == 11 || season == 12){
            isSummerRubber = false;
        }else if (season >= 4 && season <= 10){
            isSummerRubber = true;
        }
    }
}
