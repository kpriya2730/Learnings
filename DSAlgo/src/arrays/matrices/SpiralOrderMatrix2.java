package arrays.matrices;

/**
 * Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order.
 * TC: O(A^2)
 * SC: O(A^2)
 */
public class SpiralOrderMatrix2 {
    public int[][] generateMatrix1(int A) {
        int[][] result = new int[A][A];

        int layer = 0;
        int direction = 0;
        int row = 0, col = 0;


        for(int value=1;value<=A*A;value++){
            result[row][col] = value;

            switch(direction){
                // Move right
                case 0:
                    if(col == A-layer-1){
                        row++;
                        direction=1;
                    }else{
                        col++;
                    }
                    break;
                // Move down
                case 1:
                    if(row == A-layer-1){
                        col--;
                        direction=2;
                    }else{
                        row++;
                    }
                    break;
                // Move left
                case 2:
                    if(col == layer){
                        row--;
                        direction=3;
                    }else{
                        col--;
                    }
                    break;
                // Move up
                case 3:
                    if(row == layer+1){
                        col++;
                        direction=0;
                        layer++;
                    }else{
                        row--;
                    }
                    break;
            }
        }
        return result;
    }
    public int[][] generateMatrix2(int A) {
        int[][] result = new int[A][A];
        int value = 1;
        int rowTop = 0, rowBottom = A-1;
        int colLeft = 0, colRight = A-1;

        int row = 0, col = 0;
        while(value <= A*A) {
            while(col <= colRight){
                result[row][col] = value;
                value++;
                col++;
            }
            col--;
            row++;
            rowTop++;

            while(row <= rowBottom){
                result[row][col] = value;
                value++;
                row++;
            }
            row--;
            col--;
            colRight--;

            while(col >= colLeft){
                result[row][col] = value;
                value++;
                col--;
            }
            col++;
            row--;
            rowBottom--;

            while(row >= rowTop){
                result[row][col] = value;
                value++;
                row--;
            }
            row++;
            col++;
            colLeft++;
        }
        return result;
    }
}
