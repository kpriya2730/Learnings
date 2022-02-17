package arraysandmath;

/**
 * Google, FB, Amazon
 *
 * Given an array of size N, all are +ve numbers.
 * Return if there exists a majority element.
 *
 * Majority element: Number which has a frequency > N/2
 *
 * Condition: Do not use extra space.
 */
public class MajorityElement {
    /*
        3,4,3,5,6,1,3,2,5,3,3,3
        N = 11
        Frequency > 11/2 > 5
        Minimum frequency = 6

        Brute force: Nested for loop
        TC: O(n^2)
        SC: O(1)

        Approach 2 : Sorting approach
        3,4,3,5,6,1,3,2,5,3,3,3
        1,2,3,3,3,3,3,3,4,5,5,6
        TC: O(NlogN)
        SC: Depends on sorting algorithm (Merge sort is O(N), Quick sort is O(logN))

        Approach 3:

        1. Majority element occupies more than half of the array size. So at max we can have only 1 majority element.
        2. Count of majority element will be greater than the count of all the other elements combined.

        Implies, if I remove 2 distinct elements from the array, the majority element will not change.

        Moore's voting algorithm is based on the same observation.

        Delete 2 distinct elements everytime till you have a last standing element.The last standing element will be a
        ME if there exists a ME.

     */

    public int majorityElement(final int[] A) {
        int ME = 0;
        int count = 0;
        int N = A.length;

        for(int i=0;i<N;i++){
            if(ME == 0){
                ME = A[i];
                count++;
            }else if(ME == A[i]){
                count++;
            }else{
                count--;
                if(count == 0)
                    ME = 0;
            }
        }

        for(int num : A){
            if(num == ME){
                count++;
            }
        }

        if(count > N/2)
            return ME;

        return 0;
    }


}
