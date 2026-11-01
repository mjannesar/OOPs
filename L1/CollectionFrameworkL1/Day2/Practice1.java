package CollectionFrameworkL1.Day2;

import java.util.ArrayList;
import java.util.HashSet;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(5);
        al.add(1);
        al.add(2);
        HashSet set = new HashSet(al);
        // TreeSet tree = new TreeSet();
        String a = "Abc";
        String b = "Acd";
        System.out.println(b.compareTo(a)); // b and c
        
        System.out.println(set);
    }
}
