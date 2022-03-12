package arrays.carryforward;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array A containing N distinct integers, you have to find all the leaders in the array A.
 * An element is leader if it is strictly greater than all the elements to its right side.
 * NOTE:The rightmost element is always a leader.
 * NOTE: Ordering in the output doesn't matter.
 *
 * A = [16, 17, 4, 3, 5, 2] // [17, 2, 5]
 * A = [1, 2] // [2]
 */
public class LeadersInAnArray {
    public int[] solve(int[] A) {
        List<Integer> leaders = new ArrayList<>();
        int N = A.length;
        int idx = 0;
        int max = Integer.MIN_VALUE;
        for(int i = N-1;i>=0;i--){
            if(A[i] > max){
                max = A[i];
                leaders.add(max);
                idx++;
            }
        }

        int[] result = leaders.stream().mapToInt(i -> i).toArray();
        return result;
    }
}

