package Exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Practice2 {
    public static void main(String[] args) {
        try {
            PrintWriter obj = new PrintWriter("abc");
            obj.append("Heyyy");
        } catch(FileNotFoundException f) {
            System.out.println("File is not there");
        }    
        System.out.println("End of the program"); 
    }
}
