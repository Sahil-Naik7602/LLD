package Elevator;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ElevatorController {
    Elevator elevator;
    List<Request> requestQueue;
    Strategy strategy;

    public ElevatorController(Elevator elevator){
        this.elevator = elevator;
        this.requestQueue = new ArrayList<>();
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void addRequest(int src, int dst){
        Request request = new Request(src,dst);
        requestQueue.add(request);
    }

    public void processRequest(){
        Request request = strategy.getBestRequest(elevator,requestQueue);
        if (request != null) {
            ConcurrentHashMap<Request,Integer> byPassMap = new ConcurrentHashMap<>();
            requestQueue.remove(request);
            // Phase 1: Go to the source floor
            int sourceFloor = request.getSourceFloor();
            while (elevator.getCurFloor() != sourceFloor) {
                if (sourceFloor > elevator.getCurFloor()) {
                    elevator.moveUp();
                } else {
                    elevator.moveDown();
                }
                checkByPassage(byPassMap);
            }

            // Open and close door at source floor
            elevator.openDoor();
            elevator.closeDoor();

            // Phase 2: Go to the destination floor
            int destinationFloor = request.getDestinationFloor();
            while (elevator.getCurFloor() != destinationFloor) {
                if (destinationFloor > elevator.getCurFloor()) {
                    elevator.moveUp();
                } else {
                    elevator.moveDown();
                }
                checkByPassage(byPassMap);
            }

            // Open and close door at destination floor
            elevator.openDoor();
            elevator.closeDoor();
        } else {
            elevator.stop();
            System.out.println("Elevator is idle at floor: " + elevator.getCurFloor());
        }

    }

    public void checkByPassage(ConcurrentHashMap<Request,Integer> byPassRequests){
        Iterator<Request> iterator = requestQueue.iterator();

        while (iterator.hasNext()) {
            Request request = iterator.next();

            // Check if the elevator is at the source floor
            if (request.getSourceFloor() == elevator.getCurFloor()) {
                elevator.openDoor();
                elevator.closeDoor();
                byPassRequests.put(request, 0);
            }

            // Check if the elevator is at the destination floor
            if (request.getDestinationFloor() == elevator.getCurFloor() && byPassRequests.containsKey(request)) {
                elevator.openDoor();
                elevator.closeDoor();
                byPassRequests.remove(request);
                iterator.remove(); // Safe removal using the iterator
            }
        }
    }

}
