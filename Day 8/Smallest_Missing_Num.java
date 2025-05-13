//Print Smallest Missing Element from an Array.

import java.util.*;

public class Smallest_Missing_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int smallestMissing = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == smallestMissing) {
                smallestMissing++;
            }
        }

        System.out.println("Smallest missing positive number is: " + smallestMissing);
    }
}
