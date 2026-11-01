package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Practice3 {
    public static void main(String[] args) {
        try{
        // FileWriter obj = new FileWriter("abcd.txt");
        // obj.append("Heyy");
        System.out.println(10/0);
        }catch(ArithmeticException e) {
            System.out.println("File is not there");
        }

        // int a = 10;
        // int b = 0;
        // System.out.println(a/b);
    }
}
