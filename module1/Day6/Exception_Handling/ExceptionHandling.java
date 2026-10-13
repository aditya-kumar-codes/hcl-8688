package Day6.Exception_Handling;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {

            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally {
            System.out.println("This block is always executed.");
        }
    }
}
