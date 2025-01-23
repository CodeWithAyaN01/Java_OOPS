public class NestedTry {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block...");
            try {
                System.out.println("Inner try block...");
                int result = 10 / 0; // This will throw ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException in the inner catch block.");
            }
            // This code won't execute if an exception occurred in the inner try
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in the outer catch block.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
