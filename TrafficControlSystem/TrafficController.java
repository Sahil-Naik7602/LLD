import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class TrafficController {
    private static TrafficController instance;
    private int movingTime;
    private int waitingTime;
    private Deque<TrafficLight> trafficLights;

    private TrafficController(){
        this.trafficLights = new ArrayDeque<>();
        this.movingTime = 100*120;
        this.waitingTime = 100*60;
    }

    public static synchronized TrafficController getInstance(){
        if (instance == null){
            instance = new TrafficController();
        }
        return instance;
    }

    //The order in which traffic-lights are stored in this queue in that order only green light will  occur
    public void addTrafficLight(TrafficLight... tf){
        Collections.addAll(trafficLights, tf);
    }

    public void setMovingTime(int time){
        this.movingTime  = time;
    }
    public void setWaitingTime(int time){
        this.waitingTime = time;
    }

    public void startTrafficControl(){
        if (trafficLights.size()==0){
            throw new RuntimeException("Please insert traffic lights first");
        }
        try{
            while (true) {
                TrafficLight greenTf = trafficLights.pollFirst();
                greenTf.setCurrentSignal(Signal.GRREN);
                trafficLights.forEach(tf -> tf.setCurrentSignal(Signal.RED));
                Thread.sleep(movingTime);
                trafficLights.add(greenTf);
                System.out.println("Pedestrians can cross now "+System.currentTimeMillis());
                trafficLights.forEach(tf -> tf.setCurrentSignal(Signal.YELLOW));
                Thread.sleep(waitingTime);
                System.out.println("Pedestrians should stop now "+System.currentTimeMillis());
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }


}
