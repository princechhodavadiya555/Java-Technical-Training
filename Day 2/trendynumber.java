// Joey Tribbiani wanted to buy a meatball Sandwich and went to the nearby sandwich shop. There was a poster that said if anyone comes up with a program for Trendy Number they can get free Sandwiches for a lifetime as a gift. Can you help Joey to write a program to check whether the given number is a trendy number or not?
// A number is said to be a trendy number if it has 3 digits and the middle digit is divisible by 3.

import java.util.Scanner;

public class trendynumber {
    public static void main(String[] args) {
        System.out.println("Enter no:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 100 && n <= 999)
        {
            int mid = (n/10)%10;
            if (mid%3 == 0){
                System.out.println("It is Trendy Number.");
            }
            else{
                System.out.println("It is not Trendy Number.");
            }
        }
        else{
            System.out.println("Invalid Input !!");
        }
    }
}
