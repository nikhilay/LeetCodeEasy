/**
 * Created by Nikhil on 10/17/16.
 */

import java.util.Arrays;
import java.util.Comparator;

/**
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei),
 * determine if a person could attend all meetings. For example, Given [[0, 30],[5, 10],[15, 20]], return false.
 */
public class MeetingRooms {
    static class Interval {
        int startTime;
        int endTime;

        Interval(int startTime, int endTime) {
            this.endTime = endTime;
            this.startTime = startTime;
        }

    }

    public static void main(String[] args) {
        Interval i1 = new Interval(0,30);
        Interval i2 = new Interval(35,40);
        Interval i3 = new Interval(45,50);
        Interval[] input = {i1, i2, i3};
        new MeetingRooms().isAttendingAllmeetingsPossible(input);
    }
    public void isAttendingAllmeetingsPossible(Interval[] meetings) {

        Arrays.sort(meetings, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.startTime - o2.startTime;
            }
        });
        int count =1;
        for(int i=1;i<meetings.length;i++){
            if(meetings[i].startTime>meetings[i-1].endTime){
                count ++;
            }else{
                count--;
            }
        }

        if(count == meetings.length){
            System.out.print("All the meetings can be attended");
        }else{
            System.out.print("All the meetings cannot be attended");
        }


    }
}
