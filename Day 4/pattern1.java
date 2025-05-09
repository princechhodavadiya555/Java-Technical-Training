/*
Code for Pattern like

1 2 3 4

1 2 3 4 

1 2 3 4

1 2 3 4
*/

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to next line
        }
    }
}
