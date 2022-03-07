package sorting;

import java.util.Arrays;

/**
 * Given an array, calculate the number of noble integers present. Array has only distinct elements.
 * Noble integer -> A[i] is a noble integer if number of integer less than A[i] = A[i]
 *
 * EX: [1,-5,3,5,-10,4]
 *     [2,1,3,5,0,4]
 *     return 3 (3,5,4 are noble integers)
 */
public class NobleIntegers {

    public int solve(int[] A){
        int n =A.length;
        int count = 0;

        Arrays.sort(A);
        for(int i=1;i<n;i++){
            if(i == A[i])
                count++;
        }
        return count;
    }

    /**
     * if numbers are not distinct.
     * TODO
     */
    public int solve2(int[] A){
        return 0;
    }
}
