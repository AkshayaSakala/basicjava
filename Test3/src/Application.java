
public class Application {
	public static void main(String[] args) {
		System.out.println("This is my third test!");

	Car c = new Car();
	c.start();
	int p = c.getNumberOfWheels();
	System.out.println("Number of wheels: "  + p);
	boolean o = c.changeOil("AOil");
	System.out.println("The type of oil is " + o);
	}
}
