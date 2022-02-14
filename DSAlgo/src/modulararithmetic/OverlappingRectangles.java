package modulararithmetic;

/**
 * Given eight integers A, B, C, D, E, F, G and H which represent two rectangles in a 2D plane.
 * For the first rectangle it's bottom left corner is (A, B) and top right corner is (C, D) and for the second rectangle it's bottom left corner is (E, F) and top right corner is (G, H).
 *
 * Find and return whether the two rectangles overlap or not.
 *
 * -10000 <= A < C <= 10000
 * -10000 <= B < D <= 10000
 * -10000 <= E < G <= 10000
 * -10000 <= F < H <= 10000
 *
 * Input
 * A = 0   B = 0
 * C = 4   D = 4
 * E = 2   F = 2
 * G = 6   H = 6
 * Output
 * 1
 *
 * Input
 * A = 0   B = 0
 * C = 4   D = 4
 * E = 2   F = 2
 * G = 3   H = 3
 * Output
 * 1
 *
 */
public class OverlappingRectangles {
    public int solve(int A, int B, int C, int D, int E, int F, int G, int H) {

        if(C <= E || G <= A || D <= F || H <= B )
            return 0;
        return 1;
    }

    // Alternative
    public int solve2(int A, int B, int C, int D, int E, int F, int G, int H) {
        int xs = Math.max(A, E), xe = Math.min(C, G);
        int ys = Math.max(B, F), ye = Math.min(D, H);
        if (xs < xe && ys < ye)
            return 1;
        else
            return 0;
    }
}
