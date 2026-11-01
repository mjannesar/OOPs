package ExceptionHandling;

public class Practice2 {
    public static void main(String[] args) {
        A();
    }

    public static void A() {
        System.out.println(10/0);
        B();
    }
    public static void B() {
        System.out.println("Bye");
    }
}
