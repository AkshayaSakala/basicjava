import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your grade?");
		Scanner scanner= new Scanner(System.in);
		int number = scanner.nextInt();
	
		if(number < 5){
			System.out.println("You are in elementary school");
		
		}else if(number >= 6 && number <= 8){
			System.out.println("You are in middle school");
		
		}else if(number >= 9 && number <= 12){
			System.out.println("You are in high school");
			
		}else{
			System.out.println("You are in collage");
			
		
		    }
		}
	}


