// code to write  reverse number of 3 digit number
import java.util.Scanner;

public class three_digit_reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // Assume n is a 3-digit number

        int last = n % 10;
        int middle =(n / 10) % 10;
        int first = n / 100;
        
        int reversed = last * 100 + middle * 10 + first;
        System.out.println(reversed);
    }
}