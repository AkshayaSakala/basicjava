
public class Application {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("Borrowing money..");
		try {
			s1.borrowMoney(10);
			System.out.println("Borrowed succesfully!");
		} catch (Exception e) {
			String error = e.getMessage();
		    System.out.println("Could not borrow money because" + error);
		}

	}
}
