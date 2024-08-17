import java.util.Scanner;

public class Cafeteria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter the item that you want: ");
		String item = sc.next();
		System.out.println("Enter the quantity you want: ");
		int quantity = sc.nextInt();
		System.out.println("Price per item : $4.50");
		System.out.println(name + ", your total for " + quantity + " " + item + "es is: $" + (quantity*4.50));
		sc.close();
	}
}