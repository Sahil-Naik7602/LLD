import java.util.List;

public class ParkingLot {
    private static ParkingLot parkingLot;
    String name;
    List<ParkingFloor> parkingFloors;
    TicketService ticketService;

    private ParkingLot(String name){
        this.name = name;
    }

    public ParkingLot getInstance(String nameOfParkingLot){
        if (parkingLot == null){
            parkingLot = new ParkingLot(nameOfParkingLot);
        }
        return parkingLot;
    }

    public void addFloors(ParkingFloor parkingFloor){
        parkingFloors.add(parkingFloor);
    }

    public void removeFloors(ParkingFloor parkingFloor){
        parkingFloors.remove(parkingFloor);
    }

    public boolean parkVehicle(Vehicle vehicle){
        //Here first check slot is available or not
        for (ParkingFloor pf: parkingFloors){
            ParkingSlot parkingSlot = pf.getRelevantSlotForVehicleAndPark(vehicle);
            if (parkingSlot != null){
                //Generate Ticket
                Ticket ticket = ticketService.generateTicket(vehicle,parkingSlot,pf);
                vehicle.setTicket(ticket.getTicketId());
                return true;
            }
        }
        return false;
    }

    public void unParkVehicle(Vehicle vehicle){
        //Validation to check whether this vehicle is already in PArkingLot or not
        long exitTime = System.currentTimeMillis();
        Ticket ticket = ticketService.searchTicket(vehicle.getTicketId());
        ticket.setUnParkingTime(exitTime);
        int duration = (int) ((exitTime - ticket.getParkingTime())/1000);
        ParkingSlot parkingSlot = ticket.getParkingSlot();
        int pricePaid = parkingSlot.getParkingSlotType().getPriceForParking(duration);
        ticket.setPricePaid(pricePaid);
        ticketService.updateTicket(ticket);

        //Also make the parkingSlotFree
        parkingSlot.unparkVehicle(vehicle);
    }

}
