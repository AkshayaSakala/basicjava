import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("give number:");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			
			if(number % 2 == 0){
				System.out.println( number +" is even");
			
			}else{
				System.out.println( number +" is odd");
			}
	}

} 
