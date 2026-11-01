class Practice {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        // exception is nothing but an object
        // throw object (exception jaisa)
        ArithmeticException obj = new ArithmeticException("Divide by zero from Suraj");
        throw obj; // 100% surety
        // System.out.println("End of the program");
    }
}