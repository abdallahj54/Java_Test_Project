package singleton;

public class StudentTest {
    public static void main(String[] args) {

        Student s1 = Student.getStudent();
        Student s2 = Student.getStudent();
        Student s3 = Student.getStudent();

        System.out.println(s1); //prints the locations ONLY (singleton.Student@1540e19d)
        System.out.println(s2); //prints the locations ONLY (singleton.Student@1540e19d)
        System.out.println(s3); //prints the locations ONLY (singleton.Student@1540e19d)
    }
}
