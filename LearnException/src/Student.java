
public class Student {

	void borrowMoney(int amount) throws Exception{
	
	if(amount <= 0){
		Exception invalidInput = new Exception(" amount less than 0!");
		throw invalidInput;
	}if(amount >= 100){
		Exception invalidInput = new Exception(" amount greater than 100");
		throw invalidInput;
	}
	}
}
