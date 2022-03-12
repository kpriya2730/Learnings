package arrays.matrices;

/**
 * You are given a 2D integer matrix A, return a 1D integer vector containing column-wise sums of original matrix.
 *
 * Input
 * [1,2,3,4]
 * [5,6,7,8]
 * [9,2,3,4]
 *
 * Output {15,10,13,16}
 *
 * TC: O(NxM)
 * SC: O(M)
 */
public class ColumnSum {
    public int[] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;

        int[] result = new int[M];

        for(int j=0;j<M;j++){
            int sum = 0;
            for(int i=0;i<N;i++){
                sum += A[i][j];
            }
            result[j] = sum;
        }
        return result;
    }
}
