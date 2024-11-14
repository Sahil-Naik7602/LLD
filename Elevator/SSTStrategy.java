package Elevator;

import java.util.List;

public class SSTStrategy implements Strategy{
    @Override
    public Request getBestRequest(Elevator elevator, List<Request> requestQueue) {
        if (requestQueue.isEmpty()){return null;};

        int currentFloor = elevator.getCurFloor();
        Request closestRequest = requestQueue.get(0);

        for (Request request : requestQueue) {
            if (Math.abs(request.getSourceFloor() - currentFloor) <
                    Math.abs(closestRequest.getSourceFloor() - currentFloor)) {
                closestRequest = request;
            }
        }
        return closestRequest;
    }
}
