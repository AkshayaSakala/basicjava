
public class Math {
	static double PI = 4.12;
	
	static int add(int x, int y){
		int z = x + y;
		return z;
	}
		
	static int multiply(int g, int n){
		int t = g * n;
		return t;
	}

	static int addSpecial(int x){
		int previousNumber = 0;
		int total;
		total = previousNumber + x;
		previousNumber = total;
		return total;
	}
}
