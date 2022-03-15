package nl.atjays.online_course;

public class Main {

    //The main method is the starting point of any application.
    //An application can have only one entry point.
    public static void main(String[] args) {
        //Strings.
        //The Strings datatype in java is not a primitive type.
        //It is actually a class, but it has been made easier to use than regular classes.

        //So a String is actually just a bunch of characters in sequence.
        //When we discussed the char we saw it could only contain 1 character at a time.
        //However, a String can contain a large sequence of characters.
        //There is a limit to the memory used by a single string which is the MAX_VALUE of an int.
        //Which is 2.14something billion. so there's a lot of space.
        String myFirstString = "This sentence was saved in an String variable.";
        System.out.println("This sentence was a string literal.");
        System.out.println(myFirstString);
        System.out.println();

        //You can also perform concatenation by using the + operator.
        String mySecondString = "Mike Wazowsky";
        System.out.println("Hello, " + mySecondString + ".");
        System.out.println();

        //Or you can merge strings together and store them in a new String variable.
        String myThirdString = "Goodbye, " + mySecondString + ".";
        System.out.println(myThirdString);
        System.out.println();

        //When putting numbers in a string variable it won't add up because it is not of type int.
        //Lets look at the following examples. look at the numbers inside the ().
        //Here we have 2 string literals containing a number using the plus sign will just concatenate both Strings.
        //as a result we get an output of 1329
        System.out.println("The result of adding 2 string numbers with the plus operator: " + ("13" + "29"));

        //Next we have one String literal and one int.
        //Because there is a String in the output a calculation can not be made and both will also be concatenated.
        //as a result we get an output of 1329 on both outputs.
        System.out.println("The result of adding a int to a string number with a plus operator: " + ("13" + 29));
        System.out.println("The result of adding a int to a string number with a plus operator: " + (13 + "29"));

        //Here there are 2 ints no Strings therefore they can be added together and the result will be 42
        System.out.println("The result of adding 2 int numbers with a plus operator: " + (13 + 29));
    }

}
