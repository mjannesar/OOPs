package CollectionFrameworkL2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.RandomAccess;

public class Practice1 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        ArrayList obj = new ArrayList();
        String s = "abc";
        // if(obj instanceof RandomAccess) {
        //     System.out.println("This is a ArrayList");
        // }
        obj.add(1);
         obj.add(1);
          obj.add(2);
           obj.add(3);
            obj.add(1);
            // System.out.println(obj);
            obj.add("Abc");
            obj.add(new StringBuffer("425fre"));
            // ArrayList obj1 = new ArrayList(obj);
            System.out.println(obj);

    }
}
