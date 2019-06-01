package by.epam.javatraining.niakhai.task2.model.logic;

public class SymbolLogic {
	
	public static String getSymbolInfo(String s) {
		
		String result = "This symbol isn't vowel.";
		
		if (checkSymbol(s)) {
			
			char vowel = s.charAt(0);
			
			if (vowel == 'a') {
				result = "Is vowel a (Latin).";
			} else if (vowel == 'e') {
				result = "Is vowel e (Latin).";
			} else if (vowel == 'i') {
				result = "Is vowel i (Latin).";
			} else if (vowel == 'o') {
				result = "Is vowel o (Latin).";
			} else if (vowel == 'u') {
				result = "Is vowel u (Latin)";
			} else if (vowel == 'y') {
				result = "Is vowel y (Latin)";
			} else if (vowel == 'а') {
				result = "Is vowel а (Cyrillic)";
			} else if (vowel == 'о') {
				result = "Is vowel о (Cyrillic)";
			} else if (vowel == 'у') {
				result = "Is vowel у (Cyrillic)";
			} else if (vowel == 'ы') {
				result = "Is vowel ы (Cyrillic)";
			} else if (vowel == 'э') {
				result = "Is vowel э (Cyrillic)";
			} else if (vowel == 'я') {
				result = "Is vowel я (Cyrillic)";
			} else if (vowel == 'ё') {
				result = "Is vowel ё (Cyrillic)";
			} else if (vowel == 'ю') {
				result = "Is vowel ю (Cyrillic)";
			} else if (vowel == 'и') {
				result = "Is vowel и (Cyrillic)";
			} else if (vowel == 'е') {
				result = "Is vowel е (Cyrillic)";
			}
		}
		return result;
	}
	
	public static boolean checkSymbol(String s) {
		
		String result = "Illegal data, input only one symbol.";
		
		if (s.length() == 1) {
			return true;
		} else {
			System.out.println(result);
			return false;
		}
	}
}