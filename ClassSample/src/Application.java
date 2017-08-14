
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating my own data types.");
		
		Person P1 = new Person();
		P1.age = 12;
		P1.name = "Akshaya";
		P1.grade = 7;

		Person P2 = new Person();
		P2.age = 12;
		P2.name = "Adhira";
		P2.grade = 7;

		System.out.println(P1.name);
		System.out.println(P2.name);
		System.out.println(P1.age);
		System.out.println(P2.age);
		System.out.println(P1.grade);
		System.out.println(P2.grade);
	}

}
