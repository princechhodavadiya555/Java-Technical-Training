// write a program the sum of digits of a number until the sum becomes a single digit.

import java.util.Scanner;

public class sum_of_digits_till_zero {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;

        while (n != 0) {
            int r = n % 10;
            sum += r;
            n = n / 10;

            if (n == 0 && sum > 9) {
                n = sum;     // restart with the sum
                sum = 0;     // reset sum
            }
        }

        System.out.println("The single digit sum is: " + sum);
    }
}
