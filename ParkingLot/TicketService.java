import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TicketService {
    Map<String,Ticket> ticketDB = new HashMap<>();

    public Ticket generateTicket(Vehicle vehicle,ParkingSlot parkingSlot,ParkingFloor parkingFloor){
        Ticket ticket = new Ticket();
        long entryTime = System.currentTimeMillis();
        String id = vehicle.getNumberPlate() + "#" +entryTime;
        ticket.setTicketId(id);
        ticket.setParkingSlot(parkingSlot);
        ticket.setParkingFloor(parkingFloor);
        ticket.setParkingTime(entryTime);
        ticket.setVehicleNumberPlate(vehicle.getNumberPlate());
        ticketDB.put(id,ticket);
        return ticket;
    }

    public Ticket searchTicket(String ticketId){
        return ticketDB.getOrDefault(ticketId,null);
    }

    public void updateTicket(Ticket ticket){
        ticketDB.put(ticket.getTicketId(),ticket);
    }
}
