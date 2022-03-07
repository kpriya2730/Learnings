package arraysandmath;

import java.util.ArrayList;
import java.util.List;

/**
 * There are N doors, a person is standing in front of every door. Initially all doors are closed.
 *
 * 1st person -> Toggles all doors -> opens all doors
 * 2nd person -> Toggles the state of 2,4,6 .. doors
 * 3rd person -> Toggles the state of 3, 6, 9.. doors
 * 4th person -> Toggles the state of 4, 8, 12 .. doors
 *
 * Return which all doors will be open in the end.
 *
 * TC: O(sqrt(N))
 * SC: O(1)
 */
public class NDoors {
    /*
        1. Who is going to toggle i-th door.
        2. What could be the possible final state.

        i C -> O -> C -> O -> C ....
        9-th door : 1, 3, 9 (Factors of 9) => Final state = Open
        15-th door : 1, 3, 5, 15 (Factors of 15) = Close
        18th door : 1,2,3,6,9,18 (Factors of 18) = Close

        **Factors occur in pairs**
        Factors of perfect square have odd number of factors.

        9 => 1,3,9
        16 => 1,2,4,8,16
        100 => 1,2,4,5,10,10,20,25,50.100


        Remaining numbers will have even number of factors

        Ans: All the perfect squares from 1 to N will be the answer.

        Do we need to iterate through all the numbers 1 to N? No.
        check if i*i is in range of 1 to N

        N = 100
        i   i^2
        1   1
        2   4
        3   9
        4   16
        5   25
        6   36
        7   49
        8   64
        9   81
        10  100
        11  121 > 100  break,


        TC: O(sqrt(N))
        SC: O(1)

     */

    public static int[] nDoors(int N){
        List<Integer> openDoors = new ArrayList<>();
        int square = 1;
        int door = 1;

        while(square < N){
            openDoors.add(square);
            door++;
            square = door*door;
        }

        return openDoors.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr = nDoors(50);
        for(int n : arr){
            System.out.print(n+" ");
        }
    }
}
