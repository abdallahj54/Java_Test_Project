package practice.arrayListPractices;

public class FooBarPractice {
    public static void main(String[] args) {
        System.out.println("---Task 1---");
        printLucky();

        System.out.println("\n---Task 2---");
        printFooBar();
    }

    /*
    Task 1
    Create a public static method which will print numbers from 1 to 10, and it will print "Lucky" if it is dividable by "3"

    Example:
        1
        2
        Lucky
        4
        5
        Lucky
        7
        8
        Lucky
        10
     */
    public static void printLucky(){
        for (int i = 1; i <= 10; i++) {
            if(i % 3 == 0) System.out.println("Lucky");
            else System.out.println(i);
        }
    }

    /*
    Task 2
    Create a public static method which will print numbers from 1 to 10, and it will
    print "Foo" if it is dividable by "2"
    print "Bar if it is dividable by "5"
    print "FooBar" if it is dividable by "2" and dividable by "5"

    Example:
        1
        Foo
        3
        Foo
        Bar
        Foo
        7
        Foo
        9
        FooBar
     */
    public static void printFooBar(){
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0 && i % 5 == 0) System.out.println("Foobar");
            else if(i % 2 == 0) System.out.println("Foo");
            else if(i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }
    }

}
