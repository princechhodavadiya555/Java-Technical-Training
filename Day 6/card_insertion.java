// Array insertion Arjuna and Karna were playing cards. Arjuna has 5 cards. Karna wants to insert a new card in between Arjuna's cards. Karna wants to find the position to insert the card. So help him to find the position to insert a certain card. If Karna inserts a card in a position other than the position of 5 cards, the game will be over. So play carefully. EXAMPLE: For example, consider an array having three elements in it initially and a[0] = 1, a[1] = 2 and a[2] = 3 and you want to insert a number 45 at location 1 i.e. a[0] = 45, so we have to move elements one step below after insertion a[1] = 1 , and a[2] = 2 and a[3] = 3.

import java.util.Scanner;

public class card_insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        
        System.out.print("Enter Elements of Second Array:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Position:");
        int position = sc.nextInt();
        System.out.print("card values wants to insert: ");
        int element = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            if(i==position-1){
                System.out.print(element +" ");
            }
            System.out.print(arr[i]+" ");
        }
    }
}
