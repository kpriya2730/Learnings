package arrays.subarrays;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given an integer array A of length N comprising of 0's & 1's, and an integer B.
 * You have to tell all the indices of array A that can act as a centre of 2 * B + 1 length 0-1 alternating subarray.
 * A 0-1 alternating array is an array containing only 0's & 1's, and having no adjacent 0's or 1's.
 * For e.g. arrays [0, 1, 0, 1], [1, 0] and [1] are 0-1 alternating, while [1, 1] and [0, 1, 0, 0, 1] are not.
 *
 * A = [1, 0, 1, 0, 1], B = 1 // [1, 2, 3]
 * A = [0, 0, 0, 1, 1, 0, 1], B = 0 // [0, 1, 2, 3, 4, 5, 6]
 *
 * TC: O(N)
 * SC: O(N)
 *
 */
public class AlternatingSubarraysEasy {
    public int[] solve(int[] A, int B) {
        List<Integer> indices = new ArrayList<>();

        int length;
        int start = 0;
        int windowSize = 2 * B + 1;


        for(int end=0;end<A.length;end++){
            if(end != 0 && A[end] == A[end-1]){
                start = end;
            }

            length = end-start+1;

            if(length == windowSize){
                indices.add(start + length/2);
                start++;
            }
        }

        return indices.stream().mapToInt(i -> i).toArray();

    }
}
