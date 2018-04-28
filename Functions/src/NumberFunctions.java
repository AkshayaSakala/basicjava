
public class NumberFunctions {

	public long reverse(long inNumber) {
		long outNumber = 0;
		while (inNumber > 0) {
			long reminder = inNumber % 10;// find the ones place
			outNumber = outNumber * 10 + reminder;//add reminder to outNumber
			inNumber = inNumber / 10;//divide the in number by 10 once again
		}
		return outNumber;
//this loop continues until the inNumber becomes 0 
	}


}
