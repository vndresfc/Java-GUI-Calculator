package semesterproj2;

import java.awt.*;
import javax.swing.*;

class TopPanel extends JPanel {

	JTextArea answerArea;
	JLabel opLabel, title;
	
	public TopPanel() {		
		setLayout(new GridBagLayout());
		
		// Fonts and constraints for the JPanel
		Font ft = new Font("Helvetica", Font.PLAIN, 22);
		Font ft2 = new Font("Helvetica", Font.PLAIN, 14);
		Font ft3 = new Font("Helvetica", Font.PLAIN, 30);
		GridBagConstraints c = new GridBagConstraints();
		c.gridheight = 1;
		c.gridwidth = 1;
		c.weightx = 1;
		c.weighty = 1;
		
		// Properties of the programmer label
		title = new JLabel(" "+"\u2630" + " " + "Programmer");
		c.gridx = 0;
		c.gridy = 0;
		c.ipady = 20;
		c.anchor = GridBagConstraints.LINE_START;
		title.setFont(ft);
		add(title, c);
		
		// Properties of the math operations label
		opLabel = new JLabel(" ");
		c.gridx = 0;
		c.gridy = 1;
		c.anchor = GridBagConstraints.LINE_END;
		opLabel.setFont(ft2);
		add(opLabel, c);
		
		// Properties of the answer area
		answerArea = new JTextArea();
		c.gridx = 0;
		c.gridy = 2;
		c.anchor = GridBagConstraints.LINE_END;
		answerArea.setOpaque(false);
		answerArea.setEditable(false);
		answerArea.setFont(ft3);
		add(answerArea, c);
		
		
	}
	
	public void setText(String s) {
		answerArea.setText(null);
		answerArea.setText(s);
		
	}
	
	public String getText() {
		return answerArea.getText();
	}
	
	public void setOpLabelText(String s) {
		opLabel.setText(s);
		
	}
	
	public String getOpLabelText() {
		return opLabel.getText();
	}
	
	
}
