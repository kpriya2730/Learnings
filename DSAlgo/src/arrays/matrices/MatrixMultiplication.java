package arrays.matrices;

/**
 * You are given two integer matrices A(having M X N size) and B(having N X P). You have to multiply matrix A with B and
 * return the resultant matrix. (i.e. return the matrix AB).
 *
 * TC: O(MxNxP)
 * SC: O(MxP)
 */
public class MatrixMultiplication {
    public int[][] solve(int[][] A, int[][] B) {
        int M = A.length;
        int N = A[0].length;
        int P = B[0].length;

        int[][] result = new int[M][P];

        for(int i=0;i<M;i++){
            for(int j=0;j<P;j++){
                for(int k=0;k<N;k++){
                    result[i][j] += A[i][k] * B[k][j];
                }

            }
        }
        return result;
    }
}
