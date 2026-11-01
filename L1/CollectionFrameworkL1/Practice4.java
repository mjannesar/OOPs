package CollectionFrameworkL1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Practice4 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        for(int i = 1; i <= 10; i++) {
            v.add(i);
        }

        Enumeration obj = v.elements();
        //Enume
        while(obj.hasMoreElements()) {
            int operation = (Integer)obj.nextElement();
            System.out.println(operation*operation);
        }
    }
}
