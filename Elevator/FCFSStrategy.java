package Elevator;

import java.util.List;

public class FCFSStrategy implements Strategy{
    @Override
    public Request getBestRequest(Elevator elevator, List<Request> requestQueue) {
        return requestQueue.isEmpty()? requestQueue.get(0):null;
    }
}
