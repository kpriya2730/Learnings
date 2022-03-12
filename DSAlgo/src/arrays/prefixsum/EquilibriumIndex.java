package arrays.prefixsum;

/**
 * You are given an array A of integers of size N.
 * Your task is to find the equilibrium index of the given array
 * Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
 *
 * NOTE:
 * Array indexing starts from 0.
 * If there is no equilibrium index then return -1.
 * If there are more than one equilibrium indexes then return the minimum index.
 *
 * A=[-7, 1, 5, 2, -4, 3, 0] // 3
 * A=[1,2,3] // -1
 *
 * TC: O(N)
 * SC: O(1)
 */
public class EquilibriumIndex {
    public int solve(int[] A) {
        int leftSum = 0;
        int rightSum = 0;

        for(int num : A){
            rightSum += num;
        }

        for(int i=0;i<A.length;i++){
            rightSum -= A[i];

            if(leftSum == rightSum)
                return i;

            leftSum += A[i];
        }
        return -1;
    }
}
