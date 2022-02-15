package modulararithmetic;

public class RepeatAndMissingNumberArray {
    public int[] repeatedNumber(final int[] A) {
        int N = A.length;
        int xor = 0;

        for(int n: A){
            xor ^= n;
        }

        for(int i=1;i<=N;i++){
            xor ^= i;
        }

        int firstSetBit = (((xor)^(xor-1))+1) >> 1;

        int num1 = 0, num2 = 0;

        for(int n : A){
            if((n&firstSetBit) !=0){
                num1 = num1^n;
            }else{
                num2 = num2^n;
            }
        }

        for(int i=1;i<=N;i++){
            if((i&firstSetBit) != 0){
                num1 = num1^i;
            }else{
                num2 = num2^i;
            }
        }

        for(int n: A){
            if(num1 == n){
                return new int[]{num1, num2};
            }

            if(num2 == n){
                return new int[]{num2, num1};
            }
        }
        return new int[2];
    }
}
