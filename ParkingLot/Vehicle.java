public class Vehicle {
    String numberPlate;
    VehicleType vehicleType;
    String ticketId;

    public Vehicle(String numberPlate, VehicleType vehicleType) {
        this.numberPlate = numberPlate;
        this.vehicleType = vehicleType;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicket(String ticketId) {
        this.ticketId = ticketId;
    }
}
