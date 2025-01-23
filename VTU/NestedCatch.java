public class NestedCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Try block...");
            int[] arr = new int[3];
            arr[5] = 10; // This will throw ArrayIndexOutOfBoundsException
            int result = 10 / 0; // This will throw ArithmeticException (unreachable due to first exception)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero.");
        } catch (Exception e) {
            System.out.println("Caught General Exception.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
