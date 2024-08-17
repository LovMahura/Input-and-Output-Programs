import java.util.Scanner;

public class Library {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Title of Book you want: ");
		String booktitle = sc.nextLine();
		System.out.println("Enter Author name: ");
		String Author = sc.nextLine();
		System.out.println("Enter number of copies you want: ");
		Integer copies = sc.nextInt();
		System.out.print("Book: " + booktitle + " by " + Author + ", " + copies + " copies available.");
		sc.close();
	}
}