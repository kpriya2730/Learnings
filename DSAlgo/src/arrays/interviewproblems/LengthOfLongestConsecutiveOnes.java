package arrays.interviewproblems;

/**
 * Given a binary string A. It is allowed to do at most one swap between any 0 and 1.
 * Find and return the length of the longest consecutive 1’s that can be achieved.
 *
 * A = "111000" // 3
 * A = "111011101" // 7
 */
public class LengthOfLongestConsecutiveOnes {
    public int solve(String A) {
        int maxSize = 0;
        int numberOfOnes = 0;

        for(int i=0;i<A.length();i++){
            if(A.charAt(i) == '1')
                numberOfOnes++;
        }

        if(numberOfOnes == A.length())
            return numberOfOnes;

        for(int i=0;i<A.length();i++){
            int L = 0;
            int R = 0;
            if(A.charAt(i) == '0'){
                int j = i+1;
                while(j<A.length() && A.charAt(j) !=  '0'){
                    R++;
                    j++;
                }

                j = i-1;
                while(j>=0 && A.charAt(j) != '0'){
                    L++;
                    j--;
                }


                if(L+R < numberOfOnes){
                    maxSize = Math.max(maxSize, L+R+1);
                }else if(L+R == numberOfOnes){
                    maxSize = Math.max(maxSize, L+R);
                }
            }
        }
        return maxSize;
    }
}
