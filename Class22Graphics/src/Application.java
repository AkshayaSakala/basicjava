import java.awt.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame f = new Frame("Sakala");
		f.setSize(1000, 1000);
		f.setBackground(Color.blue);

		
		Label l = new Label("Hi! I am Akshaya! Who are you?");
		f.add(l);
		
		Label l2 = new Label("I go to Stoller Middle School");
		f.add(l2);
		f.setVisible(true);
	}

}
