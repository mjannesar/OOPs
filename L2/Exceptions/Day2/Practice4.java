package Exceptions.Day2;

public class Practice4 {
    public static void main(String[] args) {
        // database open connection
        // operation (reading, writing)
        // closed connection
        try {
            System.out.println("Open connection"); 
           // resource allocation
            System.out.println("Reading the data from the database");
            System.out.println(10/0);
            System.exit(0); // status code 0 means normal termination and non zero means abnormal termination
            System.out.println("Heyyy");
            // lines of code

            // System.out.println("close connection"); // resource deallocation, cleanup
        } catch(ArithmeticException e) {
            System.out.println("Mongodb db another database link");
            int[] arr = new int[4];
            System.out.println(arr[5]);
            System.exit(0);
           
            // do some kind of operation
        } catch(Exception e) {
            System.out.println("Lines of code written by programer");
        } finally {
         System.out.println("Close connection, cleanup activities");
        }

        // finally {
        //     // it is designed especially for the cleanup activities, resource deallocation
        // }
    }
}

// 1, 10, 14, 17, 18, 22, 23, 25, 27, Sarthak () (Absent list)
