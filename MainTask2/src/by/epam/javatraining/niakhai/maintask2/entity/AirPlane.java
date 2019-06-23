package by.epam.javatraining.niakhai.maintask2.entity;

public class AirPlane implements Comparable<AirPlane>{
	
	Manufacturer manufacturer;
	String model;
	AirPlaneType type;
	int year;
	int crew;
	int passangers;
	int cargo;
	int maxSpeed;
	int fuelConsumption;
	
	public AirPlane() {
	}
	
	public AirPlane(String model, String type, int year, int crew, int passangers,
			int cargo, int maxSpeed, int fuelConsumption) {
		
		this.model = model;
		
		if (type.equals("passanger")) {
			this.type = AirPlaneType.PASSANGER;
		} else if (type.equals("cargo")) {
			this.type = AirPlaneType.CARGO;
		}
		
		if (year >= 1950) {
			this.year = year;
		}
		
		if (crew > 0) {
			this.crew = crew;
		}
		
		if (passangers > 0) {
			this.passangers = passangers;
		}
		
		if (cargo >= 0) {
			this.cargo = cargo;
		}
		
		if (maxSpeed > 300) {
			this.maxSpeed = maxSpeed;
		}
		
		if (fuelConsumption > 0) {
			this.fuelConsumption = fuelConsumption;
		}
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public AirPlaneType getType() {
		return type;
	}

	public void setType(AirPlaneType type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}

	public int getPassangers() {
		return passangers;
	}

	public void setPassangers(int passangers) {
		this.passangers = passangers;
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	@Override
	public String toString() {
		
		String info = manufacturer + " " + model + ", year: " + year + ", passangers: " + passangers
				+ ", cargo: " + cargo + ", max. speed: " + maxSpeed 
				+ ", fuelCons.: " + fuelConsumption;
		return info;
	}

	@Override
	public int compareTo(AirPlane airPlane) {
		return this.manufacturer.compareTo(airPlane.getManufacturer());
	}
}