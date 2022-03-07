package arraysandmath;

/**
 * Amazon:
 * Given a number N, find the Nth magical number
 * Magical no: A number which can be represented as a sum of unique powers of 5 and powers should be greater than 0.
 *
 * TC: O(logN)
 * SC: O(1)
 */
public class MagicNumber {
    /*
        N=1 5
        N=2 25
        N=3 25+5=30
        N=4 125
        N=5 125+5=130
        N=6 125+25=150
        N=7 125+25+5=155
        ..

        Our powers
             ...4 3 2 1
        N=1         0 1
        N=2         1 0
        N=3       0 1 1
        N=4       1 0 0
        N=5       1 0 1
        N=6       1 1 0
        N=7       1 1 1
        N=8     1 0 0 0
        N=11    1 0 1 1 = 625+25+5 = 655

        Raise the set bit power 5 to get the Nth magic number
        TC: O(logN)
        SC: O(1)
     */
    public int solve(int A) {
        int magicNumber = 0;
        int base = 1;

        while(A != 0){
            base *= 5;
            if((A&1) == 1){

                magicNumber += base;

            }
            A = A>>1;
        }

        return magicNumber;
    }
}
