package arrays.matrices;

/**
 * You are given a n x n 2D matrix A representing an image.
 * Rotate the image by 90 degrees (clockwise).
 * You need to do this in place.
 *
 * // Input:
 * [
 *     [1, 2],
 *     [3, 4]
 *  ]
 * // Output:
 * [
 *     [3, 1],
 *     [4, 2]
 *  ]
 *
 *  TC: O(N^2)
 *  SC: O(1)
 */
public class RotateMatrix {
    public void solve(int[][] A) {
        int N = A.length;
        int layer = 1;

        for(int row = 0;row<N-layer;row++){
            for(int col = row;col<N-layer;col++){
                int value = A[col][N-1-row];
                A[col][N-1-row] = A[row][col];
                A[row][col] = A[N-1-col][row];
                A[N-1-col][row] = A[N-1-row][N-1-col];
                A[N-1-row][N-1-col] = value;
            }
            layer++;
        }
    }

}
