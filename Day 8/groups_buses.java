/* 
A bus stop queue has 'n' groups of people. The i-th group from the beginning has 'a[i]' people. Every 30 minutes an empty bus arrives at the bus stop, it can carry atmost 'm' people. Naturally, the people from the first group enter the bus first. Then goes the people from the second group and so on. Note that the order of groups in the queue never changes. Moreover, if some group cannot fit all of its members into the current bus, it waits for the next bus and joins with the other groups standing after them in the queue. Your task is to determine the number of buses needed to transport all 'n' groups to the Jeju Island countryside.

Input Format

The first line contains two integers n and m (1 ≤ n, m ≤ 100). The next line contains n integers: a1, a2, ..., an (1 ≤ ai ≤ m).

Output Format

Print a single integer — the number of buses needed to transport all n groups to the Jeju Island countryside. 
*/

import java.util.Scanner;

public class groups_buses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("No. of Groups , Capacity of Bus: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        System.out.println("Enter Group Size: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int busCount = 1;
        int currentCapacity = 0;

        for (int i = 0; i < n; i++) {
            if (currentCapacity + a[i] <= m) {
                currentCapacity += a[i];
            } else {
                busCount++;
                currentCapacity = a[i];
            }
        }

        System.out.println(busCount);
    }
}