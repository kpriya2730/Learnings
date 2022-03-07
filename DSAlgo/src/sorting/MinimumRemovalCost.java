package sorting;


import java.util.Arrays;

/**
 * Sorting: Arranging data in any specific order based on a specific parameter.
 *
 * Ex: Sort a deck of cards.
 * Specifics: Sort by color, Sort by type, Sort by value, Sort by the face value, Sort by color+face value, etc
 *
 * Ex:
 * 3,8,9,14,19 -> sorted in asc order by value
 * 19,14,9,8,3 -> sorted in desc order by value
 * 1,13,9,6,12 -> sorted in asc order by number of factors
 *
 * We can sort based on any parameter and sort in any order.
 * Every language has libraries to allow sorting in any order and based in any parameter.
 *
 * Time complexity of library sorting functions = O(NlogN)
 * Space complexity = Depends on which algorithm is being used. Range could be O(1) to O(N)
 *
 *
 * Sorting helps in searching.
 */
/**
 * Given an array of size N. You can remove one array element at a time.
 * Cost of removal is sum of elements in the array just before the removal.
 *
 * Find the minimum cost to remove all the elements.
 *
 * Ex: [2,1,4]
 * 2 [1,4] => Cost=7
 * 1 [4] => Cost = 12
 * 4 [] => Cost = 16
 *
 * 4 [1,2] => Cost=7
 * 2 [1] => Cost=10
 * 1 [] => Cost=11
 *
 * Cost changes with order of removal.
 *
 * TC: O(NlogN)+O(N)= O(NlogN)
 * SC: Depends on sorting algorithm
 */
public class MinimumRemovalCost {
    public int solve(int[] A) {
        int cost = 0;
        int sum = 0;

        Arrays.sort(A);
        for(int i : A){
            sum += i;
        }

        for(int i=A.length-1;i>=0;i--){
            cost += sum;
            sum -= A[i];
        }

        return cost;
    }
}
