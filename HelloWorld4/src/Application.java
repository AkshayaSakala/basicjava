
public class Application {

	public static void main(String[] args) {

		Student akshaya = new Student("Akshaya");
		akshaya.doingHW();
		akshaya.numberOfMinutes=20;
		int minutesRead = akshaya.readBook("Harry Potter");
		System.out.println("minutes read " +minutesRead);

		/*
		Student adhira = new Student("Adhira");
		adhira.doingHW();
		akshaya.numberOfMinutes=30;
		//minutesRead = adhira.readBook("Percy Jackson");
		System.out.println("minutes read " + adhira.numberOfMinutes);

*/
	}

}