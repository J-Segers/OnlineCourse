package nl.atjays.online_course;

public class Main {

    //The main method is the starting point of any application.
    //An application can have only one entry point.
    public static void main(String[] args) {

        //Primitive types are the most basic of the DataTypes.
        //There are 8 primitive DataTypes.
        //Boolean, byte, char, double, float, int, long and short.
        //These are the building blocks of data manipulation.

        //A byte is a primitive dataType that ranges from -128 to 127.
        //A byte has a memory size of 8 bits this can be referenced by saying it has a width of 8.
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        System.out.println("The ranges from " + minByteValue  + " to " + maxByteValue + ".");

        //A short is a primitive dataType that ranges from -32768 to 32767
        //A short has a memory size of 16 bits this can be referenced by saying it has a width of 16.
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;

        System.out.println("The ranges from " + minShortValue + " to " + maxShortValue + ".");

        //An int is a primitive dataType that ranges from -2147483648 to 2147483647
        //An int has a memory size of 32 bits this can be referenced by saying it has a width of 32.
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        System.out.println("The ranges from " + minIntValue + " to " + maxIntValue + ".");

        //A long is a primitive dataType that ranges from -9223372036854775808 to 9223372036854775807
        //A long has a memory size of 64 bits this can be referenced by saying it has a width of 64.
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;

        System.out.println("The ranges from " + minLongValue + " to " + maxLongValue + ".");

        //Something to think of when using Long values is that some ide's handle everything as ints.
        //So in order to use long values you can type a lower or uppercase L after the number to force it to use a long datatype.
        //For example, I'm using Intellij and when I make a long literal value like  2_147_483_647_943 I will get an error saying that the integer number is too large.
        //So to fix this I put the L behind the number. This way the ide will treat it like a long value.
        long longLiteral = 2_147_483_647_943L;
        System.out.println(longLiteral);


        System.out.println();

        //overflow and underflow
        //If for example you add one to the maximum value of an int than you will get an overflow.
        System.out.println("the maximum value of an int = " + maxIntValue + ".");
        System.out.println("If we now add one to that maximum value the following happens.");
        System.out.println("The maximum value + 1 = " + (maxIntValue + 1));
        System.out.println();

        //The same is true for subtracting one of the minimum value of an int and this is called an underflow.
        System.out.println("the minimum value of an int = " + minIntValue + ".");
        System.out.println("If we now add one to that minimum value the following happens.");
        System.out.println("The minimum value + 1 = " + (minIntValue + 1));

        //Large Literal numbers can be quite hard to read sometimes therefor you can if you wish write down specific values with underscores like so.
        int literalInt = 2_147_483_647;
        //The output will be a normal number without the underscores.
        System.out.println(literalInt);

    }

}
