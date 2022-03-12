package arrays.subarrays;

/**
 * You are given an integer array A of length N.
 * You have to find the sum of all subarray sums of A.
 * More formally, a subarray is a defined as a contiguous part of an array,
 * which we can obtain by deleting zero or more elements from either end of the array.
 * A subarray sum denotes the sum of all the elements of that subarray.
 *
 * A = [1, 2, 3] // 20
 * A = [2, 1, 3] // 19
 *
 * TC: O(N)
 * SC: O(1)
 */
public class SumOfAllSubarrays {
    public long subarraySum(int[] A) {
        long sum = 0;
        long N = A.length;

        for(int i=0;i<N;i++){
            sum = sum + (A[i] * (i+1) * (N-i));
        }

        return sum;
    }
}
