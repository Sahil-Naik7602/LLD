public class TrafficLight {
    int id;
    Signal currentSignal;
    Road associatedRoad;

    public TrafficLight(int id,Road road) {
        this.id = id;
        this.associatedRoad = road;
        this.currentSignal = Signal.RED;
    }
    public void setCurrentSignal(Signal signal){
        notifyRoad(signal.name());
        this.currentSignal = signal;
    }
    public Signal getCurrentSignal(){
        return currentSignal;
    }
    public void notifyRoad(String signal){
        associatedRoad.getUpdate("SIGNAL --> "+ signal);
    }

    public int getId() {
        return id;
    }

    public Road getAssociatedRoad() {
        return associatedRoad;
    }
}
