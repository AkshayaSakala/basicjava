
public class Application {

	public static void main(String[] args) {
		System.out.println("Today is November 5. We are learning static and more!!!");

		Math M1 = new Math();
		int result = M1.getAbsoluteValue(-9);
		System.out.println("The absolute value of the number is " + result + ".");

		Math M2 = new Math();
		int resultMax = M1.getMax(2, -6);
		System.out.println("The maximum number is " + resultMax + ".");

	}

}
