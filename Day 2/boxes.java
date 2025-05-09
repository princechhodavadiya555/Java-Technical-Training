//Nikitha and Danny are close friends. They both are studying in the same school. Now they are on summer vacation. As they are bored, they ask their parents to take them to an exhibition. Nikitha and Danny play a game. In this game, there are three boxes with some number written on top. There is a treasure in one of the three boxes and it is present in the box with the second largest number on top. Also, to open the box, they need to decode the correct code of this box. The clue given to them to find the code is that it is the largest number that divides all three given numbers. So, now help Nikitha and Danny to decode the code.


import java.util.Scanner;

public class boxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers on the boxes:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int secondLargest;

        if ((a > b && a < c) || (a > c && a < b)) {
            secondLargest = a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            secondLargest = b;
        } else {
            secondLargest = c;
        }

        System.out.println("The treasure is in the box with number: " + secondLargest);

        int gcd = a;

        while (b != 0) {
            int temp = b;
            b = gcd % b;
            gcd = temp;
        }

        while (c != 0) {
            int temp = c;
            c = gcd % c;
            gcd = temp;
        }

        System.out.println("The code to open the box is: " + gcd);
    }
}
