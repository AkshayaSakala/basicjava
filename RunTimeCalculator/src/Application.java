import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of laps ran.");
		Scanner scanner = new Scanner(System.in);
		int laps = scanner.nextInt();
		
		double totalTime = 0;
		for(int i= 1;i <= laps; i= i + 1){
			System.out.println("Enter time for lap "+ i +" in minutes");
			double timeForLaps =scanner.nextDouble();
			totalTime= totalTime + timeForLaps;
		}
		System.out.println("Total time is " +totalTime+ " minutes");
		
		scanner.close();
	}

}
