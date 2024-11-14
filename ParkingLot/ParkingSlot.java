public class ParkingSlot {
    String id;
    private boolean isAvailable;
    Vehicle vehicle;
    ParkingSlotType parkingSlotType; //Need for this is suppose in future we want to park a small vehicle in a large parkingSlot

    public ParkingSlot(String id, ParkingSlotType parkingSlotType) {
        this.id = id;
        this.isAvailable = true;
        this.parkingSlotType = parkingSlotType;
    }

    public void parkVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isAvailable = false;
    }

    public void unparkVehicle(Vehicle vehicle){
        this.vehicle = null;
        this.isAvailable = true;
    }

    public boolean getIsAvaialble(){
        return this.isAvailable;
    }
    public String getParkingId(){
        return this.id;
    }

    public ParkingSlotType getParkingSlotType() {
        return parkingSlotType;
    }

    public void setParkingSlotType(ParkingSlotType parkingSlotType) {
        this.parkingSlotType = parkingSlotType;
    }
}
