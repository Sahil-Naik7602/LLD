package Elevator;

import java.util.List;

public class ScanStrategy implements Strategy {

    @Override
    public Request getBestRequest(Elevator elevator, List<Request> requestQueue) {
        if (requestQueue.isEmpty()){return null;};
        Direction dir = elevator.getDir();
        int curFloor = elevator.getCurFloor();
        Request bestRequest = null;
        int bestrequestRating = 0;
        for (Request request:requestQueue){
            int src = request.getSourceFloor();
            int dst = request.getDestinationFloor();
            if (src==curFloor){
                bestRequest = request;
                break;
            }
            else if (dir==Direction.UP || dir==Direction.STILL) {
                if (src>curFloor){
                    if (dst>src && bestrequestRating<4){
                        bestrequestRating = 4;
                        bestRequest = request;
                    } else if (src>dst && dst>curFloor && bestrequestRating<3) {
                        bestrequestRating = 3;
                        bestRequest = request;
                    } else if (curFloor>dst && bestrequestRating<2) {
                        bestrequestRating = 2;
                        bestRequest = request;
                    }
                }else{
                    bestrequestRating = 1;
                    bestRequest = request;
                }
            }else{
                if (src<curFloor){
                    if (dst<src && bestrequestRating<4){
                        bestrequestRating = 4;
                        bestRequest = request;
                    } else if (src<dst && dst<curFloor && bestrequestRating<3) {
                        bestrequestRating = 3;
                        bestRequest = request;
                    } else if (curFloor<dst && bestrequestRating<2) {
                        bestrequestRating = 2;
                        bestRequest = request;
                    }
                }else{
                    bestrequestRating = 1;
                    bestRequest = request;
                }
            }
        }
        return bestRequest;
    }
}
