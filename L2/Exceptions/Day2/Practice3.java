package Exceptions.Day2;

import java.io.FileNotFoundException;

public class Practice3 {
    public static void main(String[] args) {
        
            // System.out.println("Byeee");
            int a = 10, b =0 ;
            try {
              System.out.println(a/b);
            } catch(ArithmeticException e) {
                System.out.println("Arithmentic");
            } catch(Exception e) {
                System.out.println("Default");
            }
            System.out.println("Middle ");
            // .... 10000 lines of code
            int[] arr = new int[5];
            try {
                arr[5] = 20;
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Index");
            } catch(Exception e) {
                System.out.println(e);
            }

            System.out.println("ENd of the program");
        

        // System.out.println("End of the program");
    }
}
