import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Nikhil on 10/19/16.
 */

/**
 * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.
 */
public class MovingAverageFromDataStream {


    /**
     * Initialize your data structure here.
     */
    Queue<Integer> queue = new LinkedList<>();
    double prevAvg = 0.0;
    int maxSize;

    public MovingAverageFromDataStream(int size) {
        maxSize = size;
    }

    public double next(int val) {
        if (queue.isEmpty()) {
            queue.add(val);
            prevAvg = val;
            return val;
        } else {
            double prevTotal = prevAvg * queue.size();
            if (queue.size() < maxSize) {
                queue.add(val);
                prevAvg = (prevTotal + val) / queue.size();
                return prevAvg;

            } else {
                double temp = prevTotal - queue.poll() + val;
                queue.add(val);
                prevAvg = temp / maxSize;
                return prevAvg;

            }

        }
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
