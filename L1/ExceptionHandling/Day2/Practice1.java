package ExceptionHandling.Day2;

public class Practice1 {
    public static void main(String[] args) {
        // First Way
        // try {
        //     System.out.println("Start of the program");
        //     // 1000 lines of code
        //     int[] arr = new int[5];
        //     arr[6] = 100;
        //     // 10000 lines of code
        //     int a = 10;
        //     int b = 5;
        //     System.out.println(a/b);
        //     // 10000 lines of code
        //     System.out.println("End of the program");
        // } catch(Exception e) {
        //     System.out.println("Same code for every exception");
        // }



        // 2nd Way
        // try{
        //     System.out.println("Start of the program");
        //     // 1000 lines of code
        //     int[] arr = new int[5];
        //     // arr[6] = 100;
        //     // 10000 lines of code
        //     int a = 10;
        //     int b = 0;
        //     System.out.println(a/b);
        //     // 10000 lines of code
        //     System.out.println("End of the program");
        // } catch(ArithmeticException e) {
        //     System.out.println("Arithmetic way handling code");
        // } catch(ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Index way of handle");
        // } catch(Exception e) {
        //     System.out.println("Default code for other exception that may come");
        // }


        // System.out.println("Out of the try catch block");


        // 3rd Way
            System.out.println("Start of the program");
            // 1000 lines of code
            int[] arr = new int[5];
            try {
                arr[6] = 100;
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Index handling code");
            } catch(Exception e) {
                System.out.println("Default code");
            }
            // 10000 lines of code
            int a = 10;
            int b = 0;
            try {
             System.out.println(a/b);
            } catch(ArithmeticException e) {
                System.out.println("Arithmetic way of handling code");
            }
            // 10000 lines of code
            System.out.println("End of the program");
    }
}
