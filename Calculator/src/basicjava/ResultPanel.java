package basicjava;

import java.awt.*;
import javax.swing.*;

public class ResultPanel extends JPanel {
	JTextField t;
	ResultPanel(){
	
		t = new JTextField();
		t.setText("                    ");
		add(t);
	}
	public void showText(String number){
		t.setText(number);
	}
}
