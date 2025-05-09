/*
**Write a Java program to find the sum of even and odd digits of a given integer.**

- The program should prompt the user to enter an integer number.
- It should extract each digit from the number.
- It should calculate and display:
    - The sum of even digits.
    - The sum of odd digits.
*/

import java.util.Scanner;

public class sum_of_even_odd {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while (n != 0)
        {
            int digit = n % 10;
            if (digit % 2 == 0)
            {
                evenSum += digit;
            }
            else 
            {
                oddSum += digit;
            }
            n /= 10;
        }

        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
    }
}
