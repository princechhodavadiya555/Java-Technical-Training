// Cubic Sum: Given function:
//Int isCubicSumExist(long long int A[], int N);
// The function accept an array A of size N implement the function to return the count of good integers in array A. An integer Z is said to be good if and only if there exist two integers x and y such that x3 + y3 = Z.
// Input: N:3, A:[35,9,1]
// Output: 2
// Explanation: 35 is a good integre, there exist an answer with X = 2, y = 3(23 + 33 = 8 + 27 = 35)

import java.util.Scanner;

public class isCubicSUmExists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array Size: ");
        int N = sc.nextInt();
        int[] A = new int[N];

        System.out.println("Enter Elements");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int count = 0;

        for (int k = 0; k < N; k++) {
            int num = A[k];
            boolean isGood = false;

            for (int x = 1; x * x * x <= num; x++) {
                for (int y = 1; y * y * y <= num; y++) {
                    if (x * x * x + y * y * y == num) {
                        isGood = true;
                        break;
                    }
                }
                if (isGood) break;
            }

            if (isGood) {
                count++;
            }
        }

        System.out.println("Count of good integers: " + count);
        sc.close();
    }
}
