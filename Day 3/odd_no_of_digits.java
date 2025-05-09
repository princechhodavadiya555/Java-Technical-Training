/*
The program reads an integer `N` from the user and counts how many numbers from **1 to `N`** have an **odd number of digits**.

- For each number `i` from `1` to `N`, it calculates how many digits it has.
- It checks if the digit count is **odd** using `digits % 2 != 0`.
- If true, it increments the `count`.

Finally, it prints the total count of numbers with an odd number of digits in that range.
*/

import java.util.Scanner;

public class odd_no_of_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= N; i++) {
            int num = i;
            int digits = 0;

            while (num != 0) {
                digits++;
                num /= 10;
            }

            if (digits % 2 != 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
