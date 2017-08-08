import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.print("give a number:");
			Scanner scanner =new Scanner(System.in);
			int number = scanner.nextInt();
			
			int i;
			for(i= 1; i <= 10 ; i= i+1) {
				int result = number * i;
				System.out.println(result);
			}

	}

}
