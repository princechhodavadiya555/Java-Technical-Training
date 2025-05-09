// Though there have been more successful pirates, Blackbeard is one of the best-known and widely-feared of his time. He commanded four ships and had a pirate army of 300 at the height of his career and defeated the famous warship, HMS “Scarborough” in sea-battle. He was known for barreling into battle clutching two swords with several knives and pistols at the ready. He captured over forty merchant ships in the Caribbean and without flinching killed many prisoners. Now, Blackbeard and his three pirates found a treasure of gold coins. Long Ben too joined them. They decided to share the treasure. Blackbeard agreed to give x% share for Long Ben. He then decided to take y% share from the remaining treasure. His other pirates will share the remaining gold coins equally. Write a program to compute their share's.

import java.util.Scanner;

public class pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Total = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        

        Double longben = Total * (x/100.0);
        Double rem = Total - longben;
        Double blackbeard = rem * (y/100.0);
        Double next_rem = rem - blackbeard;
        Double others = next_rem/3.0;
        
        System.out.println(longben);
        System.out.println(blackbeard);
        System.out.println(others);
        
    }
}
