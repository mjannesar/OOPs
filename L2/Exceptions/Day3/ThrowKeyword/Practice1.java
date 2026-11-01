package Exceptions.Day3.ThrowKeyword;

public class Practice1 {
    public static void main(String[] args) {
        // unreachable code
        ArithmeticException obj = new ArithmeticException("Divide by zero from Ananya");
        throw obj; // explicitly throw the exception object
        System.out.println("This is the end of the program");


        // System.out.println(10/0);
        // System.out.println("This is the end of the program");
    }
}
