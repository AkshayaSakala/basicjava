package basicjava;

import java.awt.*;
import javax.swing.*;

public class Application {
	public static void main(String[] args) {

		// create new frame
		JFrame f = new JFrame("Calculator");
		// set size of frame
		f.setSize(1000, 1000);
		// setting the close button so that the frame will be closed when it is
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ResultPanel r = new ResultPanel();
		f.add(r);
		
		JPanel numberPanel = new JPanel();
		f.add(numberPanel);
		
		//adding the number panel class into the application class
		NumberPanel n = new NumberPanel();
		n.setResultPanel(r);
		// adding panel to frame
		f.add(n);
				
		OperationPanel o = new OperationPanel();
		f.add(o);
		
		GridLayout g = new GridLayout(2,2);
		f.setLayout(g);
		
		//allow the frame to visible; boolean
		f.setVisible(true);

	}
}
