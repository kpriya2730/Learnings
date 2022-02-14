package modulararithmetic;

/**
 * You are given two non-negative integers A and B, find the value of Least Common Multiple (LCM) of A and B.
 * LCM of two integers is the smallest positive integer that is divisible by both.
 *
 * 1 <= A, B <= 1000
 */
public class LCM {
    public int lcm(int A, int B) {

        return ((A*B) / gcd(Math.min(A,B), Math.max(A,B)));

    }

    private int gcd(int a, int b){
        if(b%a == 0)
            return a;

        return gcd(b%a, a);
    }
}
