/**
 * Created by Nikhil on 10/19/16.
 */

/**
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 */
public class NumberOfOneBits {

    public static void main(String[] args) {
        new NumberOfOneBits().hammingWeight(32);
    }

    public int hammingWeight(int n) {
        int count=0;
        while (n > 0) {
          if((n&1)==1){
              count++;
          }
          n>>=1;
        }
        System.out.println("Number of one bits is "+count);
        return count;
    }
}
