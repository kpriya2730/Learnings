package arrays.carryforward;

/**
 * N light bulbs are connected by a wire.
 * Each bulb has a switch associated with it, however due to faulty wiring, a switch also changes the state of all the bulbs to the right of current bulb.
 * Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
 * You can press the same switch multiple times.
 * Note: 0 represents the bulb is off and 1 represents the bulb is on.
 */
public class Bulbs {

    public int bulbs(int[] A) {
        int count = 0;

        for(int n : A){
            if(count % 2 == 0 && n == 0 || count % 2 != 0 && n == 1){
                count++;
            }
        }

        return count;
    }
}
