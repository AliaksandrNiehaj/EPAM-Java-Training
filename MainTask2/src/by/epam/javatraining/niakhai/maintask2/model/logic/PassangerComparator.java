package by.epam.javatraining.niakhai.maintask2.model.logic;

import java.util.Comparator;

import by.epam.javatraining.niakhai.maintask2.entity.AirPlane;

public class PassangerComparator implements Comparator<AirPlane> {

	@Override
	public int compare(AirPlane o1, AirPlane o2) {
		
		Integer passanger1 = new Integer(o1.getPassangers());
		Integer passanger2 = new Integer(o2.getPassangers());
		
		return passanger2.compareTo(passanger1);
	}
}