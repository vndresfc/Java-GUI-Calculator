package semesterproj2;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator window = new Calculator();
		window.setTitle("Calculator");
		window.setVisible(true);
		window.setSize(460,600);
		window.setLocation(450, 90);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
