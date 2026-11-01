package CollectionFrameworkL2;

import java.util.Stack;
import java.util.Vector;

public class Practice2 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(1);
        stack.push(3);
        stack.push(7);
        System.out.println(stack.pop());

        // Vector v = new Vector();
        // for(int i = 1; i <= 10; i++) {
        //     v.add(i);
        // }
        // v.add(11);
        // System.out.println(v.capacity());
    }
}
