
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating my own data types.");
		
		Person akshaya = new Person();
		akshaya.setAge(12);
		akshaya.setName("Akshaya");
		akshaya.setGrade(7);

		Person adhira = new Person();
		adhira.setAge(12);
		adhira.setName("Adhira");
		adhira.setGrade(7);

		System.out.println(akshaya.getName());
		System.out.println(adhira.getName());
		System.out.println(akshaya.getAge());
		System.out.println(adhira.getAge());
		System.out.println(akshaya.getGrade());
		System.out.println(adhira.getGrade());
	}

}
