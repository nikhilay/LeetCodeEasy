/**
 * Created by Nikhil on 12/26/16.
 */

import java.util.HashMap;

/**
 * Reverse bits of a given 32 bits unsigned integer.
 * For example, given input 43261596 (represented in binary as 00000010100101000001111010011100),
 * return 964176192 (represented in binary as 00111001011110000010100101000000).
 */
public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(new ReverseBits().reverseBits(43261596));
    }

    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = res | (n & 1);
            n = n >>> 1;
            if (i < 31) {
                res = res << 1;
            }
        }
        return res;

    }


    private HashMap<Byte,Integer> cache = new HashMap<>();
    public int efficientReverseBits(int n) {
        byte[] bytes = new byte[4];
        for (int i = 0; i < 4; i++) {
            bytes[i] = (byte) (n >>> (8 * i) & (0xFF));
        }
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = result | reverseByte(bytes[i]);
            if (i < 3) {
                result <<= 8;
            }
        }
        return result;
    }

    private int reverseByte(byte b){
        Integer value = cache.get(b);
        if(value!=null){
            return value;
        }
        value = 0;
        for(int i=0;i<8;i++){
            value = value |(b>>>i & 1);
            if(i<7){
                value <<=1;
            }
        }
        cache.put(b,value);
        return value;
    }
}
