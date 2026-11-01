package CollectionFrameworkL1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;

public class Practice6 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            al.add(i);
        }

        ListIterator li = al.listIterator();
        while(li.hasNext()) {
            int data = (Integer)li.next();
            if(data % 2 == 1) {
                li.set(data+5);
            } else if(data == 4) {
                li.add("Jannesar");
            } else if(data == 6) {
                li.remove();
            }
        }

        System.out.println(al);
    }
}
