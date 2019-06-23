package by.epam.javatraining.niakhai.maintask2.model.logic;

import java.util.Comparator;

import by.epam.javatraining.niakhai.maintask2.entity.AirPlane;

public class MaxSpeedComparator implements Comparator<AirPlane> {

	@Override
	public int compare(AirPlane o1, AirPlane o2) {
		
		Integer maxSpeed1 = new Integer(o1.getMaxSpeed());
		Integer maxSpeed2 = new Integer(o2.getMaxSpeed());
		
		return maxSpeed2.compareTo(maxSpeed1);
	}
}