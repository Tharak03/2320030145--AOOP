package com.FactoryPattern;

public class MotorCycleFactory extends VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new MotorCycle();
	}

}
