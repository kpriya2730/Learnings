package arrays.matrices;

/**
 * You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M)).
 * You have to subtract matrix A from B and return the resultant matrix. (i.e. return the matrix A - B).
 */
public class MatrixSubtraction {
    public int[][] solve(int[][] A, int[][] B) {
        int M = A.length;
        int N = A[0].length;

        int[][] result = new int[M][N];

        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                result[i][j] = A[i][j]-B[i][j];
            }
        }
        return result;
    }
}
