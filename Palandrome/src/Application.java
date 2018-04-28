
public class Application {

	public static void main(String[] args) {
		int num;
		int count = 0;
		int x = 10000;
		for (num = 0; count < x; num++) {
			NumberFunctions rev = new NumberFunctions();
			long reverseNum = rev.reverse(num);			
		
			if(reverseNum == num){
				count = count + 1;
			System.out.println(reverseNum);
			}
		}
		System.out.println("There are "+count+ " palandromes in " + x +" numbers" );
	}
}
