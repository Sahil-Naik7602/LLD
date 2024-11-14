import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingFloor {
    Map<ParkingSlotType, List<ParkingSlot>> parkingSlots;
    private String name;

    public ParkingFloor(Map<ParkingSlotType, List<ParkingSlot>> parkingSlots, String name) {
        this.parkingSlots = new HashMap<>();
        this.name = name;
    }

    public void addParkingSlot(ParkingSlotType parkingSlotType, ParkingSlot parkingSlot){
        List<ParkingSlot> parkingSlotList = parkingSlots.getOrDefault(parkingSlotType,new ArrayList<>());
        parkingSlotList.add(parkingSlot);
        parkingSlots.put(parkingSlotType,parkingSlotList);
    }

    public ParkingSlot getRelevantSlotForVehicleAndPark(Vehicle vehicle){
        VehicleType vehicleType = vehicle.getVehicleType();
        ParkingSlotType parkingSlotType = pickCorrect(vehicleType);
        if (parkingSlotType!=null){
            for (ParkingSlot ps:parkingSlots.get(parkingSlotType)){
                if (ps.getIsAvaialble()){
                    ps.parkVehicle(vehicle);
                    return ps;
                }
            }
        }
        System.out.println("No spot left for "+vehicleType+" all the "+parkingSlotType+" slots are filled");
        return null;
    }

    public ParkingSlotType pickCorrect(VehicleType vehicleType){
        if (vehicleType == VehicleType.CAR){
            return ParkingSlotType.MEDIUM;
        } else if (vehicleType == VehicleType.BIKE) {
            return ParkingSlotType.SMALL;
        }else if(vehicleType == VehicleType.BUS){
            return ParkingSlotType.LARGE;
        }
        return null;
    }

    public String getName(){
        return this.name;
    }



}
