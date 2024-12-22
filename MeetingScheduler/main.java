import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        User user1 = new User("Sahil");
        User user2 = new User("Satya");
        User user3 = new User("Komo");
        User user4 = new User("Sameer");
        User user5 = new User("Ankit");
        MeetingRoom meetRoom1 = new MeetingRoom("LaxmiBhawan",2);
        MeetingRoom meetRoom2 = new MeetingRoom("SaraswatiBhawan",2);
        MeetingScheduler meetingScheduler = MeetingScheduler.getInstance();
        List<User> userList1 = new ArrayList<>();
        userList1.add(user2);
        userList1.add(user3);
        long curTime = System.currentTimeMillis();
        meetingScheduler.bookMeeting(user1, userList1,curTime+10000,curTime+13000,meetRoom1,"Global Warming");
        meetingScheduler.bookMeeting(user4,userList1,curTime+15000,curTime+18000,meetRoom1,"Taxation");
        meetingScheduler.bookMeeting(user5,userList1,curTime+12000,curTime+20000,meetRoom1,"Investing");
        meetingScheduler.executeAllMeetings();
    }

}

