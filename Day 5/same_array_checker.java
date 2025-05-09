// check both the arrays are same or different

import java.util.Scanner;

public class same_array_checker {
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

        boolean isSame = true;

        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                isSame = false;
                break;
            }
        }

        if (isSame) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
    }
}
