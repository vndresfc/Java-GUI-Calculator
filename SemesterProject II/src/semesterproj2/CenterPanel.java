package semesterproj2;

import java.awt.*;
import javax.swing.*;

class CenterPanel extends JPanel {

	JButton hexButton, decButton, octButton, binButton;
	JTextArea hexVal, decVal, octVal, binVal;
	
	public CenterPanel() {
		// Layout
		setLayout(new GridBagLayout());
		
		// Constraints
		GridBagConstraints c = new GridBagConstraints();

		// Hex button & label
		hexButton = new JButton("HEX");
		c.gridx = 0;
		c.gridy = 0;
		c.weighty = 1;
		c.weightx = 1;
		c.anchor = GridBagConstraints.LINE_START;
		add(hexButton, c);
		
		hexVal = new JTextArea("0");
		c.gridx = 1;
		c.gridy = 0;
		hexVal.setEditable(false);
		hexVal.setOpaque(false);
		add(hexVal, c);
		
		// Dec button & label
		decButton = new JButton("DEC");
		c.gridx = 0;
		c.gridy = 1;
		add(decButton, c);
		
		decVal = new JTextArea("0");
		c.gridx = 1;
		c.gridy = 1;
		decVal.setEditable(false);
		decVal.setOpaque(false);
		add(decVal, c);
		
		// Oct button & label
		octButton = new JButton("OCT");
		c.gridx = 0;
		c.gridy = 2;
		add(octButton, c);
		
		octVal = new JTextArea("0");
		c.gridx = 1;
		c.gridy = 2;
		octVal.setEditable(false);
		octVal.setOpaque(false);
		add(octVal, c);
		
		// Bin button & label
		binButton = new JButton("BIN");
		c.gridx = 0;
		c.gridy = 3;
		add(binButton, c);
		
		binVal = new JTextArea("0", 20, 1);
		c.gridx = 1;
		c.gridy = 3;
		binVal.setEditable(false);
		binVal.setOpaque(false);
		add(binVal, c);

		
	}
	
	public final JButton getBHex() {return hexButton;}
	public final String getBHexName() {return hexButton.getText();}
	
	public final JButton getBDec() {return decButton;}
	public final String getBDecName() {return decButton.getText();}
	
	public final JButton getBOct() {return octButton;}
	public final String getBOctName() {return octButton.getText();}
	
	public final JButton getBBin() {return binButton;}
	public final String getBBinName() {return binButton.getText();}
	
}
