package arrays.interviewproblems;

/**
 * Given an array of integers A, of size N.
 * Return the maximum size subarray of A having only non-negative elements.
 * If there are more than one such subarrays, return the one having the earliest starting index in A.
 * NOTE: It is guaranteed that an answer always exists.
 *
 * A = [5, 6, -1, 7, 8] // [5, 6]
 * A = [1, 2, 3, 4, 5, 6] // [1, 2, 3, 4, 5, 6]
 */
public class MaximumPositivity {
    public int[] solve(int[] A) {
        int idx = -1;
        int maxLength = 0;
        int length = 0;

        for(int i=0;i<A.length;i++){
            if(A[i] >= 0){
                length++;
            }else{
                length = 0;
            }
            if(length > maxLength){
                idx = i-length+1;
                maxLength = length;
            }
        }
        int[] subarray = new int[maxLength];
        for(int i=idx,j=0;i<idx+maxLength;i++,j++){
            subarray[j] = A[i];
        }
        return subarray;
    }
}
