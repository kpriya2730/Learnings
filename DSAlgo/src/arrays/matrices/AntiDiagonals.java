package arrays.matrices;

/**
 * Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.
 * // Input
 * 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * // Output
 * 1 0 0
 * 2 4 0
 * 3 5 7
 * 6 8 0
 * 9 0 0
 *
 *
 */
public class AntiDiagonals {
    public int[][] diagonal(int[][] A) {
        int N = A.length;
        int[][] result = new int[2*N-1][N];

        int row = 0;

        for(int j=0;j<N;j++){
            int r = 0, c = j, col = 0;
            while(r < N && c >= 0){
                result[row][col] = A[r++][c--];
                col++;
            }
            while(col < N){
                result[row][col] = 0;
                col++;
            }
            row++;
        }

        for(int i=1;i<N;i++){
            int r = i, c = N-1, col = 0;
            while(r < N && c >= 0){
                result[row][col] = A[r++][c--];
                col++;
            }

            while(col < N){
                result[row][col] = 0;
                col++;
            }
            row++;
        }

        return result;
    }
}
