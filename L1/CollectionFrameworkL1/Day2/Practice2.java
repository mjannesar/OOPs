package CollectionFrameworkL1.Day2;
import java.util.*;
public class Practice2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(new StringBuilder("abc"));
        set.add(new StringBuilder("cabc"));
        set.add(new StringBuilder("zabc"));
        set.add(new StringBuilder("yabc"));
        set.add(new StringBuilder("babc"));
        System.out.println(set);
        // StringBuilder s = "abc";
        // Integer a = 10;
        // if(s instanceof Comparable){
        //     System.out.println("This is a Comparable");
        // }
        // // TreeSet set = new 
        // set.add(10);
        // set.add(3);
        // set.add(9);
        // set.add(1);
        // System.out.println(set);
        // System.out.println(set.getFirst()+"  "+set.getLast());
    }

    static  class Employee {
        String name;
        int id;
        Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }
    }
}

