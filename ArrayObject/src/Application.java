
public class Application {
	public static void main(String[] args) {
		String[] car;
		car = new String[10];
		System.out.println(car.length);
		for (int x = 0; x < car.length; x = x + 1) {
			car[x] = String.valueOf(x);
		}
		System.out.println("The array is over!");
	}
}
