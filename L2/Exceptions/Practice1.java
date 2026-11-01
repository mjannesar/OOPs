package Exceptions;

public class Practice1 {
    public static void main(String[] args) {
        A();
        System.out.println("End of main");
    }
    public static void A() {
        // .... lines
        int[] arr = new int[3];
        // arr[3] = 4;
        System.out.println("Heyyy");
        B();
         System.out.println("ENd of A");
    }
    public static void B() {
        try {
        System.out.println("Byeee");
        int a = 10, b =2 ;

        System.out.println(a/b);
        System.out.println("ENd of B")
        }
    }
}
