package singleton;

public class Student {

    //private instance of Driver cannot be accessed anywhere except this class
    private static Student student;

    //private constructor will prevent Driver class to be instantiated
    private Student(){}

    //public getter method is the single access point to get Driver object, and it also ensures a second object is not being instantiated
    public static Student getStudent(){
        if(student == null) student = new Student();
        return student;
    }
}
