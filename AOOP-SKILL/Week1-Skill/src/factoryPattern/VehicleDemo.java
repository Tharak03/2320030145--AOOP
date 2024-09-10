package factoryPattern;

public class VehicleDemo {

    public static void main(String[] args) {
        // Create a factory for each type of vehicle
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory motorcycleFactory = new MotorCycleFactory();
        VehicleFactory truckFactory = new TruckFactory();

        // Use the factory to create and drive vehicles
        carFactory.driveVehicle();
        motorcycleFactory.driveVehicle();
        truckFactory.driveVehicle();
    }
}
