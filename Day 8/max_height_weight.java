/*input of person = 5
now array store two things of each person(height(1),weight(1 person),then hieght weight of 2nd person and so on.)

output should be like two integers
first integer of person number in array whose height is large...
second integer of person number in array whose weight is large..
*/

// OR

/*
Takes input for n people.

Each person has two values: height and weight.

Stores them in a 1D array like: [h1, w1, h2, w2, h3, w3, ...].

Then outputs:

The person number (1-based) with maximum height.

The person number (1-based) with maximum weight.
*/

import java.util.Scanner;

public class max_height_weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        int[] arr = new int[n * 2];

        System.out.println("Enter heights and weights:");

        for (int i = 0; i < n * 2; i++) {
            arr[i] = sc.nextInt();
        }

        int maxHeight = arr[0];
        int maxHeightPerson = 1;

        int maxWeight = arr[1];
        int maxWeightPerson = 1;

        for (int i = 0; i < n; i++) {
            int height = arr[2 * i];
            int weight = arr[2 * i + 1];

            if (height > maxHeight) {
                maxHeight = height;
                maxHeightPerson = i + 1; // 1-based index
            }

            if (weight > maxWeight) {
                maxWeight = weight;
                maxWeightPerson = i + 1; // 1-based index
            }
        }

        System.out.println(maxHeightPerson + " " + maxWeightPerson);

        sc.close();
    }
}
