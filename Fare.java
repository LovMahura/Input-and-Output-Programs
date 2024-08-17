import java.util.Scanner;

public class Fare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the travelling distance: ");
		Float distance = sc.nextFloat();
		Float FarePerKilometer = 2.50f;
		System.out.println("Your total fare for the trip is $" + (distance*FarePerKilometer));
		sc.close();
	}
}