package modulararithmetic;

/**
 * Given two integers A and B, find the greatest possible positive M, such that A % M = B % M.
 */
public class ABModulo {
    /*
        Intuition:

        Take a number line and represent A=5 B=9
        | | | | | | * * * *
        0 1 2 3 4 5 6 7 8 9

        Difference (9-5) denoted by *
        Now = A = 4+1, B = 5+4 = (4+1)+4
        if M = abs(A-B) = abs(5-9) = 4, then (B-A)%4 gives remainder 0. The rest of A and B will be
        2 equal pieces of length min(A,B) which will give equal remainder when divided by M.
     */
    public int solve(int A, int B) {
        return Math.abs(A-B);
    }
}
