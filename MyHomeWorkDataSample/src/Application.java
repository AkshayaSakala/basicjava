
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My homework data sample is handbags");

		Handbags H1 = new Handbags();
		H1.color = "red";
		H1.material = "leather";
		H1.brand = "Coach";
	
		Handbags H2 = new Handbags();
		H2.color = "green";
		H2.material = "cloth";
		H2.brand = "Gucci";
		
		System.out.println(H1.color);
		System.out.println(H2.color);
		System.out.println(H1.material);
		System.out.println(H2.material);
		System.out.println(H1.brand);
		System.out.println(H2.brand);
	}

}
