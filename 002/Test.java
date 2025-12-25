/*
    Question 2 :-
    Problem Description -:  Given two non-negative integers n1 and n2, where n1 <= n2

    For example:
    Suppose n1=11 and n2=15.
    There is the number 11, which has repeated digits, but 12, 13, 14 and 15 have
    no repeated digits. So, the output is 4.

    Example1:
    Input:
        11 — Vlaue of n1
        15 — value of n2
    Output:
        4

    Example 2:
    Input:
        101 — value of n1
        200 — value of n2
    Output:
        72

    In simple words : Given two non-negative integers n1 and n2 (where n1 ≤ n2),
                      find the count of numbers between n1 and n2 (inclusive) that do not contain any repeated digits.
*/

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int count = 0;

        for (int i = n1; i <= n2; ++i) {
            boolean[] frequency = new boolean[10];
            int num = i;

            while (num > 0) {
                int digit = num % 10;

                if (frequency[digit])
                    break;

                frequency[digit] = true;
                num = num / 10;
            }

            if (num == 0)
                ++count;
        }

        System.out.println(count);
    }
}