import java.util.Scanner;

public class Fitness {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Weight in KiloGrams: ");
		Float Weight = sc.nextFloat();
		System.out.println("Enter your Height in Meters: ");
		Float Height = sc.nextFloat();
		Float BMI = Weight/(Height * Height);
		System.out.println("Your BMI is: " + BMI + ".");
		sc.close();
	}
}