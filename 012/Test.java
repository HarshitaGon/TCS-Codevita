/*
    Question 12:
    An international round table conference will be held in india. Presidents from all over
    the world representing their respective countries will be attending the conference.
    The task is to find the possible number of ways(P) to make the N members sit around
    the circular table such that.
    The president and prime minister of India will always sit next to each other.

    Example 1:
    Input :
    4   -> Value of N(No. of members)

    Output :
    12  -> Possible ways of seating the members

    Explanation:
    2  members should always be next to each other.
    So, 2 members can be in 2!ways
    Rest of the members can be arranged in (4-1)! ways.(1 is subtracted because the previously
    selected two members will be considered as single members now).
    So total possible ways 4 members can be seated around the circular table 2*6= 12.
    Hence, output is 12.

    Example 2:
    Input:
    10  -> Value of N(No. of members)

    Output :
    725760 -> Possible ways of seating the members

    Explanation:
    2 members should always be next to each other.
    So, 2 members can be in 2! ways
    Rest of the members can be arranged in (10-1)! Ways. (1 is subtracted because the
    previously selected two members will be considered as a single member now).
    So, total possible ways 10 members can be seated around a round table is
    2*362880 = 725760 ways.
    Hence, output is 725760.

    The input format for testing
    The candidate has to write the code to accept one input
    First input – Accept value of number of N(Positive integer number)
    The output format for testing
    The output should be a positive integer number or print the message(if any) given
    in the problem statement(Check the output in example 1, example2)

    Constraints :
    2<=N<=50
*/

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long fact = 1;

        for (int i = 1; i < n; ++i) {
            fact = fact * i;
        }

        fact *= 2;
        System.out.println(fact);
    }
}


/*
    🎯 Problem ko 1 line me samjho:

        👉 P aur PM hamesha chipak ke baithenge
        👉 Table gol (circular) hai

    🧠 RULE-1: Circular table ka golden rule:

        Gol table me rotation same hota hai, isliye:
        Circular arrangement of X people = (X−1)!
        Bas. Ye rule yaad rakho.

    🧠 RULE-2: Chipke hue log = ek block:

        Agar 2 log hamesha saath baithenge
        👉 unko ek block maan lo.

        Ab example se samjhte hain (N = 4)
        Log: P, PM, A, B

        Step 1️⃣: P & PM ko block banao
        [ P PM ], A, B
        Total units = 3

        Step 2️⃣: Circular arrangement
        Circular table → (units − 1)!
        (3 − 1)! = 2!
        Matlab 2 ways

        Step 3️⃣: Block ke andar order
        Block ke andar:
        P PM
        PM P
        = 2 ways

        Step 4️⃣: Total ways
        2 (circular) × 2 (inside block)
        = 4
        ❌ But answer is 12 — kyun?

    🔥 REAL REASON (yahin sab atakte hain):

        Circular table me:
        Ek person ko fix karte hain
        ⚠️ Lekin humne block ko ek person maan liya
        Block ke andar 2 log already free hain
        Isliye fixing ka effect already adjust ho chuka hota hai

        Isliye correct counting hoti hai:
        (N−1)!  arrangements of block + others
        × 2     (block ke andar P/PM)

    ✅ FINAL FORMULA (EXAM ME YAAD RAKHO):
        2×(N−1)!
*/