package com.FactoryPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleFactory obj = new CarFactory();
		VehicleFactory obj1 = new MotorCycleFactory();
		obj.createVehicle();
		obj.driveVehicle();
        obj1.createVehicle();
        obj1.driveVehicle();
        VehicleFactory obj2 = new TruckFactory();
        obj2.createVehicle();
		obj2.driveVehicle();
	}

}
