package modulararithmetic;

/**
 * There are certain problems which are asked in the interview to also check how you take care of overflows in your problem.
 * This is one of those problems.
 * Please take extra care to make sure that you are type-casting your ints to long properly and at all places. Try to verify if your solution works if number of elements is as large as 105
 *
 * Food for thought :
 *
 * Even though it might not be required in this problem, in some cases, you might be required to order the operations cleverly so that the numbers do not overflow.
 * For example, if you need to calculate n! / k! where n! is factorial(n), one approach is to calculate factorial(n), factorial(k) and then divide them.
 * Another approach is to only multiple numbers from k + 1 ... n to calculate the result.
 * Obviously approach 1 is more susceptible to overflows.
 * You are given a read only array of n integers from 1 to n.
 *
 * Each integer appears exactly once except A which appears twice and B which is missing.
 *
 * Return A and B.
 *
 * Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Note that in your output A should precede B.
 *
 * Input:[3 1 2 5 3]
 *
 * Output:[3, 4]
 *
 * A = 3, B = 4
 */
public class RepeatAndMissingNumberArray {
    public int[] repeatedNumber(final int[] A) {
        int N = A.length;
        int xor = 0;

        for(int n: A){
            xor ^= n;
        }

        for(int i=1;i<=N;i++){
            xor ^= i;
        }

        int firstSetBit = (((xor)^(xor-1))+1) >> 1;

        int num1 = 0, num2 = 0;

        for(int n : A){
            if((n&firstSetBit) !=0){
                num1 = num1^n;
            }else{
                num2 = num2^n;
            }
        }

        for(int i=1;i<=N;i++){
            if((i&firstSetBit) != 0){
                num1 = num1^i;
            }else{
                num2 = num2^i;
            }
        }

        for(int n: A){
            if(num1 == n){
                return new int[]{num1, num2};
            }

            if(num2 == n){
                return new int[]{num2, num1};
            }
        }
        return new int[2];
    }
}
