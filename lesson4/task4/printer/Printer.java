package by.niakhai.lesson4.task4.printer;

public class Printer {
	
	public static void println(double message) {
		System.out.printf("%.2f\n", message);
	}
	
	public static void print(double message) {
		System.out.printf("%.2f", message);
	}
	
	public static void println(String message) {
		System.out.println(message);
	}
	
	public static void print(String message) {
		System.out.print(message);
	}
}
