package CollectionFrameworkL1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Practice5 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            al.add(i);
        }

        Iterator i = al.iterator();
        System.out.println(al);
        while(i.hasNext()) {
            int ele = (Integer)i.next();
            if(ele % 2 == 1) {
                i.remove();
            }
        }
        System.out.println(al);
    }
}
