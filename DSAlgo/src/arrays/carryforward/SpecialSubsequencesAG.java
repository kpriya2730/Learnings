package arrays.carryforward;

/**
 * You have given a string A having Uppercase English letters.
 * You have to find that how many times subsequence "AG" is there in the given string.
 * A = "ABCGAG" // 3
 * A = "GAB" // 0
 */
public class SpecialSubsequencesAG {
    public int solve(String A) {

        int count = 0;
        int ans = 0;

        for(int i=0;i<A.length();i++){
            if(A.charAt(i) == 'A')
                count++;
            else if(A.charAt(i) == 'G')
                ans += count;
        }
        return ans;
    }
}
