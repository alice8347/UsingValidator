import java.util.Scanner;

public class PersonalApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
		double height = 0.0, weight = 0.0, decimalNum;
		name = Validator.getString(sc, "Name: ");
		age = Validator.getInt(sc, "Age: ", 1, 100);
		height = Validator.getDouble(sc, "Height (inches): ", 36, 92);
		weight = Validator.getDouble(sc, "Weight (lbs): ", 80, 400);
		decimalNum = Validator.getDouble(sc, "Favorite Decimal Number: ", 0, 1);
		System.out.println("");
		System.out.println("--------------------Personal Information--------------------");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height);
		System.out.println("Weight: " + weight);
		System.out.println("Favorite Decimal Number: " + decimalNum);
	}

}
