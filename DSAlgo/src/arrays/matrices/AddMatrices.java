package arrays.matrices;

/**
 * You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
 *
 * A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]], B = [[9, 8, 7],[6, 5, 4],[3, 2, 1]] // [[10, 10, 10], [10, 10, 10], [10, 10, 10]]
 *
 * TC: O(N x M)
 * SC: O(N x M)
 */
public class AddMatrices {
    public int[][] solve(int[][] A, int[][] B) {

        int N = A.length, M = A[0].length;
        int[][] result = new int[N][M];

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }
}
