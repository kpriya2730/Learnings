package arrays.subarrays;

/**
 * Given an array of size N, Find the subarray with least average of size k.
 * Return the index of the first element of the subarray of size k that has least average.
 * Array indexing starts from 0.
 *
 * A=[3, 7, 90, 20, 10, 50, 40], B=3 // 3 [20, 10, 50]
 * A=[3, 7, 5, 20, -10, 0, 12], B=2 // 4 [-10, 0]
 *
 * TC: O(N)
 * SC: O(1)
 */
public class SubarrayWithLeastAverage {
    public int solve(int[] A, int B) {
        int idx = 0;
        int sum = 0;

        for(int i=0;i<B;i++){
            sum += A[i];
        }
        int leastSum = sum;

        for(int i=0;i<A.length-B;i++){
            sum = sum - A[i] + A[i+B];
            if(leastSum > sum){
                idx = i+1;
                leastSum = sum;
            }
        }

        return idx;
    }
}
