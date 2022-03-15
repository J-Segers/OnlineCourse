package nl.atjays.online_course;

import java.beans.Expression;

public class Main {

    //The main method is the starting point of any application.
    //An application can have only one entry point.
    public static void main(String[] args) {

        //Operators, Operands and expressions.

        //Let's start with Operands.
        //An operand is a term used to describe any object that is manipulated by an operator.
        //For example
        //In this example the 2 and the 3 are the operands.
        System.out.println("The sum of operand " + 2 + " operand " + 3 + " = " + (2 + 3));
        //in this example num1 and num2 are the operands.
        int num1 = 2;
        int num2 = 3;
        System.out.println("The sum of operand num1 operand num2 = " + (num1 + num2));


        //Expressions

        //Simply put an expression is build out of operands and operators that evaluate in a single value.
        //2 + 2 = 4 is an expression.
        //In the following example the expression evaluates into a single value which is result.
        int result = 2 + 3;
        System.out.println(result);
        //The same goes for the next example.
        result = num1 + num2;
        System.out.println(result);


        //Operators.

        //Operators are the basic building blocks of any programming language.

        //Operators in Java are divided into 5 groups.
        //1. Arithmetic
        //2. Unary
        //3. Assignment
        //4. Comparison
        //5. Logical
        //6. Ternary
        //7. Bitwise
        //8. Shift
        //9. Instanceof

        //I'll give a brief summarization of each group and we'll go a little more in depth as we move on.

        //1. Arithmetic Operators are used to perform simple arithmetic operations on primitive data types.

        //2. Unary Operators need only one operand. They are used to increment, decrement or negate a value

        //3. Assignment Operator ‘=’ is used to assign a value to any variable.

        //4. Comparison Operator are used to check for relations like equality, greater than, less than.
        //   They return boolean results after the comparison and are extensively used in looping statements
        //   as well as conditional if-else statements

        //5. Logical Operators are used to perform “logical AND” and “logical OR” operations.

        //6. Ternary operator this is a shorthand version of the if-else statement.
        //   It has three operands and hence the name ternary.

        //7. Bitwise Operators are used to perform the manipulation of individual bits of a number.
        //   They can be used with any of the integer types.
        //   They are used when performing update and query operations of the Binary indexed trees.

        //8. Shift Operators are used to shift the bits of a number left or right,
        //   thereby multiplying or dividing the number by two, respectively.

        //9. Iinstanceof Operator is used for type checking. It can be used to test if an object is an instance of a class, a subclass, or an interface. General format-

        //The last 3 of these operators we will put aside for now, and we will focus on the first 6 operators.

    }

}
