
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Learning my first function!");
		Calculator C1 = new Calculator();
		int sum = C1.add(2, 3);
		
		System.out.println(sum);
		Calculator C2 = new Calculator();
		int product = C1.multiply(7, 3);
		
		System.out.println(product);
		
	}

}
