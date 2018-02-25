import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		String name;
		String school;
		char favLetter;
		int grade;

		for (int x = 9; x <= 100; x = x + 5) {
			System.out.println(x);
		}
		System.out.println("Give number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		if (number % 5 == 0) {
			System.out.println("The number is divisable by 5");
		} else {
			System.out.println("The number is not divisable by 5");
		}
	}
	//

}
