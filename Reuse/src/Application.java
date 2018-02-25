import java.time.YearMonth;
import java.util.Date;

public class Application {

	public static void main(String[] args) {
		System.out.println("Today is December 3!!!!!!!!!!!!!!!!!! MEEEE SLEEEEEPPPPPPPPPPPPPYY!!!!!!");;
	
	
	Staff s1 = new Staff();
	int returns1 = s1.age = 48;
	s1.getAttendance();
	
	Teacher t1 = new Teacher();
	t1.id = 302922;
	t1.getAttendance();
	
	Student st1 = new Student();
	st1.getGrades();
	st1.getAttendance();
	
	System.out.println(s1.getAttendance());
	System.out.println(t1.id);
	System.out.println(returns1);
		
	double output = Math.sqrt(215);
	System.out.println(output);
	 
	double output1 = Math.cbrt(7678);
	System.out.println(output1);
	
	int aojed = Math.addExact(92, 34);
	System.out.println(aojed);
	
	int kuhfe = Math.getExponent(223283);
	System.out.println(kuhfe);
	
	Date now = new Date();
	System.out.println(now);

	YearMonth YM = YearMonth.of(210,5);
	System.out.println(YM.lengthOfMonth());
	
	}

}
