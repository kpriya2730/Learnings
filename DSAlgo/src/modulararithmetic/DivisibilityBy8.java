package modulararithmetic;

/**
 * Given a number A in the form of string. Check if the number is divisible by 8 or not.
 * Return 1 if it is divisible by 8 else return 0.
 */
public class DivisibilityBy8 {
    public int solve(String A) {
        int num = 0;
        int N = A.length();
        int base = 1;
        for(int i=0;(i<3)&&(N-1-i)>=0;i++){
            num += (A.charAt(N-1-i) - '0') * base;
            base *= 10;
        }

        return (num%8 == 0)?1:0;
    }
}
