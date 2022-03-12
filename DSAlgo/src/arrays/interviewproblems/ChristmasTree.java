package arrays.interviewproblems;

/**
 * You are given an array A consisting of heights of Christmas trees, and an array B of same size consisting of
 * the cost of each of the trees (Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)), and you are supposed to choose
 * 3 trees (let's say, indices p, q and r), such that Ap < Aq < Ar, where p < q < r.
 * The cost of these trees is Bp + Bq + Br.
 * You are to choose 3 such trees, so they have the minimum cost and find the minimum cost.
 * If not possible to choose 3 such trees, return -1.
 *
 * 1 <= A[i], B[i] <= 109
 * 3 <= size(A) = size(B) <= 3000
 *
 * A = [1, 6, 4, 2, 6, 9], B = [2, 5, 7, 3, 2, 7] // 7
 *
 */
public class ChristmasTree {
    public int solve(int[] A, int[] B) {
        int minCost = Integer.MAX_VALUE;
        for(int i=1;i<A.length-1;i++){
            int minCostOnLeft = Integer.MAX_VALUE;
            int minCostOnRight = Integer.MAX_VALUE;

            for(int j=i-1;j>=0;j--){
                if(A[j] < A[i]){
                    minCostOnLeft = Math.min(minCostOnLeft, B[j]);
                }
            }

            for(int j=i+1;j<A.length;j++){
                if(A[j] > A[i]){
                    minCostOnRight = Math.min(minCostOnRight, B[j]);
                }
            }
            if(minCostOnLeft != Integer.MAX_VALUE && minCostOnRight != Integer.MAX_VALUE)
                minCost = Math.min(minCost, B[i]+minCostOnLeft+minCostOnRight);
        }
        return (minCost == Integer.MAX_VALUE)?-1:minCost;
    }
}
