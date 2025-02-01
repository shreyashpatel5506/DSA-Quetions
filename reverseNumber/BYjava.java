package reverseNumber;

import java.util.Scanner;

public class BYjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0) {
            rev = n % 10 + rev * 10;
            n /= 10;
        }
        System.out.println("Reverse of the number is " + rev);
        sc.close();
    }
}