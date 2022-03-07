package arraysandmath;

/**
 * N people standing in a circle. Person 1 kills the person next to him and passes on the sword to the next alive person
 * in clockwise direction.
 * This goes on till there is one person left. Find the position of last standing person.
 */
public class JosephusProblem {
    /*
        N = 4 , 1 remains
        N = 8, 1 remains
        N = 16, 1 remains

        If N is a power of 2, the person who starts the game wins.

        If N = 13, to get N close to the power of 2 we need to kill 13-8 = 5 people.
        If we are killing 5 people, the sword will be in the hands of person 11.
        Person 11 wins.

        If N=100, x = N-2^k = 100-64 = 36.
        Kill 36 people, so person (2*36+1) person holds the sword = 73 person is the winner.
     */

    public static int lastManStanding(int N){
        int k = 0;
        int numOfMen = N;

        while(numOfMen > 0){
            numOfMen >>= 1;
            k++;
        }

        int x = N - (int)Math.pow(2, k-1);

        return (2*x)+1;
    }

    public static void main(String[] args) {
        System.out.println(lastManStanding(17));
    }
}
