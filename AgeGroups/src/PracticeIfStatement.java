
public class PracticeIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 8;
		
		if (age < 13){
			System.out.println("you are a kid");
	
		}else if (age >= 13 && age <= 19){
			System.out.println("you are a teen");
		
		}else if (age >= 20 && age <= 60){
			System.out.println("you are an adult");
		
		}else {
			System.out.println("you are a senior citizen");
		}
	}

}
