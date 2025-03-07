public class Demo {
    public static void main(String[] args) {
        TrafficLight tf1 = new TrafficLight(1,new Road("1"));
        TrafficLight tf2 = new TrafficLight(2,new Road("2"));
        TrafficLight tf3 = new TrafficLight(3,new Road("3"));
        TrafficLight tf4 = new TrafficLight(4,new Road("4"));

        TrafficController controller = TrafficController.getInstance();
        controller.addTrafficLight(tf1, tf2, tf3,tf4);

        controller.startTrafficControl();
    }
}
