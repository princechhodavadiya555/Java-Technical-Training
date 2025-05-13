// Find Min. numbers from array

import java.util.*;

public class Min_Arr_Ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int smallElement = arr[0];

        System.out.println("The smallest element is: " + smallElement);

        sc.close();
    }
}