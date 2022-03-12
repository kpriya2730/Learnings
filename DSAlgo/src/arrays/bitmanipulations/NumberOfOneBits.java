package arrays.bitmanipulations;

/**
 * Write a function that takes an integer and returns the number of 1 bits it has.
 * 1 <= A <= 109
 *
 * 11 // 3, 11 is represented as 1011 in binary.
 */
public class NumberOfOneBits {
    public int numSetBits(int A) {
        int count = 0;

        while(A != 0){
            if((A & 1) == 1){
                count++;
            }
            A = A>>1;
        }

        return count;
    }

    public int numSetBits2(int A) {
        int count = 0;

        while(A != 0){
            /*
                A-1 will set the last set bit in A to 0 and the rest of the following bits to 1. The remaining bits before
                the last set bit will remain unchanged.

                So, A & A-1 will result in setting the last set bit in A to become 0 and the remaning bits after it to become 0.
             */
            A = A & (A-1);
            count++;
        }

        return count;
    }
}
