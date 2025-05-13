/*
You are given an integer n followed by n space-separated binary strings. For each binary string:
Determine its length.
Create a new binary string of the same length such that:
The first half of the bits are '1'
The remaining bits are '0'
Print all resulting binary strings separated by a space.

Input Format:
The first line contains an integer n — the number of binary strings.
The second line contains n space-separated binary strings.

Output Format:
Print n space-separated binary strings generated according to the above logic.

Examples
Input:
2
01100101 0010111

Output:
11110000 1111000
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of binary inputs
        int n = Integer.parseInt(sc.nextLine());

        // Read the binary strings
        String[] binaries = sc.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            String bin = binaries[i];
            int len = bin.length();
            int half = len / 2;

            // Build output: first half 1s, rest 0s
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < len; j++) {
                if (j < half) sb.append('1');
                else sb.append('0');
            }

            System.out.print(sb.toString());
            if (i != n - 1) System.out.print(" ");
        }
    }
}
