package singleton;

public class DriverTest {
    public static void main(String[] args) {

        Driver d1 = Driver.getDriver(); //an object
        Driver d2 = Driver.getDriver(); //same object as above
        Driver d3 = Driver.getDriver(); //all new objects will be the same as the original one in terms of location

        System.out.println(d1); //returns the location ONLY (singleton.Driver@1540e19d)
        System.out.println(d2); //returns the location ONLY (singleton.Driver@1540e19d)
        System.out.println(d3); //returns the location ONLY (singleton.Driver@1540e19d)
    }
}
