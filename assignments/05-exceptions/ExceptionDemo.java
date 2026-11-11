public class ExceptionDemo {
    // This method demonstrates how to handle exceptions in Java
    public static void main(String[] args) {
        System.out.println("Name: Faizan Ahmed Shaikha");
        System.out.println("Register Number: 25BTIT146");
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
