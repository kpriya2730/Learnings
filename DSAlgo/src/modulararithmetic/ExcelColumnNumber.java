package modulararithmetic;

/**
 * Given a column title as appears in an Excel sheet, return its corresponding column number.
 * 1 <= length of the column title <= 5
 *
 */
public class ExcelColumnNumber {
    /*
        Based on constraints, the column id could be 5 letters wide, base for this is 26, so the range of number
        in worst case upon conversion is in the order 26(26^4+26^3+26^2+26^1+26^0) = approx 26^6 = approx 10^9
        which will fit in integer variable
     */

    public int titleToNumber(String A) {
        int columnNumber = 0;
        int N = A.length();
        double base = 1;

        for(int i=N-1;i>=0;i--){
            int value = A.charAt(i)-'A'+1;
            columnNumber += (value*base);
            base *= 26;
        }
        return columnNumber;
    }
}
