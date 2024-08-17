import java.util.Scanner;

public class Bill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first item: ");
		String item1 = sc.next();
		Float price1 = 8.50f;
		System.out.println("Enter your second item: ");
		String item2 = sc.next();
		Float price2 = 3.00f;
		System.out.println("Enter your third item: ");
		String item3 = sc.next();
		Float price3 = 2.50f;
		Float tax = 1.95f;
		System.out.println("Your total bill, including tax is: $" + (price1 + price2 + price3 + tax) + ".");
		sc.close();
	}
}