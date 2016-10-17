/**
 * Created by Nikhil on 10/17/16.
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] input = {0,1,0,3,12};
        new MoveZeroes().moveZeroes(input);
    }

    public void moveZeroes(int[] input){
        int count = 0;
        for(int i:input){
           if(i!=0) {
               input[count++] =i;
           }
        }
        while(count<input.length){
            input[count++]=0;
        }

        for(int i:input){
          System.out.print(i+", ");
        }


    }
}
