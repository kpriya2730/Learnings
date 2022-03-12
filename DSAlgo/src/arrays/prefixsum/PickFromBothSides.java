package arrays.prefixsum;

/**
 * Given an integer array A of size N.
 * You can pick B elements from either left or right end of the array A to get maximum sum.
 * Find and return this maximum possible sum.
 * NOTE: Suppose B = 4 and array A contains 10 elements then
 * You can pick first four elements or can pick last four elements or can pick 1 from front and 3 from back etc .
 * you need to return the maximum possible sum of elements you can pick.
 *
 * A = [5, -2, 3 , 1, 2], B = 3 // 8
 * A = [1, 2], B = 1 // 2
 */
public class PickFromBothSides {
    public int solve(int[] A, int B) {
        if(B == 0)
            return 0;

        int sum = 0;
        int head = 0;
        while(head < B){
            sum += A[head];
            head++;
        }
        int tail = A.length-1;
        int maxSum = sum;
        head--;

        while(head >= 0 && tail >= A.length-B){
            sum = sum - A[head] + A[tail];
            maxSum = Math.max(maxSum, sum);
            tail--;
            head--;
        }

        return maxSum;

    }
}
