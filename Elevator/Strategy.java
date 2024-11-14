package Elevator;

import java.util.List;

public interface Strategy {
    public Request getBestRequest(Elevator elevator, List<Request> requestQueue);
}
