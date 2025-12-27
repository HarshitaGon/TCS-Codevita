/*
    Question 4 :-
    Problem Statement -: In this even odd problem Given a range [low, high] (both inclusive),
    select K numbers from the range (a number can be chosen multiple times) such that sum of those K numbers is even.

    Calculate the number of all such permutations.
    As this number can be large, print it modulo (1e9 +7).

    Constraints:
        0 <= low <= high <= 10^9
        K <= 10^6.

    Input:
        First line contains two space separated integers denoting low and high respectively
        Second line contains a single integer K.
    Output:
        Print a single integer denoting the number of all such permutations

    Time Limit:
    1

    Examples:

    Example 1:
    Input:
        4 5

        3
    Output:
        4

    Explanation:
    There are 4 valid permutations viz. {4, 4, 4}, {4, 5, 5}, {5, 4, 5} and {5, 5, 4} which sum up to an even number.

    Example 2:
    Input:
        1 10

        2
    Output:
        50

    Explanation:
    There are 50 valid permutations viz. {1,1}, {1, 3},.. {1, 9} {2,2}, {2, 4},… {2, 10} . . . {10, 2}, {10, 4},… {10, 10}.
    These 50 permutations, each sum up to an even number.
*/

import java.util.*;

public class Test {
    static final long MOD = 1000000007L;

    static long binaryExp(long base, long exp) {
        long result = 1;
        base %= MOD;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;
            exp >>= 1;
        }

        return result;
    }

    static long countEven(long low, long high) {
        return (high/2 - (low - 1)/2);
    }

    static long countOdd(long low, long high) {
        return (high - low + 1) - countEven(low, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long low = sc.nextLong();
        long high = sc.nextLong();
        long k = sc.nextLong();

        long E = countEven(low, high);
        long O = countOdd(low, high);

        /*
            EvenSum = ((E + O)^k + (E - O)^k) / 2
        */

        long total = binaryExp((E + O), k);     //(E + O)^k
        long diff = binaryExp(Math.abs(E - O), k);      //(E - O)^k

        long EvenSum = (total + diff) / 2;

        System.out.println(EvenSum);

        /*  Av mujhe Modular multiplicative inverse ka concept ny pata hai isiliye ye code ny kiye...
        
            long total = power(E + O, K);           // (E + O)^K
            long diff = power(Math.abs(E - O), K);  // |E - O|^K

            long inv2 = (MOD + 1) / 2; // modular inverse of 2

            long answer = (total + diff) % MOD;
            answer = (answer * inv2) % MOD;

            System.out.println(answer);
        */

        sc.close();
    }
}

/*
// count of odd, even
// E + e = e
o + o = e
e + o = o

k = 3 _ _ _

let's generlise this:


count of o = x
count of e = y
i = 0 -> x ^ 0 + y ^ k
i = 2 -> x ^ 2 + y ^ k - 2
*/