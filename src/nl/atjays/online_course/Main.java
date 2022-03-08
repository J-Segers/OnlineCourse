package nl.atjays.online_course;

public class Main {

    //The main method is the starting point of any application.
    //An application can have only one entry point.
    public static void main(String[] args) {

        //Primitive Types 2
        //The float and the double.

        //Unlike whole numbers which we discussed in Primitive Types 1,
        //floating point numbers have fractional parts that are expressed with a decimal point.
        //For example the number π(3.14159265359) is a floating point number.

        //Floating point numbers are also called real numbers.
        //Floating point numbers are used when we need more precision in calculations.
        //There are 2 primitive types to express floating point numbers in Java.
        //The float and the Double.
        //The float is a single precision number and the double is a double precision number.
        //Meaning that the float has a memory allocation of 32 bits (a width of 32).
        //And the double has a memory allocation of 64 bits (a width of 64).

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;

        System.out.println("A float ranges from " + minFloatValue + " to " + maxFloatValue + ".");

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;

        System.out.println("A double ranges from " + minDoubleValue + " to " + maxDoubleValue + ".");
        System.out.println();

        //Let's make some variables.
        //Make an int, a float and a double variable and give them all a value of 10.
        int intValue = 10;
        float floatValue = 10;
        double doubleValue = 10;
        //This is accepted without issue.
        System.out.println(intValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println();
        //However, when adding a decimal point to the float You will get an error.
        //floatValue = 10.00;
        //Since a double is the floating point standard in the ide,
        //You have to put an f for float at the end of the number of a float variable,
        floatValue = 10.2f;
        //For a double it is not necessary to put a d at the end.
        //Having said that I do think it is a good habit to acquire.
        doubleValue = 10.3d;

        System.out.println("The sum of " + intValue + " + " + floatValue + " + " + doubleValue + " before casting = " + (intValue + floatValue + doubleValue));

        //When casting a float to an int the decimal point just gets cut off.
        int sum = (int) (intValue + floatValue + doubleValue);
        System.out.println("The sum of " + intValue + " + " + floatValue + " + " + doubleValue + " after casting = " + sum);
        System.out.println();


    }

}
