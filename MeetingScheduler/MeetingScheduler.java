import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MeetingScheduler {
    ConcurrentHashMap<String, Meeting> meetingsDB;
    private static MeetingScheduler meetingScheduler;

    private MeetingScheduler() {
        this.meetingsDB = new ConcurrentHashMap<>();
    }

    public static MeetingScheduler getInstance(){
        if (meetingScheduler == null){
            meetingScheduler = new MeetingScheduler();
        }
        return meetingScheduler;
    }


    public Meeting bookMeeting(User organiser, List<User> memberList, long startTime, long endTime, MeetingRoom meetingRoom, String topicForMeeting){
        //GeneralValidations
        if (isSlotAvaialble(startTime,meetingRoom)){
            Meeting meeting = new Meeting(topicForMeeting,startTime,endTime,meetingRoom);
            String key = meetingRoom.getName()+"#"+startTime+"#"+endTime;
            for (User member : memberList){
                meeting.addUser(member);
            }
            meetingsDB.put(key,meeting);
            return meeting;
        }
        return null;
    }

    public boolean isSlotAvaialble(long startTime,MeetingRoom meetingRoom){
        for (Map.Entry<String,Meeting> meetingEntry:meetingsDB.entrySet()){
            Meeting meet = meetingEntry.getValue();
            if (meet.getMeetingRoom() == meetingRoom &&  meet.getStartTime()<=startTime && meet.getEndTime()>startTime){
                System.out.println("In this slot there is already a meeting in the room "+ meetingRoom.getName());
                return false;
            }
        }
        return true;
    }

    public void executeAllMeetings(){
        while (!meetingsDB.isEmpty()){
            for (Map.Entry<String,Meeting> meetingEntry:meetingsDB.entrySet()){
                Meeting meet = meetingEntry.getValue();
                long curTimeInMilli = System.currentTimeMillis();
                //If currentTime is equal to the startTime just make the isAvialble to false
                if (meet.getStartTime()==curTimeInMilli){
                    meet.getMeetingRoom().setAvailable(false);
                }
                //If currentTime is equal to the endTime just make the isAvaialble for that meetingroom to true and remove from the DB
                if (meet.getStartTime()==curTimeInMilli){
                    meet.getMeetingRoom().setAvailable(false);
                    meetingsDB.remove(meetingEntry.getKey());
                }
                //Send notification just some time before a meeting is going to start
                if (meet.getStartTime()-curTimeInMilli == 5000){
                    meet.sendNotificationToAll("Meeting in room "+ meet.getMeetingRoom().getName()+" will start in 5 sec please reach ASAP");
                }
            }
        }
    }

}
