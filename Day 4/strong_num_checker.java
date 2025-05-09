// strong number checker

import java.util.Scanner;

public class strong_num_checker {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;

            // Calculate factorial directly inside the loop
            int fact = 1;
            for (int i = 2; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Strong Number");
        } else {
            System.out.println(num + " is Not a Strong Number");
        }
    }
}
