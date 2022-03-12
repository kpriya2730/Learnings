package arrays.bitmanipulations;

/**
 * Given an array of integers A, every element appears twice except for one. Find that single one.
 * NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * A = [1, 2, 2, 3, 1] // 3
 * A = [1, 2, 2] // 1
 */
public class SingleNumber {
    public int singleNumber(final int[] A) {
        int number = 0;

        for(int num : A){
            number = number ^ num;
        }

        return number;
    }
}
