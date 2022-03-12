package arrays.subarrays;

/**
 * You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
 * But the sum must not exceed B.
 * Return a single integer which denotes the maximum sum.
 *
 * A = 5, B = 12, C = [2, 1, 3, 4, 5] // 12
 * A = 3, B = 1, C = [2, 2, 2] // 0
 */
public class MaximumSubarray {
    /* TC: O(N^2)
       SC: O(1)
     */
    public int maxSubarray(int A, int B, int[] C) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<A;i++){
            int sum = 0;
            for(int j=i;j<A;j++){
                sum += C[j];
                if(sum <= B && sum > maxSum)
                    maxSum = sum;
            }
        }
        return (maxSum == Integer.MIN_VALUE) ? 0 : maxSum;
    }

    /*
        if C doesn't have negative elements
        TC: O(N)
        SC: O(1)
     */

    public int maxSubarray2(int A, int B, int[] C){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;

        for(int end = 0;end<A;end++){
            sum += C[end];
            while(start <= end && sum > B){
                sum -= C[start];
                start++;
            }

            if(sum <= B)
                maxSum = Math.max(maxSum, sum);
        }
        return (maxSum == Integer.MIN_VALUE) ? 0 : maxSum;
    }

    /*
        TODO
        if C does have negative elements
        TC: ??
        SC: ??
     */
}
