package singleton;

public class Driver {

    //private instance of Driver cannot be accessed anywhere except this class
    private static Driver driver;

    //private constructor will prevent Driver class to be instantiated
    private Driver(){}

    //public getter method is the single access point to get Driver object, and it also ensures a second object is not being instantiated
    public static Driver getDriver(){
        if(driver == null) driver = new Driver();
        return driver;
    }
}
