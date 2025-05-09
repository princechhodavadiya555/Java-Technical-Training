/*
Pattern (Hollow Square)
* * * * *
*       *
*       *
*       *
* * * * *
*/

import java.util.Scanner;

public class pattern6_hollow_square {
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
