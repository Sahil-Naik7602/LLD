import java.util.ArrayList;
import java.util.List;

public class Meeting {
    String topic;
    long startTime;
    long endTime;
    List<User> meetingMembers;
    MeetingRoom meetingRoom;

    public Meeting(String topic,long startTime, long endTime,MeetingRoom meetingRoom){
        this.topic = topic;
        this.startTime = startTime;
        this.endTime = endTime;
        this.meetingRoom = meetingRoom;
        this.meetingMembers = new ArrayList<>();
    }

    public MeetingRoom getMeetingRoom(){return this.meetingRoom;};
    public long getStartTime(){return this.startTime;};
    public long getEndTime(){return this.endTime;};
    public void addUser(User user){
        if (this.meetingMembers.size()<=this.meetingRoom.getCapacity()){
            meetingMembers.add(user);
            user.updateUser("You are added to the meeting "+topic+" from: "+this.startTime+" to: "+this.endTime);
        }else{
            System.out.println("Meeting room is full can't add");
        }
    }
    public void removeUser(User user){
        meetingMembers.remove(user);
        user.updateUser("You have been removed from the meeting "+topic+" from: "+this.startTime+" to: "+this.endTime);
    }

    public void sendNotificationToAll(String msg){
        for (User user:meetingMembers){
            user.updateUser(msg);
        }
    }
}
