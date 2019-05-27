package by.niakhai.lesson4.task2.entity;

public class Circle {
	
	private int number;
	private double radius;
	
	public Circle(int number, double radius) {
		
		if (number > 0) {
			this.number = number;			
		}
		if (radius > 0) {
			this.radius = radius;			
		}
	}

	public int getNumber() {
		return number;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public boolean equals(Object o) {
		
		if (this == o)
			return true;
		
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		
		Circle circle = (Circle) o;
		
		return number == circle.getNumber() && radius == circle.getRadius();
	}
	
	@Override
	public int hashCode() {
		return (int)(number + radius);
	}
	
	public double getSquare() {
		return Math.PI * Math.pow(radius, 2);
	}
	
}