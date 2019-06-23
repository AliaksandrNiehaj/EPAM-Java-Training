package by.epam.javatraining.niakhai.maintask2.model.logic;

import java.util.Comparator;

import by.epam.javatraining.niakhai.maintask2.entity.AirPlane;

public class CargoComparator implements Comparator<AirPlane> {

	@Override
	public int compare(AirPlane o1, AirPlane o2) {
		
		Integer cargo1 = new Integer(o1.getCargo());
		Integer cargo2 = new Integer(o2.getCargo());
		
		return cargo2.compareTo(cargo1);
	}
}