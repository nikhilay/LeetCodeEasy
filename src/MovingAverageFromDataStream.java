import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nikhil on 10/19/16.
 */
public class MovingAverageFromDataStream {

    public void findMovingAverage(int val) {
        List<Integer> queue = new LinkedList<Integer>();

        if (queue.size() == 3) {
            int removedValue = queue.remove(0);
            float avg = (removedValue + queue.get(1) + queue.get(2)) / 3f;
            System.out.println("Moving average is " + avg);
            queue.add(val);

        } else {
            queue.add(val);
        }

    }
}
