package arrays.bitmanipulations;

/**
 * Reverse the bits of an 32 bit unsigned integer A.
 * 0 <= A <= 2^32
 *
 * A = 3 // 3221225472
 * A = 0 // 0
 */
public class ReverseBits {
    public long reverse(long a) {
        long reverseNumber = 0;
        for(int i=0;i<32;i++){
            if(a==0)
                break;
            if((a&1) == 1){
                reverseNumber = reverseNumber + ((long)1<<(31-i));
            }
            a = (a >> 1);
        }

        return reverseNumber;
    }
}
