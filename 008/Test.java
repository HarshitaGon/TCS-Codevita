/*
    Question 8:-
    Airport security officials have confiscated several item of the passengers at
    the security check point. All the items have been dumped into a huge box (array).
    Each item possesses a certain amount of risk[0,1,2]. Here, the risk severity of the
    items represent an array[] of N number of integer values. The task here is to sort the
    items based on their levels of risk in the array. The risk values range from 0 to 2.

    Example :
    Input :
        7  -> Value of N
        [1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element
        is separated by new line.

    Output :
        0 0 0 1 1 2 2  -> Element after sorting based on risk severity

    Example 2:
    input :
        10  -> Value of N
        [2,1,0,2,1,0,0,1,2,0] -> Element of arr[0] to arr[N-1], while input each
        element is separated by a new line.

    Output :
    0 0 0 0 1 1 1 2 2 2  ->Elements after sorting based on risk severity.

    Explanation:
    In the above example, the input is an array of size N consisting of only 0’s, 1’s
    and 2s. The output is a sorted array from 0 to 2 based on risk severity.
*/

import java.util.*;

public class Test {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int leftPtr = 0, rightPtr = n - 1, itrPtr = 0;

        while (itrPtr <= rightPtr) {
            if (arr[itrPtr] == 0) {
                swap(arr, itrPtr, leftPtr);
                ++itrPtr; ++leftPtr;
            }
            else if (arr[itrPtr] == 1) {
                ++itrPtr;
            }
            else {
                swap(arr, itrPtr, rightPtr);
                --rightPtr;
            }
        }

        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}

//This is a proper implementation of the Dutch National Flag algorithm.

// Dutch National Flag Algorithm :-
// Sort array containing only 0, 1 and 2 in one traversal.
// Use three pointers:
// left → position for 0
// itr  → current element
// right → position for 2
// If element is 0 → swap with left and move both
// If element is 1 → move itr
// If element is 2 → swap with right and move right
// Time: O(N), Space: O(1)
