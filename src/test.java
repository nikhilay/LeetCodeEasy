import java.util.*;


/**
 * Created by Nikhil on 10/17/16.
 */
public class test {

    public static void main(String[] args) {
        String s="nikhil";
        System.out.println(s.substring(0,s.length()));
        char c = 0;
        System.out.println(c +" "+(int)c);
        System.out.println((Math.sqrt(89)-1)/2.0);


    }
}



/*
 * Complete the function below.


    static int countDuplicates(int[] numbers) {

        if(numbers == null || numbers.length == 0)
            return -1;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        //Arrays.fill(checker, false);
        for(int i = 0 ; i < numbers.length ; i++){

            if(map.containsKey(numbers[i])){
                map.put(numbers[i], map.get(numbers[i])+ 1);
                if(map.get(numbers[i]) == 2)
                    count++;
            }
            else
                map.put(numbers[i], 1);

        }

        return count;

    }





    List<String> result = new LinkedList<String>();

    static String[] buildSubsequences(String s) {

        char[] string = s.toCharArray();
        String[] result = new String[(int) Math.pow(2,s.length()) -1];
        int index = 0;

        StringBuilder sb;
        for(int c = 1 ; c < Math.pow(2,string.length) ; c++){
            sb = new StringBuilder();
            for(int i = 0 ; i < string.length ; i++){
                if((c & (1 << i)) >= 1)
                    sb.append(string[i]);
            }
            result[index++] = sb.toString();
        }

        Arrays.sort(result);

        return result;
    }








    static String rearrangeWord(String word) {

        if(word == null || word.isEmpty())
            return "no answer";
        char[] sArr = word.toCharArray();
        int n = word.length();

        int i,j;

        for(i = n -1 ; i >0 ; i--){
            if(sArr[i] > sArr[i -1]){
                break;
            }
        }

        if(i == 0)
            return "no answer";

        char ch1 = sArr[i-1];
        int small = i;

        for( j = i+1 ; j < n; j++){
            if(sArr[j] < sArr[small] && sArr[j] > ch1)
                small = j;
        }

        char temp = sArr[i-1];
        sArr[i-1] = sArr[small];
        sArr[small] = temp;

        Arrays.sort(sArr , i , n);

        String res = new String(sArr);

        return res;
    }

 */
