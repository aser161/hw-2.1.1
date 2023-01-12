package transport;


public abstract class Driver  {
private  String fullName;
private  boolean driverLicense;
private int practice;

    public Driver(String fullName, boolean driverLicense) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
    }

    public Driver(String fullName, boolean driverLicense, int practice) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.practice = practice;
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
