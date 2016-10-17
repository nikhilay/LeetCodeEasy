import java.util.HashMap;

/**
 * Created by Nikhil on 10/17/16.
 */
public class LoggerRateLimiter {

    public boolean shouldWePrint(String message, int timestamp) {
        HashMap<String, Integer> tracker = new HashMap<>();
        return shouldWePrint(message, timestamp, tracker);
    }

    private boolean shouldWePrint(String message, int timestamp, HashMap<String, Integer> tracker) {
        if (tracker.containsKey(message)) {
            if (timestamp - tracker.get(message) >= 10) {
                int newTimestamp = timestamp;
                tracker.put(message, newTimestamp);
                return true;
            }

        } else {
            tracker.put(message, timestamp);
            return true;
        }
        return false;

    }
}
