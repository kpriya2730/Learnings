package arrays.bitmanipulations;

/**
 * Given two binary strings, return their sum (also a binary string).
 * a = "100"
 * b = "11"
 * Return a + b = "111".
 */
public class AddBinaryStrings {
    public String addBinary(String A, String B) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int n = A.length()-1;
        int m = B.length()-1;

        while(n>-1 || m>-1 || carry!=0){
            int sum = carry;

            if(n > -1){
                sum += Character.getNumericValue(A.charAt(n));
            }
            if(m > -1){
                sum += Character.getNumericValue(B.charAt(m));
            }

            sb.append(sum%2);
            carry = sum / 2;
            n--;m--;
        }

        return sb.reverse().toString();
    }
}
