/**
 * Created by Nikhil on 10/19/16.
 */

/**
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 * Each rectangle is defined by its bottom left corner and top right corner coordinates.
 */
public class RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        if (C < E || A > G) {
            return (C - A) * (D - B) + (G - E) * (H - F);
        }
        if (B > H || D < F) {
            return (C - A) * (D - B) + (G - E) * (H - F);
        }

        int right = Math.min(C,G);
        int left = Math.max(A,E);
        int top = Math.min(D,H);
        int bottom = Math.max(B,F);

        return (C - A) * (D - B) + (G - E) * (H - F) - (right -left)*(top -bottom);

    }

}
