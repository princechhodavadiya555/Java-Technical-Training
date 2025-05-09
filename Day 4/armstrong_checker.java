// Armstrong number

import java.util.Scanner;

public class armstrong_checker {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        String nStr = scanner.next();  // Read as string
        scanner.close();

        int len = nStr.length();  // Length of the number
        int original = Integer.parseInt(nStr);  // Convert to int
        int n = original;

        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, len);
            n = n / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
