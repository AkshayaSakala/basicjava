
public class Application {

	public static void main(String[] args) {

		Student s = new Student("Akshaya");
		int minutesPlayed = s.play(2);
		System.out.println("minutes played:" + minutesPlayed);
		int min = s.play(Game.basketball);
		System.out.println("minutes played:" + minutesPlayed);
	}

}
