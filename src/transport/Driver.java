package transport;


public abstract class Driver  {
private  String fullName;
private  boolean driverLicense;
private int practice;
private String category;


    public Driver(String fullName, boolean driverLicense, int practice, String category) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.practice = practice;
        this.category = category;
    }
    public void checkCategory() throws LicenseTypeException {
        if (category == null || category.isEmpty() ){
            throw new LicenseTypeException(" Необходимо указать верный тип прав!");
        }
    }

    public String getCategory() {
        return category;
    }

    public abstract void startMove();

    public abstract void finishMove();

    public abstract void refuel();


    public String getFullName() {
        return fullName;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public int getPractice() {
        return practice;
    }

    public void setPractice(int practice) {
        this.practice = practice;
    }

    @Override
    public String toString() {
        return fullName;
    }
}
