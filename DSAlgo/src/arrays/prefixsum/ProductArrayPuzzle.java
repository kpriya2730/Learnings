package arrays.prefixsum;

/**
 * Given an array of integers A, find and return the product array of same size where i'th eement of the product array
 * will be equal to the product of all the elements divided by the i'th element of the array.
 *
 * A = [1, 2, 3, 4, 5] // [120, 60, 40, 30, 24]
 * A = [5, 1, 10, 1] // [10, 50, 5, 50]
 */
public class ProductArrayPuzzle {
    public int[] solve(int[] A) {
        int product = 1;
        for(int num : A)
            product *= num;

        int[] productArray = new int[A.length];
        for(int i=0;i<A.length;i++){
            productArray[i] = product/A[i];
        }

        return productArray;
    }
}
