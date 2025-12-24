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

class Test {
    public static void main(String[] args) {

        for (int num = 2; num <= 10; num++) {   // numbers from 2 to 10
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
