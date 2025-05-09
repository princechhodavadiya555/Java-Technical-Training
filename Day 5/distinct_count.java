//Harish and Rajesh were developing a plan to find the ideal woman for Sheldon Cooper. There were puzzles, translations, and questions to check a person's intelligence. One such question was to come up with a program to count the number of distinct elements in an array. Harini is a postdoctoral researcher and a former graduate student of Caltech who is a huge fan of Sheldon's work and she wanted to impress Sheldon by writing a program to count the number of distinct element in an array. Can you help Harini?

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter Array Size: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter Elements:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (i == 0 || arr[i] != arr[i-1]){
                count++;
            }
        }
        System.out.println("Count of distinct numbers: "+count);
        
    }
}

