
import java.util.*;

class PerfectSquareChecker {
    public static boolean isPerfectSquare(int num) {
        if (num < 1) return false; // Edge case

        long x = num; // Start with the given number
        while (x * x > num) {
            x = (x + num / x) / 2; // Newton's method iteration
        }
        
        return x * x == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Checking if it's a perfect square
        if (isPerfectSquare(num)) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is NOT a perfect square.");
        }

        scanner.close();
    }
}
