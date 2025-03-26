package mathematics;

import java.util.*;

public class absolutevalue {
    
    public int absolute(int I) {
        // code here
        return Math.abs(I);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int num = sc.nextInt();

        absolutevalue sol = new absolutevalue ();
        int result = sol.absolute(num);
        
        System.out.println("Absolute value: " + result);
    
    }
}
