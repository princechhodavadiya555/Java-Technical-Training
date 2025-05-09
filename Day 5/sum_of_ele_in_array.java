// Sum of elements inside array

import java.util.Scanner;

public class sum_of_ele_in_array {
    public static void main(String[] args) {
        System.out.print("Enter Array Size: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter Elements:");
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        System.out.println("ELements in array:");
        for (int i=0; i<n;i++){
            sum+=arr[i];
            System.out.println(arr[i]+"");
        }
        System.out.println("Sum: "+sum);
    }
}