package arrays.prefixsum;

/**
 * Given an integer array A of size N. In one second you can increase the value of one element by 1.
 * Find the minimum time in seconds to make all elements of the array equal.
 *
 * A = [2, 4, 1, 3, 2] // 8
 * A = [2, 10, 1, 3, 2] // 32
 */
public class TimeToEquality {
    public int solve(int[] A) {
        int maxValue = A[0];
        for(int num : A){
            maxValue = Math.max(maxValue, num);
        }

        int time = 0;
        for(int num : A){
            time += (maxValue - num);
        }

        return time;
    }
}
