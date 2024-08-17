import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter marks in subject 1: ");
		Integer marks1 = sc.nextInt();
		System.out.println("Enter marks in subject 2: ");
		Integer marks2 = sc.nextInt();
		System.out.println("Enter marks in subject 3: ");
		Integer marks3 = sc.nextInt();
		Integer average = (marks1 + marks2 + marks3) / 3;
		if (average >= 50) {
			System.out.println(name + "your average is " + average + ". You passed.");
		} else {
			System.out.println(name + "your average is " + average + ". You failed.");
		}
		sc.close();
	}
}