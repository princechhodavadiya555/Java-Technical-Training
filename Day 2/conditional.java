//Check if a two-digit number is less than 20, determine if it's greater than 20 and odd/even, and validate the input.

import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        System.out.println("Enter no:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 0 || n > 99) {
            System.out.println("Invalid");
        } else if (n < 20) {
            System.out.println("Less than 20");
        } else if (n % 2 == 0) {
            System.out.println("Greater than 20 and even");
        } else {
            System.out.println("Greater than 20 and odd");
        }
    }
}
