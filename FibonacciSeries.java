import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner sc = new Scanner(System.in);
        // Enter the number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();
        // Check wheather the number is positive or not
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci series up to " + n + " terms:");
            // Give the first two numbers in the series
            int firstTerm = 0, secondTerm = 1;
            // Print the first two numbers
            System.out.print(firstTerm);
            // Fibonacci series loop
            for (int i = 1; i < n; i++) {
                System.out.print(", " + secondTerm);
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
            System.out.println();
        }
    }
}
