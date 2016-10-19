/**
 * Created by Nikhil on 10/19/16.
 */

/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * (Note: The order of elements can be changed. It doesn't matter what you leave beyond the new length.)
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] input = {1,2,4,2,2,3};
        new RemoveElement().removeElement(input,2);
    }
    public int removeElement(int[] A, int elem) {
        int i = 0;
        int j = 0;

        while (i < A.length) {
            if (A[i] != elem) {
                int temp = A[i];
                A[j] = temp;
                j++;

            }
            i++;

        }
        System.out.println("New Length is "+ j);
        return j;
    }
}
