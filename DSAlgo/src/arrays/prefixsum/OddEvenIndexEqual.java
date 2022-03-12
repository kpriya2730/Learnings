package arrays.prefixsum;

/**
 * Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from
 * these indices makes the sum of even-indexed and odd-indexed array elements equal.
 *
 * A=[2, 1, 6, 4] // 1
 * A=[1, 1, 1] // 3
 */
public class OddEvenIndexEqual {
    public int solve(int[] A) {
        int sumOddLeft = 0, sumEvenLeft = 0;
        int sumOddRight = 0, sumEvenRight = 0;
        int count = 0;

        for(int i=0;i<A.length;i++){
            if(i%2 == 0)
                sumEvenRight += A[i];
            else
                sumOddRight += A[i];
        }

        for(int i=0;i<A.length;i++){
            if(i%2 == 0){
                sumEvenRight -= A[i];
            }else{
                sumOddRight -= A[i];
            }

            int sumOdd = sumOddLeft + sumEvenRight;
            int sumEven = sumEvenLeft + sumOddRight;

            if(sumEven == sumOdd){
                count++;
            }

            if(i%2 == 0){
                sumEvenLeft += A[i];
            }else{
                sumOddLeft += A[i];
            }
        }

        return count;
    }
}
