// Substraction of elements in array

import java.util.Scanner;

public class substract_in_array {
    public static void main(String[] args) {
        System.out.print("Enter Array Size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter Elements:");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = arr[0]; // Start with the first element
        System.out.print("Subtraction: ");

        for (int i = 1; i < n; i++) {
            result -= arr[i];
        }

        System.out.println(" = " + result);
    }
}
