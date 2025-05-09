/* Given a positive integer as input, perform the following operations repeatedly:

- If the number is even, divide it by 2
- If the number is odd, multiply it by 3 and add 1
Continue this process until the number becomes 1.

Write a program to print each number in this sequence.

This sequence is known as the Collatz conjecture or the "3n + 1" problem.
*/

import java.util.Scanner;

public class collatz {
    public static void main(String[] args) {
        System.out.println("Enter no:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n != 1){
            if(n%2==0){
                n=n/2;
            }
            else{
                n=(3*n)+1;
            }
            System.out.println(n);
        }
    }
}