class Practice3 {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        // ArithmeticException obj = new ArithmeticException("Divide by zero from Suraj");
        try {

            throw new Exception("Divide by zero from Suraj");
        } catch(Exception e) {
            System.out.println("Hello");
        }
    }
}