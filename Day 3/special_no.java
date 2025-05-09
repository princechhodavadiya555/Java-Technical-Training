/*
Write a Java program to find all *special two-digit numbers* between a given range.

A number is *special* if:

**(sum of digits + product of digits) == number**.

**Example:**

For input 10 to 99, output should include numbers like 59 because:

5 + 9 + (5×9) = 59.
*/

import java.util.Scanner;

public class special_no {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter lower range (10–99): ");
        int lower = scanner.nextInt();

        System.out.print("Enter upper range (10–99): ");
        int upper = scanner.nextInt();

        System.out.println("Special numbers between " + lower + " and " + upper + ":");

        for (int num = lower; num <= upper; num++) {
            int digit1 = num / 10;
            int digit2 = num % 10;
            
            int sum = digit1 + digit2;
            int product = digit1 * digit2;

            if (sum + product == num) {
                System.out.println(num);
            }
        }
    }
}
