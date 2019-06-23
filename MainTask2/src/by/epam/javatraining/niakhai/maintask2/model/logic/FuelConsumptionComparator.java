package by.epam.javatraining.niakhai.maintask2.model.logic;

import java.util.Comparator;

import by.epam.javatraining.niakhai.maintask2.entity.AirPlane;

public class FuelConsumptionComparator implements Comparator<AirPlane> {

	@Override
	public int compare(AirPlane o1, AirPlane o2) {

		Integer fuelConsumption1 = new Integer(o1.getFuelConsumption());
		Integer fuelConsumption2 = new Integer(o2.getFuelConsumption());
		
		return fuelConsumption1.compareTo(fuelConsumption2);
	}
}