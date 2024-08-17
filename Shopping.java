import java.util.Scanner;

public class Shopping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price for 1 quantity of each product.");
		System.out.println("Laptop: $500.00, Mouse: $12.50, Keyboard: $45.00");
		System.out.println("Enter your first product: ");
		String product1 = sc.next();
		System.out.println("Enter quantity: ");
		Integer quantity1 = sc.nextInt();
		Float total1 = 500.00f*quantity1;
		System.out.println("Enter your second product: ");
		String product2 = sc.next();
		System.out.println("Enter quantity: ");
		Integer quantity2 = sc.nextInt();
		Float total2 = 12.50f*quantity2;
		System.out.println("Enter your third product: ");
		String product3 = sc.next();
		System.out.println("Enter quantity: ");
		Integer quantity3 = sc.nextInt();
		Float total3 =45.00f*quantity3;
		System.out.println("Total amount for your cart is: $" + (total1 + total2 + total3));
		sc.close();
	}
}