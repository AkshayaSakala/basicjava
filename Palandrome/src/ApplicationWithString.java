
public class ApplicationWithString {
	
	public static void main(String[] args) {
		int num;
		int count = 0;
		int x = 10000000;
		for (num = 0; num < x; num++) {
			String numAsString = Long.toString(num);//string as integer
			StringFunctions rev = new StringFunctions();
			String reverseNumAsString = rev.variationReverse(numAsString);//invoke reverse method			
			long revNumber = Long.valueOf(reverseNumAsString);
			if(revNumber == num){
				count = count + 1;
			System.out.println(revNumber);
			}
		}
		System.out.println("There are "+ count + " palandromes in " + x +" numbers" );
	}
}
