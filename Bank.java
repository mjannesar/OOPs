public class Bank {
    private static double balance;
    
    public static  void withdraw(double amount) {
        if(amount > balance) {
            // exception throw
            // if it is an object, then yeh class hoga
            InsufficientBalanceException obj = new InsufficientBalanceException("You need balance, you are poor");
            throw obj;
        }
        balance -= amount;
        
    }
    public static void main(String[] args) {
        withdraw(100);
    }
}
