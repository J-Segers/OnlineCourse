package nl.atjays.online_course;

public class Main {

    //The main method is the starting point of any application.
    //An application can have only one entry point.
    public static void main(String[] args) {

        //Casting.
        //Casting means to treat or convert a number from one type to another.

        //As we have seen arithmetics are done easily enough when it comes to ints.
        //However, when working with something else then ints you can get into some problems

        //Here is an example of an arithmetic expression.
        int intValue = 20;

        int dividedIntValue = (intValue / 2);
        System.out.println(dividedIntValue);

        //Let's look at this arithmetic expression that uses bytes.
        //First we assign a value to a byte variable.
        byte byteValue = 20;
        //Then we make a new byte variable that takes our byteValue variable and divides it by 2.
        //byte dividedByteValue = (byteValue / 2);
        //This gives an error because we are not using a literal number but a variable.
        //The ide handles the variable as it was an int because it is the default standard of the ide.

        //That is when casting comes into play.
        //By typing byte between parentheses before the arithmetic expression you basicly force the ide to use that.
        byte dividedByteValue = (byte) (byteValue / 2);

        //The same goes for shorts.
        short shortValue = 20;

        short dividedShortValue = (short) (shortValue / 2);
        System.out.println(dividedShortValue);

        //The general rule is to always use int unless you have a good reason to use something else.

    }

}
