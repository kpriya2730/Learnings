package arrays.bitmanipulations;

/**
 * Arjun has a cat called Boomer. He decides to put his cat to the test for eternity.
 * He starts on day 1 with a stash of food unit, every next day the stash doubles.
 * If Boomer is well behaved during a certain day, she receives food worth equal to the stash on that day.
 * Boomer receives a net worth of A units of food. What is the number of days he was well behaved?
 *
 * 1 <= A <= 232-1
 *
 * A = 5 // 2, To eat a total of 5 units of food, Boomer behaved normally on Day 1 and on the Day 3.
 * A = 8 // 1, To eat a total of 8 units of food, Boomer behaved normally only on day 4.
 *
 * TC: O(log N)
 * SC: O(1)
 */
public class FindingGoodDays {
    public int solve(int A) {
        int numberOfWellBehavedDays = 0;

        while(A != 0){
            if((A&1) == 1){
                numberOfWellBehavedDays++;
            }
            A >>= 1;
        }

        return numberOfWellBehavedDays;
    }
}
