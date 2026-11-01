package CollectionFrameworkL1;

import java.util.Vector;

public class Practice2 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        for(int i = 1; i <= 10; i++) {
            v.add(i);
        }
        v.add(100);
        System.out.println(v.capacity());
    }
}
