public class Person {
	
	// PROPERTIES - START
	private int age;
	private String name;
	
	// PROPERTIES - END

	// CONSTRUCTORS - START
	// constructors parameters must be only ones necessary to create the object
	Person(int years, String letters){
		age= years;
		name= letters;	
	}
	// CONSTRUCTORS - END
	
	// METHODS
	int getAge(){
		return age;
	}
	String getName(){
		return name;
	//Return will feed the variable to application	
	}
	void printDetails(){
			System.out.println(name+"'s age is " + age);
	}
}


