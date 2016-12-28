import java.util.HashMap;

/**
 * Created by Nikhil on 10/17/16.
 */

/**
 * Design a logger system that receive stream of messages along with its timestamps, each message should be printed if
 * and only if it is not printed in the last 10 seconds.
 * Given a message and a timestamp (in seconds granularity), return true if the message should be printed in the given
 * timestamp, otherwise returns false.
 * It is possible that several messages arrive roughly at the same time.
 */
public class LoggerRateLimiter {
    /**
     * Initialize your data structure here.
     */
    HashMap<String, Integer> tracker;

    public LoggerRateLimiter() {
        tracker = new HashMap<>();
    }

    /**
     * Returns true if the message should be printed in the given timestamp, otherwise returns false.
     * If this method returns false, the message will not be printed.
     * The timestamp is in seconds granularity.
     */

    public boolean shouldPrintMessage(int timestamp, String message) {
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
