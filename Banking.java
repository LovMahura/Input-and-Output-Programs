import java.util.Scanner;

public class Banking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Initial Balance: ");
		Float InitialBalance = sc.nextFloat();
		System.out.println("Enter your Withdrawal Amount: ");
		Float WithdrawalAmount = sc.nextFloat();
		System.out.println("Enter your Deposit Amount: ");
		Float DepositAmount = sc.nextFloat();
		System.out.println("Your new balance is $" + (InitialBalance-WithdrawalAmount+DepositAmount));
		sc.close();
	}
}