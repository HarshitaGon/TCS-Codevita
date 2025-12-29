/*
    Question 7:-
    Jack is always excited about sunday. It is favourite day, when he gets to play
    all day. And goes to cycling with his friends.
    So every time when the months starts he counts the number of sundays he will get
    to enjoy. Considering the month can start with any day, be it Sunday, Monday…. Or so on.

    Count the number of Sunday jack will get within n number of days.

    Example 1:
    Input:
        mon-> input String denoting the start of the month.
        13 -> input integer denoting the number of days from the start of the month.

    Output:
        2 -> number of days within 13 days.

    Explanation:
    The month start with mon(Monday). So the upcoming sunday will arrive in next 6 days.
    And then next Sunday in next 7 days and so on.
    Now total number of days are 13. It means 6 days to first sunday and then remaining 7
    days will end up in another sunday. Total 2 sundays may fall within 13 days.
*/

import java.util.*;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> days = new HashMap<>();
        days.put("mon", 1);
        days.put("tue", 2);
        days.put("wed", 3);
        days.put("thu", 4);
        days.put("fri", 5);
        days.put("sat", 6);
        days.put("sun", 7);

        String monthStart = sc.next();
        int n = sc.nextInt();

        int firstSun = (7 - days.get(monthStart)) % 7;
        int totalSun = 0;

        if (firstSun < n)
            totalSun = 1 + (n - firstSun - 1) / 7;

        System.out.println(totalSun);

        sc.close();
    }
}