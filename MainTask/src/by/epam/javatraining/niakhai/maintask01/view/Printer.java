package by.epam.javatraining.niakhai.maintask01.view;

public class Printer {
	
	public static void println(String string, int number) {
		System.out.printf(string + "\n", number);
	}
	
	public static void println(String string, double number) {
		System.out.printf(string + "\n", number);
	}
	
	public static void println(String string, boolean bool) {
		System.out.printf(string + "\n", bool);
	}
	
	public static void println(String string, int[] array) {
		System.out.print(string + ": ");
		for (int x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static void println(String str, int search, int index) {
		System.out.printf(str + "\n", search, index);
	}

}
