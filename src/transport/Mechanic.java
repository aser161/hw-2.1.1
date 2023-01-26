package transport;

public class Mechanic {
    private final String fullName;
    private String company;


    public Mechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void carryTO(Transport transport){
        System.out.println("Механик " + getFullName() + " провёл ТО " + transport.getBrand()+ " " + transport.getModel());
    }

    public void fixTransport(Transport transport){
        System.out.println("Механик " + getFullName() + " отремонтировал " + transport.getBrand()+ " " + transport.getModel());
    }

    @Override
    public String toString() {
        return "Механик " + getFullName() ;
    }
}
