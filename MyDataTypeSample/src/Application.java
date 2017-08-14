
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is my data type");
		
		School S1 = new School();
		S1.state = "Oregon";
		S1.name = "Stoller Middle School";
		S1.type = "Middle School";

		School S2 = new School();
		S2.state ="Oregon";
		S2.name = "Sunset High School";
		S2.type = "High School";

		System.out.println(S1.state);
		System.out.println(S2.state);
		System.out.println(S1.name);
		System.out.println(S2.name);
		System.out.println(S1.type);
		System.out.println(S2.type);
	
	}

}
