package Exceptions.Day3.ThrowKeyword;

public class Practice2 {
    static ArithmeticException e;
    public static void main(String[] args) {
        // e = new ArithmeticException("Divide by zero from Nandini");
        // throw e;
        System.out.println(e);
        throw e;
    }
}
