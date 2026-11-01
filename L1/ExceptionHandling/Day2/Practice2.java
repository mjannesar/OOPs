package ExceptionHandling.Day2;

public class Practice2 {
    public static void main(String[] args) {
        // Always child to parent, this will give unreachable
        try {
            System.out.println(10/0);
        } catch(Exception e) {
            System.out.println("Default code");
        } catch(ArithmeticException e) {
            System.out.println("Only Arithmetic handling way");
        }
    }
}
