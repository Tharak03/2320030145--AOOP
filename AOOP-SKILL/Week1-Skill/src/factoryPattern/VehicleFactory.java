package factoryPattern;

public abstract class VehicleFactory {
    // Factory method to create a vehicle
    public abstract Vehicle createVehicle();

    // Method to drive the created vehicle
    public void driveVehicle() {
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }
}
