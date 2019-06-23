package by.epam.javatraining.niakhai.maintask2.model.logic;

import java.util.Comparator;

import by.epam.javatraining.niakhai.maintask2.entity.AirPlane;

public class YearComparator implements Comparator<AirPlane> {

	@Override
	public int compare(AirPlane o1, AirPlane o2) {
		
		Integer year1 = new Integer(o1.getYear());
		Integer year2 = new Integer(o2.getYear());
		
		return year1.compareTo(year2);
	}
}