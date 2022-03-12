package sorting;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.
 * A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
 *
 * 2 <= N <= 105
 * -109 <= A[i] <= 109
 */
public class AP {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int diff = A.get(1)-A.get(0);

        for(int i=1;i<A.size()-1;i++){
            if(A.get(i+1) != A.get(i)+diff)
                return 0;
        }

        return 1;
    }
}
