
public class Student {
	String name;
	int age;

	Student(String inputName) {
		name = inputName;
		System.out.println("The Student's name is " + name + " !");
	}

	Student(String inputName, int inputAge) {
		name = inputName;
		age = inputAge;
		System.out.println("The Student's name is " + name + "! The Student's age is " + age + " !");
	}

	void readBook(String bookName){
		checkOut(bookName);
		readingBook(bookName);
		returnBook(bookName);
		
	}

	void checkOut(String bookName) {
		System.out.println("Checkout book " + bookName);
	}

	void readingBook(String bookName) {
		System.out.println("Read book " + bookName);
	}

	void returnBook(String bookName) {
		System.out.println("Return book " + bookName);
	}

}
