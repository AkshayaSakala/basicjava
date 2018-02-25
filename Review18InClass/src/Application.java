
public class Application {

	public static void main(String[] args) {

		int result = Math.add(3, 8, 7);
		System.out.println(result);
		int multiplyResult = Math.multiply(5, 7, 8);
		System.out.println(multiplyResult);
		int divideResult = Math.divide(140, 8);
		System.out.println(divideResult);

		Math m1 = new Math();
		int result1 = m1.addSpecial(2);
		System.out.println(result1);
		int result2 = m1.addSpecial(3);
		System.out.println(result2);
		int result3 = m1.addSpecial(4);
		System.out.println(result3);

		Math m2 = new Math();
		int result4 = m2.addSpecial(2);
		System.out.println(result4);
		int result5 = m2.addSpecial(3);
		System.out.println(result5);
		
		int result6 = m1.addSpecial(11);
		System.out.println(result6);
		
		Dog d1 = new Dog();
		d1.feed();
		
	}

}
