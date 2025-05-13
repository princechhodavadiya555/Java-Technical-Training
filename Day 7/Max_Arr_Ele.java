import java.util.*;

public class Max_Arr_Ele {
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

        System.out.println("The Largest element is: " +  arr[n - 1]);

        sc.close();
    }
}
