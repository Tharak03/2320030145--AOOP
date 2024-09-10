package com.FactoryPattern;

public abstract class VehicleFactory {
	public abstract Vehicle createVehicle();
	public void driveVehicle() {
		Vehicle vehicleobj = createVehicle();
		vehicleobj.drive();
	}

}
