// public class Hello {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
public class Hello {
    public static void printPascalTriangle(int n) {
        for (int line = 0; line < n; line++) {
            for (int i = 0; i <= line; i++)
                System.out.print((factorial(line)) / ((factorial(i))* (factorial(line - i))) + " ");

            System.out.println();
        }
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        printPascalTriangle(5);
    }
}