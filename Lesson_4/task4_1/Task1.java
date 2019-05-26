package by.niakhai.task4_1;

public class Task1 {

	public static void main(String[] args) {
		
		int a = 5, b = 7, c = 3;
		boolean sign;
		
		NumberChecker numberChecker = new NumberChecker();
		sign = numberChecker.checkNumbers(a, b, c);
		
		InfoPrinter infoPrinter = new InfoPrinter();
		infoPrinter.getInfo(sign);
		
	}
}