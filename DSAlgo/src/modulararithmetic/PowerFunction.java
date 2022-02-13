package modulararithmetic;

/**
 * Return (a ^ n)%p
 *
 * a = 2, n=5, p=7 // 4
 * a=3, n=4, p=6 // 3
 * a = 10, n=40, p=8 //
 * TC: O(N)
 */
public class PowerFunction {
    /*
        Approach 1:
        1.Have a result=1 variable to return
        2. x = a%p
        3.Run a loop from 1 to n, multiply 'x' to the result and everytime store result%p in result
     */
    static int power(int a, int n, int p){
        int result = 1;
        int x = a%p;
        for(int i=0;i<n;i++){
            result = (result * x)%p;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(10,40,6));
        System.out.println(power(2,5,7));
    }
}
