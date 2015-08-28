import java.util.Scanner;

public class Validator {
	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next();
		sc.nextLine();
		return s;
	}
	
	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine();
		}
		return i;
	}
	
	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i <= min) {
				System.out.println("Error! Number must be greater than " + min + ".");
			} else if (i >= max) {
				System.out.println("Error! Number must be less than " + max + ".");
			} else {
				isValid = true;
			}
		}
		return i;
	}
	
	public static double getDouble(Scanner sc, String prompt) {
		double d = 0.0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid double value. Try again.");
			}
			sc.nextLine();
		}
		return d;
	}
	
	public static double getDouble(Scanner sc, String prompt, int min, int max) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d <= min) {
				System.out.println("Error! Number must be greater than " + min + ".");
			} else if (d >= max) {
				System.out.println("Error! Number must be less than " + max + ".");
			} else {
				isValid = true;
			}
		}
		return d;
	}
	
	public static boolean getBoolean(Scanner sc, String prompt) {
		boolean b = false;
		boolean isValid = false;
		
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNext()) {
				String s = sc.next();
				if (s.equalsIgnoreCase("true")) {
					isValid = true;
					b = true;
				} else if (s.equalsIgnoreCase("false")) {
					isValid = true;
					b = false;
				} else {
					System.out.println("Error! Invalid value. Try again.");
				}
			}
			sc.nextLine();
		}
		return b;
	}
}