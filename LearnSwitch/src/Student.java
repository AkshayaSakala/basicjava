
public class Student {
	String name;

	Student(String imputName) {
		imputName = name;
	}

	Student() {

	}

	int play(int gameType) {

		if (gameType == 1) {
			System.out.println("Playing Basketball...");

		} else if (gameType == 2) {
			System.out.println("Playing Football...");

		} else {
			System.out.println("Playing...");

		}
		return 10;
	}

	int play2(int gameType) {
		switch (gameType) {

		case 1:
			System.out.println("Playing Basketball...");
			break;
		case 2:
			System.out.println("Playing Soccor...");
			break;

		case 3:
			System.out.println("Playing Football...");
			break;
		case 4:
			System.out.println("Playing...");
		}
		return 10;
	}
	int play(Game gametype){
		
		if(gametype == Game.basketball){
		System.out.println("Playing basketball...");
		
		}else if(gametype == Game.soccor){
		System.out.println("Playing soccor...");
			
		}else if(gametype == Game.football){
			System.out.println("playing football...");
		}
		return 10;
	}

}
