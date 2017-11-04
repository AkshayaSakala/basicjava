
public class Person {
	String name;
	int age;

	Person(int years, String call) {
		age = years;
		name = call;
	}

	boolean canDrive() {
		if (age >= 16) {
			return true;
		} else {
			return false;
		}
	}
}