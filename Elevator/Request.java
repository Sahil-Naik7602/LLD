package Elevator;

public class Request {
    int destinationFloor;
    int sourceFloor;

    public Request(int sourceFloor, int destinationFloor){
        this.destinationFloor = destinationFloor;
        this.sourceFloor = sourceFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public int getSourceFloor() {
        return sourceFloor;
    }

    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }

    public void setSourceFloor(int sourceFloor) {
        this.sourceFloor = sourceFloor;
    }
}
