package by.epam.javatraining.niakhai.maintask2.controller;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

import by.epam.javatraining.niakhai.maintask2.entity.AirPlane;
import by.epam.javatraining.niakhai.maintask2.entity.AviaCompany;
import by.epam.javatraining.niakhai.maintask2.model.logic.CargoComparator;
import by.epam.javatraining.niakhai.maintask2.model.logic.FuelConsumptionComparator;
import by.epam.javatraining.niakhai.maintask2.model.logic.MaxSpeedComparator;
import by.epam.javatraining.niakhai.maintask2.model.logic.PassangerComparator;
import by.epam.javatraining.niakhai.maintask2.model.logic.YearComparator;
import by.epam.javatraining.niakhai.maintask2.view.Printer;

public class MainTask2 {
	
	public static void main (String[] args) throws FileNotFoundException {
		
		AviaCompany aviaCompany = new AviaCompany("Smile Flying");
		ArrayList<AirPlane> fuelList = new ArrayList<>();
		
		int minFuelConsumption = 2000;
		int maxFuelConsumption = 9000;
		String path = "/Users/sasza/Java Development/Eclipse/WorkSpaceEE/MainTask2/src/params.txt";
		
		aviaCompany.createAviaCompany(path);
		
		int loadCapacity = aviaCompany.getLoadCapacity();
		int passangerCapacity = aviaCompany.getPassangerCapacity();
		
		String loadCapacityInfo = "General company loading capacity: " + loadCapacity;
		String passangerCapacityInfo = "General company passanger capacity: " + passangerCapacity;
		
		Printer.println(loadCapacityInfo);
		Printer.println(passangerCapacityInfo);
				
		Printer.println("Manufacturer sorting:");
		Collections.sort(aviaCompany.getAviaFleet());
		showList(aviaCompany);
		Printer.println("");
		
		Printer.println("Manufacture year sorting");
		Collections.sort(aviaCompany.getAviaFleet(), new YearComparator());
		showList(aviaCompany);
		Printer.println("");
		
		Printer.println("Load capacity sorting:");
		Collections.sort(aviaCompany.getAviaFleet(), new CargoComparator());
		showList(aviaCompany);
		Printer.println("");
		
		Printer.println("Passanger capacity sorting:");
		Collections.sort(aviaCompany.getAviaFleet(), new PassangerComparator());
		showList(aviaCompany);
		Printer.println("");
		
		Printer.println("Maximal speed capacity sorting:");
		Collections.sort(aviaCompany.getAviaFleet(), new MaxSpeedComparator());
		showList(aviaCompany);
		Printer.println("");
		
		Printer.println("Fuel consumption sorting:");
		Collections.sort(aviaCompany.getAviaFleet(), new FuelConsumptionComparator());
		showList(aviaCompany);
		Printer.println("");
		
		Printer.println("Search by fuel consumption:");
		fuelList = findByFuelConsumption(aviaCompany, minFuelConsumption, maxFuelConsumption);
		showFuelList(fuelList);
		
	}

	private static void showFuelList(ArrayList<AirPlane> fuelList) {
		for (AirPlane airPlane : fuelList) {
			System.out.println(airPlane);
		}
	}

	private static ArrayList<AirPlane> findByFuelConsumption(AviaCompany aviaCompany,
			int minFuelConsumption, int maxFuelConsumption) {
		
		ArrayList<AirPlane> list = new ArrayList<>();
		
		for (AirPlane airPlane : aviaCompany.getAviaFleet()) {
			int fuelConsumption = airPlane.getFuelConsumption();
			
			if (fuelConsumption >= minFuelConsumption && fuelConsumption <=  maxFuelConsumption) {
				list.add(airPlane);
			}
		}
		return list;
	}

	private static void showList(AviaCompany aviaCompany) {
		
		for (AirPlane airPlane : aviaCompany.getAviaFleet()) {
			Printer.println(airPlane.toString());
		}
	}
}