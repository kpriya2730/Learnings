package modulararithmetic;

/**
 * You are given a huge number in the form of a string A where each character denotes a digit of the number.
 * You are also given a number B. You have to find out the value of A % B and return it.
 *
 * 1 <= A.size() <= 105
 * 0 <= Ai <= 9
 * 1 <= B <= 109
 *
 * TC: O(N)
 * SC: O(1)
 */
public class ModuloOfArray {
    /*
       A="372984" // A size can go upto 10^5 i.e, 10^5 digits.
       Range of int = 10^9 => 9 digits
       range of long = 10^18 => 18 digits
       Clearly, this number of 10^5 digits cannot fit into any datatype.

       Approach 1:
       We can keep the number as string and perform mod operation if we know the divisibility test of B. But we don't
       know the divisibility rules of all numbers. So this won't work.

       Approach 2:
       Use modulus formula's

       372984%B
       = (3*10^5 + 7*10^4 + 2*10^3 + 9*10^2 + 8*10 + 4)%B
       = ((3*10^5)%B + (7*10^4)%B + (2*10^3)%B + (9*10^2)%B + (8*10)%B + 4%B)%B
       = ((3%B*10^5%B)%B + (7%B*10^4%B)%B + (2%B*10^3%B)%B + (9%B*10^2%B)%B + (8%B*10%B)%B + 4%B)%B
       Note: worst case when size of A is 10^5, the first term may be 10^(10^5) that means, we need to perform an
       operation (10^(10^5))%B => First compute 10^(10^5) and then apply mod operator. This will cause overflow and give
       wrong result.

       Solution --> Use power function that we implemented to compute modulus of large numbers like (10^(10^5))
       = (A[0]%B*power(10, 10^5, B)+(A[1]%B*power(10, (10^5)-1, B)...)%B

       Drawbacks of this approach:
       1. TC = O(N*N) iterate through String and for each number call power function which iterates N times

       Improvement:
       For each character in string, we are calling power function and not reusing already calculated values

       N = 5
       i=0, power(10, 4, B)
       i=1, power(10, 3, B)
       i=k, power(10, N-1-k, B)

       Instead, start from end of array
       N=5
       base = 1
       i=N-1, A[N-1]%B*base%B, base = base*10
       i=N-2, A[N-2]%B*base%B, base = base*10
       i=N-3, A[N-3]%B*base%B, base = base*10
       ...

       TC: O(N)
       SC:O(1)
     */
    public int findMod(String A, int B) {
        int N = A.length();
        long remainder = 1;
        long result = 0;

        for(int i=N-1;i>=0;i--){
            int num = (A.charAt(i)-'0')%B;
            result = (result + ((num * remainder)%B))%B;
            remainder = (remainder * (10%B))%B;
        }

        return (int)result;
    }
}
