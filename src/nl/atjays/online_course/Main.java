package nl.atjays.online_course;

public class Main {

    //The main method is the starting point of any application.
    //An application can have only one entry point.
    public static void main(String[] args) {

        //Primitive types 3
        //Boolean and Char

        //Boolean.
        //A boolean can only allow two choices true or false.
        //The boolean is a useful tool and you will be using those a lot when programming.
        boolean booleanValueIsTrue = true;
        boolean booleanValueIsFalse = false;
        System.out.println(booleanValueIsTrue);
        System.out.println(booleanValueIsFalse);
        System.out.println();

        //Let's say you want to buy beer, but you have to be older than 21.
        //Than you can make a boolean and assign it true if they are older than 21 or false if they are not.
        boolean isOlderThanTwentyOne = true;
        System.out.println("This person claims to be older than 21.\n" +
                "Checking id... it is " + isOlderThanTwentyOne + " this person is older than 21.");
        System.out.println();


        //Char.
        //Unlike a string a char stores only one character.
        char charValue = 'A';
        System.out.println(charValue);
        System.out.println();

        //A char occupies 2 bytes of memory, or 16 bits(width of 16).
        //The reason a char occupies 2 bytes and not just one is to allow you to store unicode characters.
        //When passing a unicode to a char or string you do so by typing backslash + u + uniCode.
        char uniCodeChar = '\u0041';
        System.out.println("The UniCode \\u0041 represents " + uniCodeChar);
        System.out.println();

        //It's also possible to give an ASCII value to a char.
        char asciiValueChar = 65;
        System.out.println("The ASCII value of 65 is: " + asciiValueChar + ".");
        System.out.println();

        //In return you can also get an ascii value by setting a character as an int.
        int getAsciiValue = 'A';
        System.out.println("The ASCII number of 'A' is: " + getAsciiValue + ".");

    }

}
