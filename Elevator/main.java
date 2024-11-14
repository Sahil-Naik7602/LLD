package Elevator;

public class main {
    public static void main(String[] args) {
        ElevatorController elevatorController = new ElevatorController(new Elevator());
        elevatorController.addRequest(1,4);
        elevatorController.addRequest(8,5);
        elevatorController.addRequest(4,7);
        elevatorController.setStrategy(new ScanStrategy());
        while (!elevatorController.requestQueue.isEmpty()){
            elevatorController.processRequest();
        }
    }
}
