package ExceptionHandling.Day2;

public class Practice3 {
    public static void main(String[] args) {
        // try {
        //     System.out.println("Open the connection");
        //     System.out.println("Some operation");
        // } catch(Exception e) {
        //     System.out.println("Default code");
        // } finally {
        //     System.out.println("Close the connection");
        // }

        // try {
        //     System.out.println("Open the connection");
        //     System.out.println(10/0);
        //     System.out.println("Some operation");
        // } catch(Exception e) {
        //     System.out.println("Default code");
        // } finally {
        //     System.out.println("Close the connection");
        // }


        // try {
        //     System.out.println("Open the connection");
        //     System.out.println(10/0);
        //     System.out.println("Some operation");
        // } catch(ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Default code");
        // } finally {
        //     System.out.println("Close the connection");
        // }

        try {
            System.out.println("Open the connection");
            System.out.println("Line 1");
            // line 400
            System.out.println("Line 401");
            System.exit(0);
            // System.out.println(10/0);
            System.out.println("Some operation");
        } catch(Exception e) {
            System.out.println("Default code");
        } finally {
            System.out.println("Finally ");
        }

    }
}
