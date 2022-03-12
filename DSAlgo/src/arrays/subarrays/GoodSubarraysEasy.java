package arrays.subarrays;

/**
 * Given an array of integers A.
 * A subarray of an array is said to be good if it fulfils any one of the criteria:
 * 1. Length of the subarray must be even and the sum of all the elements of the subarray must be less than B.
 * 2. Length of the subarray must be odd and the sum of all the elements of the subarray must be greater than B.
 * Your task is to find the count of good subarrays in A.
 *
 * A = [1, 2, 3, 4, 5], B = 4 // 6
 * A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9], B = 65 // 36
 *
 * TC: O(N^2)
 * SC: O(1)
 */
public class GoodSubarraysEasy {
    public int solve(int[] A, int B) {
        int count = 0;
        int N = A.length;

        for(int i=0;i<N;i++){
            int sum = 0;
            int size = 0;
            for(int j=i;j<N;j++){
                size++;
                sum += A[j];

                if(size%2 == 0 && sum < B)
                    count++;
                else if(size%2 != 0 && sum > B)
                    count++;
            }
        }
        return count;
    }
}
