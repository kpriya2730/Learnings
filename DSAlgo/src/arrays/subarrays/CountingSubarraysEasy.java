package arrays.subarrays;

/**
 * Given an array A of N non-negative numbers and you are also given non-negative number B.
 * You need to find the number of subarrays in A having sum less than B. We may assume that there is no overflow.
 * A = [2, 5, 6], B = 10 // 4
 * A = [1, 11, 2, 3, 15], B = 10 // 4
 *
 * TC: O(N^2)
 * SC: O(1)
 */
public class CountingSubarraysEasy {
    public int solve(int[] A, int B) {
        int count = 0;
        int N = A.length;
        for(int i=0;i<N;i++){
            int sum = 0;
            for(int j=i;j<N;j++){
                sum += A[j];
                if(sum < B)
                    count++;
                else
                    break;
            }
        }

        return count;
    }
}
