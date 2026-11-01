package CollectionFrameworkL1;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {
        ArrayList marks = new ArrayList();
        obj.add("Arjun");
        obj.add(10);
        obj.add(false);
        obj.add("Mehul");
        obj.add(new Float(10.5));

        for(Object o : obj) {
            if(o instanceof String) {
                System.out.println("This is a string "+ o);
            } else if(o instanceof Boolean) {
                System.out.println("This is a boolean "+ o);
            }
        }
    }
}
