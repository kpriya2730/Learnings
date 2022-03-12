package arrays.bitmanipulations;

/**
 *Alex and Sam are very good friends. Alex is doing programming a lot these days. He has set a target A for himself.
 * Initially, Alex score is zero. Alex can only double his score by doing a question or Alex can seek help from Sam
 * for doing questions which will contribute 1 to Alex score. Alex wants his score to be exactly A. Also, he does not
 * want to take much help from Sam.
 * Find and return the minimum number of times Alex needs to take help from Sam to achieve a score of exactly A.
 *
 * A = 5 // 2
 * A = 3 // 2
 *
 * TC: O(log N) // because we are counting the set bits in A
 * SC: O(1)
 */
public class HelpFromSam {
    public int solve(int A) {
        int helpCount = 0;

        while(A != 0){
            A = A & (A-1);
            helpCount++;
        }

        return helpCount;
    }
}
