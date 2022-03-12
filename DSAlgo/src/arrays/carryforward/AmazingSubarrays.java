package arrays.carryforward;

/**
 * You are given a string S, and you have to find all the amazing substrings of S.
 * Amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
 *
 * S = ABEC // 6
 * S = ABEioRT // 19
 */
public class AmazingSubarrays {
    public int solve(String A) {
        int N = A.length();
        int count = 0;
        for(int i = 0;i<N;i++){
            if(isAVowel(A.charAt(i))){
                count += (N-i);
            }
        }

        return count;
    }

    private boolean isAVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return true;
        }

        return false;
    }
}
