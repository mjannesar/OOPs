package Exceptions.Day3.ThrowKeyword;

public class Practice3 {
    public static void main(String[] args) {
       try{
         throw new InsufficientBalanceException("Your balance is not sufficient, baap se paisa se lelena");
       } catch(Exception e) {
        System.out.println("Handling code");
       }
    }
}
