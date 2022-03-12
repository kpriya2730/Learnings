package arrays.prefixsum;

/**
 * You are given an integer array A of length N.
 * You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
 * For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
 * More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 *
 * A = [1, 2, 3, 4, 5], B = [[1, 4], [2, 3]] // [10, 5]
 */
public class RangeSumQuery {
    public long[] rangeSum(int[] A, int[][] B) {
        int N = A.length;
        long[] prefixSum = new long[N+1];
        prefixSum[0] = 0;
        for(int i=1;i<=N;i++){
            prefixSum[i] = (long)(prefixSum[i-1] + A[i-1]);
        }

        long[] result = new long[B.length];

        for(int i=0;i<B.length;i++){
            int L = B[i][0];
            int R = B[i][1];
            result[i] = (long)(prefixSum[R] - prefixSum[L-1]);
        }

        return result;
    }
}
