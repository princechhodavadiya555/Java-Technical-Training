/*
Write a Java program that takes two integers `num` and `m` as input. The program should find the closest multiple of `m` to `num`. If the distance from `num` to the lower multiple is the same as the distance to the upper multiple, the program should return the upper multiple.

For example:

1. If `num = 15` and `m = 6`, the closest multiple would be `12` (distance to 12 is 3, while distance to 18 is 3, so the upper multiple, 18, is printed).
2. If `num = 14` and `m = 5`, the closest multiple would be `15` (distance to 15 is 1, which is closer than distance to 10).

**Input:**

- The program should first prompt the user to enter two integers: `num` and `m`.

**Output:**

- The program should print the closest multiple of `m` to `num`, considering the condition above.
*/

import java.util.Scanner;

public class closet_multiple {
    public static void main(String[] args) {
        System.out.println("Enter two numbers (num and m):");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int m = scanner.nextInt();

        int q = num / m;

        int lower = m * q;
        int upper = m * (q + 1);

        int distToLower = Math.abs(num - lower);
        int distToUpper = Math.abs(num - upper);

        if (distToLower < distToUpper) {
            System.out.println(lower);
        } else if (distToLower > distToUpper) {
            System.out.println(upper);
        } else {
            System.out.println(upper);
        }

        scanner.close();
    }
}
