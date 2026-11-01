package CollectionFrameworkL1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add("Arjun");
        obj.add(10);
        obj.add(false);
        obj.add(new Float(10.5));
        ArrayList obj1 = new ArrayList(obj);
        Collections.syn
        obj1.add(20);
        obj1 = obj;
        System.out.println(obj);
        System.out.println(obj1);
    }
}
