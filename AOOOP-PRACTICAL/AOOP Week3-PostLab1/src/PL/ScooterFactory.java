package PL;

public class ScooterFactory implements VehicleFactory {
	public Vehicle createVehicle() {
        return new Scooter();
    }
}
