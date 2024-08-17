import java.util.Scanner;

public class Registration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String firstname = sc.next();
		System.out.println("Enter your last name: ");
		String lastname = sc.next();
		System.out.println("Enter your age: ");
		Integer age = sc.nextInt();
		System.out.println("Enter your Email: ");
		String Email = sc.next();
		System.out.println("Thank you, " + firstname + " " + lastname + ". Your registration is complete.");
		System.out.println("Confirmation sent to " + Email + " .");
		sc.close();
	}
}