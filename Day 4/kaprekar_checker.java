/*
Jaffer wanted to excel in Math. He was learning about the Kaprekar number from Meena, his Maths teacher. She gave him a few random numbers and asked him to find out whether they are Kaprekar number or not.

(Consider an n-digit number k. Square it and add the right n digits to the left n or n-1 digits. If the resultant sum is k, then k is called a Kaprekar number. For example, 9 is a Kaprekar number since 9^2 = 81 & 8 + 1 = 9, similarly, 297 is a Kaprekar number as 297^2 = 88209 & 88 + 209 = 297 ).

Can you help Jaffer to write a program to find whether the given number is a Kaprekar number or not?
*/

import java.util.Scanner;

public class kaprekar_checker {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int temp = n;
        int square = n * n;

        while (n != 0) {
            n /= 10;
            count++;
        }

        int power = (int) Math.pow(10, count);

        int rem = square % power;
        int quo = square / power;

        int sum = rem + quo;

        if (temp == sum) {
            System.out.println(temp + " is a Kaprekar Number");
        } else {
            System.out.println(temp + " is Not a Kaprekar Number");
        }
    }
}
