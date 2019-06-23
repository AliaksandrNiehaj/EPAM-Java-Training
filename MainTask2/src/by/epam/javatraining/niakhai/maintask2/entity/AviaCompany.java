package by.epam.javatraining.niakhai.maintask2.entity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AviaCompany {
	
	private String name;
	private ArrayList<AirPlane> aviaFleet = new ArrayList<>();
	
	public AviaCompany(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<AirPlane> getAviaFleet() {
		return aviaFleet;
	}

	public void setAviaFleet(ArrayList<AirPlane> aviaFleet) {
		this.aviaFleet = aviaFleet;
	}
	
	@Override
	public String toString() {
		return "AviaCompany " + name + " " + aviaFleet.size();
	}

	public ArrayList<AirPlane> createAviaCompany(String path) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File(path));
		fillCompany(scanner, aviaFleet);
		scanner.close();
		
		return aviaFleet;
	}

	private void fillCompany(Scanner scanner, ArrayList<AirPlane> arrayList) {
		
		while (scanner.hasNextLine()) {
			
			String string = scanner.nextLine();
			
			String[] parsingData = string.split(" ");
			
			String manufacturer = parsingData[0].toLowerCase();
			String model = parsingData[1].trim();
			String type = parsingData[2].toLowerCase().trim();
			int year = Integer.parseInt(parsingData[3]);
			int crew = Integer.parseInt(parsingData[4]);
			int passangers = Integer.parseInt(parsingData[5]);
			int cargo = Integer.parseInt(parsingData[6]);
			int maxSpeed = Integer.parseInt(parsingData[7]);
			int fuelConsumption = Integer.parseInt(parsingData[8]);
			
			if(manufacturer.equals("airbus")) {
				Airbus airbus = new Airbus(model, type, year, crew, passangers, cargo,
						maxSpeed, fuelConsumption);
				arrayList.add(airbus);
			}
			
			if(manufacturer.equals("boeing")) {
				Boeing boeing = new Boeing(model, type, year, crew, passangers, cargo,
						maxSpeed, fuelConsumption);
				arrayList.add(boeing);
			}
			
			if(manufacturer.equals("saab")) {
				Saab saab = new Saab(model, type, year, crew, passangers, cargo,
						maxSpeed, fuelConsumption);
				arrayList.add(saab);
			}
		}
	}

	public int getLoadCapacity() {
		
		int loadCapacity = 0;
		
		for (int i = 0; i < aviaFleet.size(); i++) {
			loadCapacity += aviaFleet.get(i).getCargo();
		}
		return loadCapacity;
	}

	public int getPassangerCapacity() {
		
		int passangerCapacity = 0;
		
		for (int i = 0; i < aviaFleet.size(); i++) {
			passangerCapacity += aviaFleet.get(i).getPassangers();
		}
		return passangerCapacity;
	}
}