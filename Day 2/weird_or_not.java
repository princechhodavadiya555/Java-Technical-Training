/*
Given an integer n, perform the following conditional actions:

- If
n is odd, print "Weird"

- If
n is even and in the inclusive range of 2 to 5, print "Not Weird"

- If
n is even and in the inclusive range of 6 to 20, print "Weird"

- If
n is even and greater than 20, print "Not Weird"

Input Format
A single line containing a positive integer, n.

Output Format
Print "Weird" if the number is weird; otherwise, print "Not Weird".
*/

import java.util.Scanner;

public class weird_or_not {
    public static void main(String[] args) {
        System.out.println("Enter no:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && (n>1 && n<6)) {
            System.out.println("Not Weird");
        } else if (n % 2 == 0 && (n>5 && n<21)) {
            System.out.println("Weird");
        } else if(n % 2 == 0 && (n>20)){
            System.out.println("Not Wierd");
        }
    }
}