package arrays.carryforward;

/**
 * You are given an integer array A.
 * Decide whether it is possible to divide the array into one or more subarrays of even length such that first and last element of all subarrays will be even.
 * Return "YES" if it is possible otherwise return "NO" (without quotes).
 *
 * A = [2, 4, 8, 6] // YES
 *  A = [2, 4, 8, 7, 6] // NO
 */
public class EvenSubarrays {
    public String solve(int[] A) {
        int N = A.length;
        if(N%2 == 0 && (A[0]%2 == 0) && (A[N-1]%2 == 0))
            return "YES";
        return "NO";
    }
}
