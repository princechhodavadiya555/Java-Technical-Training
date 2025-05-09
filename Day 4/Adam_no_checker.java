/*
Nikitha's teacher gave her an interesting number puzzle. A number is called an Adam Number if:

The square of the number, when reversed, is equal to the square of the reverse of that number.

Write a Java program that reads an integer n from the user and checks whether it is an Adam Number or not.
*/

import java.util.Scanner;

public class Adam_no_checker {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();


        int square = n * n;

        int reversed = 0;
        int temp = n;
        while (temp != 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }

        int squareOfReversed = reversed * reversed;

        int finalReverse = 0;
        temp = squareOfReversed;
        while (temp != 0) {
            finalReverse = finalReverse * 10 + (temp % 10);
            temp /= 10;
        }

        if (square == finalReverse){
            System.out.println("Adam Number");
        }else{
            System.out.println("Not Adam Number");
        }
    }
}
