package Exceptions.Day2;

import java.io.FileNotFoundException;

public class Practice2 {
    public static void main(String[] args) {
        try {
            // System.out.println("Byeee");
            int a = 10, b =0 ;

            System.out.println(a/b);
            // System.out.println("ENd of B");
            // .... 1000 lines of code
            int[] arr = new int[5];
            arr[5] = 20;
        } catch(Exception e) {
            System.out.println("Handling code for the index");
        } catch(NullPointerException e) {
            System.out.println("Handling code for the arithmetic" + (10/2));
        } catch(ArrayIndexOutOfBoundException e) {
            System.out.println("Default Handling code");
        }

        System.out.println("End of the program");
    }
}
