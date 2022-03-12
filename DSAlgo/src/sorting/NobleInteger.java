package sorting;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.
 */
public class NobleInteger {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int N = A.size();

        for(int i=N-1;i>=0;i--){
            if(A.get(i) == N-1-i){
                return 1;
            }
            while(i>0 && A.get(i-1) == A.get(i))
                i--;
        }
        return -1;
    }
}
