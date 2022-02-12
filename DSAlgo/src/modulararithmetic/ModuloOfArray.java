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
