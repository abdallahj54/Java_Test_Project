package exception_handling.custom_exceptions;

public class Permission {

    /*
    Create a method called as isAgeValid, takes an int as an argument
    it returns true if the age is more than 16
    otherwise it throws an IllegalStateException with "Age of {age} is restricted!!!"

    it is a public static method
     */

    public static boolean isAgeValid(int age){
        if(age > 16) return true;
        throw new IllegalStateException("Age of " + age + " is restricted!!!");
    }


    /*
    Create a method that takes an int as an argument to state the day in the week
    1 - Sunday
    2 - Monday
    7 - Saturday

    method name = getCheckInHours()
    if it is weekday user is allowed to check in from 10am to 5pm
        "Check in hours are from 10am to 5pm"
    if it is weekend user is allowed to check in from 10am to 3pm
        "Check in hours are from 10am to 3pm"
    if the input is not in the range of 1-7, then throw an exception with message
    "The input does not represent any day!!!"
     */

    public static String getCheckInHours(int day){
        if(day == 1 || day == 7) return "Check in hours are from 10am to 3pm";
        else if(day > 1 && day < 7) return "Check in hours are from 10am to 5pm";
        throw new IllegalStateException("The input does not represent any day!!!");
    }
}
