//classes are always nouns!!
public class Student {
	String name;
	int numberOfMinutes;
	
	Student(String importName){
		name = importName;
		
	}
	void doingHW(){
		System.out.println("DOING HOMEWORK = " + name);
	}
	int readBook(String bookName){
		System.out.println("Reading " + bookName);
	//	return numberOfMinutes;
		return 5;
	}
		
}


