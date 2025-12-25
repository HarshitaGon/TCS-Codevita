/*
    Question 1 :-
    Problem Description -: Given an array Arr[ ] of N integers and a positive integer K.
    The task is to cyclically rotate the array clockwise by K.

    Note : Keep the first of the array unaltered.

    Example 1:
        5  —Value of N
        {10, 20, 30, 40, 50}  —Element of Arr[ ]
        2  —–Value of K
    Output :
    40 50 10 20 30

    Example 2:
        4  —Value of N
        {10, 20, 30, 40}  —Element of Arr[]
        1  —–Value of K
    Output :
    40 10 20 30
*/

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        k = k % n;

        int[] rotatedArr = new int[n];

        int index = 0;

        for (int i = n - k; i < n; ++i) {
            rotatedArr[index++] = arr[i];
        }

        for (int i = 0; i < n - k; ++i) {
            rotatedArr[index++] = arr[i];
        }

        for (int i = 0; i < n; ++i) {
            System.out.print(rotatedArr[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}

/*
    Step 1: Copy last k elements to front
            (Clockwise rotation → end elements come first)
    // Step 2: Copy remaining elements

*/
