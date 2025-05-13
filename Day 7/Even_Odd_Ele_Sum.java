import java.util.Scanner;

public class Even_Odd_Ele_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        System.out.println("Sum of the even elements of the array is " + evenSum);
        System.out.println("Sum of the odd elements of the array is " + oddSum);
    }
}