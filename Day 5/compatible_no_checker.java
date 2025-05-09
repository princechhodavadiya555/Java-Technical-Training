// Two arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater than or equal to the ith element in the second array for all elements. If the array size is zero or less then display the message "Invalid array size". Write a Java program to find whether 2 arrays are compatible or not. If the arrays are compatible display the message as "Arrays are Compatible", if not then display the message as "Arrays are Not Compatible".

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        System.out.println("Enter Elements of First Array:");
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter Elements of Second Array:");
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean compatible = true;

        for (int i = 0; i < n; i++) {
            if (arr1[i] < arr2[i]) {
                compatible = false;
                break;
            }
        }
        
        if (compatible) {
            System.out.println("Compatible");
        } else {
            System.out.println("Not Compatible");
        }
    }
}
