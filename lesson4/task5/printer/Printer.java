package by.niakhai.lesson4.task5.printer;

public class Printer {
	
	public static void println(String s) {
		System.out.println(s);
	}
	
	public static void println(String s, int number) {
		System.out.printf("%s %d", s, number);
	}
}