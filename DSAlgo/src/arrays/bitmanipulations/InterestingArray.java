package arrays.bitmanipulations;

/**
 * You have an array A with N elements. We have 2 types of operation available on this array :
 * We can split a element B into 2 elements C and D such that B = C + D.
 * We can merge 2 elements P and Q as one element R such that R = P^Q i.e XOR of P and Q.
 * You have to determine whether it is possible to make array A containing only 1 element i.e. 0 after several splits and/or merge?
 *
 * 1 <= N <= 100000
 * 1 <= A[i] <= 106
 *
 * A = [9, 17] // Yes
 * A = [1] // No
 *
 *
 */
public class InterestingArray {
    public String solve(int[] A) {
        int finalNumberAfterMerge = 0;

        for(int num : A){
            finalNumberAfterMerge ^= num;
        }

        if(finalNumberAfterMerge != 0 && ((finalNumberAfterMerge&1) == 1)){
            return "No";
        }

        return "Yes";
    }
}
