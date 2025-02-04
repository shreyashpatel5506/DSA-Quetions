package longestsubarray;

import java.util.Scanner;

public class byJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max_subarray = 1;
        int count = 1;
        for (int i = 0; i < n; i++) {
            count = 1;
            for (int j = i; j < n - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    count++;
                    if (count > max_subarray) {
                        max_subarray = count;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println("The length of the longest subarray of 1's is " + max_subarray);
        sc.close();
    }

}