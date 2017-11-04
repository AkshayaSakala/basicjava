
public class Book {
	String name;
	String author;

	Book(String inputName) {
		name = inputName;
	}

	void openBook(String bookName) {
		System.out.println("Open Book " + bookName);
	}

	private void flipCover(String bookName) {
		System.out.println("Flip opent the cover of " + bookName);

	}
}
