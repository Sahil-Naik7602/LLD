package Elevator;


public class Elevator {
    int curFloor;
    Direction dir;
    DoorStatus doorstatus;

    public Elevator(){
        this.curFloor = 0;
        this.dir = Direction.STILL;
        this.doorstatus = DoorStatus.CLOSE;
    }

    public int getCurFloor() {
        return curFloor;
    }

    public Direction getDir() {
        return dir;
    }

    public DoorStatus getDoorstatus() {
        return doorstatus;
    }

    public void moveUp(){
        this.dir = Direction.UP;
        curFloor++;
        System.out.println("Elevator is moving Up to: "+curFloor);
    }

    public void moveDown(){
        this.dir = Direction.DOWN;
        curFloor--;
        System.out.println("Elevator is moving down to: "+curFloor);
    }

    public void openDoor(){
        this.doorstatus = DoorStatus.OPEN;
        System.out.println("Elevator is opening on floor:"+curFloor);
    }

    public void closeDoor(){
        this.doorstatus = DoorStatus.CLOSE;
        System.out.println("Elevator is closing on floor:"+curFloor);
    }

    public void stop(){
        this.dir = Direction.STILL;
    }



}
