package nl.atjays.online_course;

public class Main {

    //The main method is the starting point of any application.
    //An application can have only one entry point.
    public static void main(String[] args) {

        //The standard when learning programming is to write code that outputs hello world.
        //the following line prints Hello, World! to the console.
        System.out.println("Hello, World!");

        //Variables.
        //Variables can consist of lots of different DataTypes. DataTypes are Keywords in Java.

        //int is the type / DataType of the variable in this case an integer / whole number.
        //After specifying the DataType you give it a name here called myFirstNumber.
        //And after that you initialize the variable by giving it a value. The value of this variable is 5.
        int myFirstNumber = 5;
        //This entire line is a statement or a declaration statement to be precise.

        //the following line prints the value of the variable myFirstNumber to the console.
        System.out.println(myFirstNumber);

        //Java Operators.
        //Operators perform operations.
        //Four common operators are +, -, * and /.
        //You can use an arithmetic expression to assign a value to a variable.

        //Variables can be reassigned.
        //By calling the name of the variable without the int because we already created this variable.
        //after calling the variable we assign it a new value in the form of an arithmetic expression.
        myFirstNumber = 9 * (4 - 2) + 6;

        System.out.println(myFirstNumber);

        int mySecondNumber = 12;
        int myThirdNumber = 6;

        //Variables can also be assigned a value by adding other variables together through an arithmetic expression.
        //Here we make a new variable and assign it the sum of myFirstNumber, mySecondNumber and myThirdNumber.
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.println(myTotal);

        //It is also possible to use an integer number and a variable to assign a new value to a variable.
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }

}
