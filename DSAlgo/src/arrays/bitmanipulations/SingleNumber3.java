package arrays.bitmanipulations;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an array of numbers A , in which exactly two elements appear only once and all the other elements appear
 * exactly twice. Find the two elements that appear only once.
 * Note: Output array must be sorted.
 *
 * TC: O(N)
 * SC: O(1)
 */
public class SingleNumber3 {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int xor = 0;

        for(int i=0;i<A.size();i++){
            xor ^= A.get(i);
        }

        int lastSetBit = (xor & (xor-1)) ^ xor;

        int num1 = 0;
        int num2 = 0;
        for(int i=0;i<A.size();i++){
            if((A.get(i)&lastSetBit) != 0){
                num1 ^= A.get(i);
            }else{
                num2 ^= A.get(i);
            }
        }

        return num1>num2 ? new ArrayList<Integer>(Arrays.asList(num2, num1)) : new ArrayList<Integer>(Arrays.asList(num1, num2));

    }
}
