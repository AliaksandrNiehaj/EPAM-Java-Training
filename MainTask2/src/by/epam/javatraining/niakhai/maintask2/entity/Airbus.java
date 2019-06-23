package by.epam.javatraining.niakhai.maintask2.entity;

public class Airbus extends AirPlane {
	
	{
		manufacturer = Manufacturer.AIRBUS;
	}
	
	public Airbus (String model, String type, int year, int crew, int passangers,
			int cargo, int maxSpeed, int fuelConsumption) {
		
		super(model, type, year, crew, passangers, cargo, maxSpeed, fuelConsumption);
	}
}