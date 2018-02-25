
public class Math {

	static int add(int x, int y, int r) {
		int result = x + y + r;
		return result;
	}

	static int multiply(int x, int y, int r) {
		int multiplyResult = x * y * r;
		return multiplyResult;
	}

	static int divide(int x, int y) {
		int divideResult = x / y;
		return divideResult;
	}

	int previousNumber = 0;

	int addSpecial(int x){
	int total;
	total = x + previousNumber;
	previousNumber = total;
	return total;	
	}
}
