package arrays.matrices;

/**
 * You are given a matrix A, you have to return another matrix which is the transpose of A.
 * NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ; Where 1 ≤ i ≤ col and 1 ≤ j ≤ row
 * TC: O(MxN)
 * SC: O(MxN)
 */
public class MatrixTranspose {
    public int[][] solve(int[][] A) {
        int M = A.length;
        int N = A[0].length;

        int[][] result = new int[N][M];

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                result[i][j] = A[j][i];
            }
        }
        return result;
    }
}
