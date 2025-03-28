package mathematics;

import java.util.*;
class Solution {

    public long factorial(int N) {
        // Your code here
        long result = 1;
        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to calculate its factorial:");
        int N = sc.nextInt();

        Solution sol = new Solution();
        long result = sol.factorial(N);

        System.out.println("The factorial of " + N + " is: " + result);
    }
}