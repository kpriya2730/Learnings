package modulararithmetic;

/**
 * Given three 2-digit integers, A, B and C, find out the minimum number that can be obtained by concatenating them in any order.
 * Return the minimum result that can be obtained.
 * 10 <= A, B, C <= 99
 *
 * A = 10, B = 20, C = 30 // 102030
 * A = 43, B = 47, C = 53 // 434753
 */
public class ConcatenateThreeNumbers {
    public int solve(int A, int B, int C) {
        double number = 0;

        int maxNumber = Math.max(A, Math.max(B, C));

        if(maxNumber == A){
            number = Math.min(B,C) * Math.pow(10,4) + Math.max(B,C) * Math.pow(10,2) + maxNumber;
        }

        if(maxNumber == B){
            number = Math.min(A,C) * Math.pow(10,4) + Math.max(A,C) * Math.pow(10,2) + maxNumber;
        }

        if(maxNumber == C){
            number = Math.min(A,B) * Math.pow(10,4) + Math.max(A,B) * Math.pow(10,2) + maxNumber;
        }

        return (int)number;
    }
}
