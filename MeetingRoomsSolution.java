import java.util.*;

public class MeetingRoomsSolution {

    public static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int _start, int _end) { start = _start; end = _end; }
    }

    public static void main(String[] args) throws Exception{
        Interval i1 = new Interval(0, 30);
        Interval i2 = new Interval(5, 10);
        Interval i3 = new Interval(15, 20);
        Interval[] intervals = {i1, i2, i3};

        System.out.println(new MeetingRoomsSolution().canAttendMeetings(intervals));
    }

    public boolean canAttendMeetings(Interval[] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        for(int loopVariable = 1; loopVariable < intervals.length; loopVariable ++){
            if(intervals[loopVariable].start < intervals[loopVariable - 1].end)
                return false;
        }
        return true;
    }

}