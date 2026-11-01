package Exceptions.Day3.ThrowKeyword;

public class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message) {
        super(message);
    }
}
