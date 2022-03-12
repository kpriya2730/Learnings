package arrays.matrices;

/**
 * You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0.
 * Specifically, make entire ith row and jth column zero.
 * Input:
 * [1,2,3,4]
 * [5,6,7,0]
 * [9,2,0,4]
 *
 * Output:
 * [1,2,0,0]
 * [0,0,0,0]
 * [0,0,0,0]
 */
public class RowToColumnZero {
    public int[][] solve(int[][] A) {
        int M = A.length;
        int N = A[0].length;

        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(A[i][j] == 0){
                    for(int c=0;c<N;c++){
                        if(A[i][c] != 0 && A[i][c] != -1){
                            A[i][c] = -1;
                        }
                    }

                    for(int r=0;r<M;r++){
                        if(A[r][j] != 0 && A[r][j] != -1){
                            A[r][j] = -1;
                        }
                    }

                    A[i][j]=-1;
                }
            }
        }

        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(A[i][j] == -1){
                    A[i][j]=0;
                }
            }
        }

        return A;
    }
}
