import java.util.Scanner;

public class Ticket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter movie name: ");
		String moviename = sc.next();
		System.out.println("Enter number of ticket: ");
		Integer ticketnumber = sc.nextInt();
		Float PricePerTicket = 12.00f;
		System.out.println("Total cost of " + ticketnumber + " tickets to " + moviename + " is: $" + (ticketnumber*PricePerTicket)". Enjoy the movie!");
		sc.close();
	}
}