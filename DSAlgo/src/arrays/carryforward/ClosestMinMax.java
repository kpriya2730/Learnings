package arrays.carryforward;

/**
 * Given an array A. Find the size of the smallest subarray such that it contains atleast one occurrence of the maximum
 * value of the array and atleast one occurrence of the minimum value of the array.
 *
 * A = [1, 3] // 2
 * A = [2] // 1
 */
public class ClosestMinMax {
    public int solve(int[] A) {
        int min = A[0];
        int max = A[0];

        for(int num : A){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if(max == min)
            return 1;

        int maxIdx = -1;
        int minIdx = -1;
        int minLength = A.length;

        for(int i = 0;i < A.length;i++){
            if(A[i] == min){
                minIdx = i;
                if(maxIdx != -1)
                    minLength = Math.min(minLength, minIdx - maxIdx + 1);
            }

            if(A[i] == max){
                maxIdx = i;
                if(minIdx != -1)
                    minLength = Math.min(minLength, maxIdx - minIdx + 1);
            }
        }
        return minLength;
    }
}
