package semesterproj2;

import java.awt.*;
import javax.swing.*;

class ButtonPanel extends JPanel {

	
	
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bLsh, bRsh, bOr, bXor, bNot, bAnd, bUp, bMod, bCE, bClr, bDel,
	bDiv, bMul, bSub, bAdd, bEq, bDot, bPlusMinus, bOParen, bCParen, bA, bB, bC, bD, bE, bF,
	bMenu, bMenu2, bWORD, bMS, bM, bEmpty;
	
	public ButtonPanel() {	
		// Button Panel Layout
		setLayout(new GridBagLayout());
	
		GridBagConstraints c = new GridBagConstraints();
		c.gridheight = 1;
		c.gridwidth = 1;
		c.weighty = 1;
		c.weightx = 1;
		
		// Row 1
		bMenu = new JButton("...");
		c.gridx = 0;
		c.gridy = 0;
		add(bMenu, c);
		
		bMenu2 = new JButton(".....");
		c.gridx = 1;
		c.gridy = 0;
		add(bMenu2, c);
		
		bWORD = new JButton("WORD");
		c.gridx = 2;
		c.gridy = 0;
		c.ipadx = 50;
		add(bWORD, c);
		
		bMS = new JButton("MS");
		c.gridx = 3;
		c.gridy = 0;
		add(bMS, c);
		
		bM = new JButton("M");
		c.gridx = 4;
		c.gridy = 0;
		add(bM, c);
		
		bEmpty = new JButton(" ");
		c.gridx = 5;
		c.gridy = 0;
		add(bEmpty, c);
		
		// Row 2
		bLsh = new JButton("Lsh");
		c.gridx = 0;
		c.gridy = 1;
		add(bLsh, c);
		
		bRsh = new JButton("Rsh");
		c.gridx = 1;
		c.gridy = 1;
		add(bRsh, c);
		
		bOr = new JButton("Or");
		c.gridx = 2;
		c.gridy = 1;
		add(bOr, c);
		
		bXor = new JButton("Xor");
		c.gridx = 3;
		c.gridy = 1;
		add(bXor, c);
		
		bNot = new JButton("Not");
		c.gridx = 4;
		c.gridy = 1;
		add(bNot, c);
		
		bAnd = new JButton("And");
		c.gridx = 5;
		c.gridy = 1;
		add(bAnd, c);
	
		// Row 3
		bUp = new JButton("\u2191");
		c.gridx = 0;
		c.gridy = 2;
		add(bUp, c);
		
		bMod = new JButton("Mod");
		c.gridx = 1;
		c.gridy = 2;
		add(bMod, c);
		
		bCE = new JButton("CE");
		c.gridx = 2;
		c.gridy = 2;
		add(bCE, c);
		
		bClr = new JButton("Clear");
		c.gridx = 3;
		c.gridy = 2;
		add(bClr, c);
		
		bDel = new JButton("\u2190");
		c.gridx = 4;
		c.gridy = 2;
		add(bDel, c);
		
		bDiv = new JButton("\u00F7");
		c.gridx = 5;
		c.gridy = 2;
		add(bDiv, c);
		
		// Row 4
		bA = new JButton("A");
		c.gridx = 0;
		c.gridy = 3;
		add(bA, c);
		
		bB = new JButton("B");
		c.gridx = 1;
		c.gridy = 3;
		add(bB, c);
		
		b7 = new JButton("7");
		c.gridx = 2;
		c.gridy = 3;
		add(b7, c);
		
		b8 = new JButton("8");
		c.gridx = 3;
		c.gridy = 3;
		add(b8, c);
		
		b9 = new JButton("9");
		c.gridx = 4;
		c.gridy = 3;
		add(b9, c);
		
		bMul = new JButton("\u00D7");
		c.gridx = 5;
		c.gridy = 3;
		add(bMul, c);
		
		// Row 5
		bC = new JButton("C");
		c.gridx = 0;
		c.gridy = 4;
		add(bC, c);
		
		bD = new JButton("D");
		c.gridx = 1;
		c.gridy = 4;
		add(bD, c);
		
		b4 = new JButton("4");
		c.gridx = 2;
		c.gridy = 4;
		add(b4, c);
		
		b5 = new JButton("5");
		c.gridx = 3;
		c.gridy = 4;
		add(b5, c);
		
		b6 = new JButton("6");
		c.gridx = 4;
		c.gridy = 4;
		add(b6, c);
		
		bSub = new JButton("-");
		c.gridx = 5;
		c.gridy = 4;
		add(bSub, c);
		
		
		// Row 6
		bE = new JButton("E");
		c.gridx = 0;
		c.gridy = 5;
		add(bE, c);
		
		bF = new JButton("F");
		c.gridx = 1;
		c.gridy = 5;
		add(bF, c);
		
		b1 = new JButton("1");
		c.gridx = 2;
		c.gridy = 5;
		add(b1, c);
		
		b2 = new JButton("2");
		c.gridx = 3;
		c.gridy = 5;
		add(b2, c);
		
		b3 = new JButton("3");
		c.gridx = 4;
		c.gridy = 5;
		add(b3, c);
		
		bAdd = new JButton("+");
		c.gridx = 5;
		c.gridy = 5;
		add(bAdd, c);
		
		// Row 7
		bOParen = new JButton("(");
		c.gridx = 0;
		c.gridy = 6;
		add(bOParen, c);
		
		bCParen = new JButton(")");
		c.gridx = 1;
		c.gridy = 6;
		add(bCParen, c);
		
		bPlusMinus = new JButton("\u00B1");
		c.gridx = 2;
		c.gridy = 6;
		add(bPlusMinus, c);
		
		b0 = new JButton("0");
		c.gridx = 3;
		c.gridy = 6;
		add(b0, c);
		
		bDot = new JButton(".");
		c.gridx = 4;
		c.gridy = 6;
		add(bDot, c);
		
		bEq = new JButton("=");
		c.gridx = 5;
		c.gridy = 6;
		add(bEq, c);
		
		bDot.setEnabled(false);
		
	}
	
	public final JButton getBA() {return bA;}
	public final String getBAName() {return bA.getText();}
	
	public final JButton getBB() {return bB;}
	public final String getBBName() {return bB.getText();}
	
	public final JButton getBC() {return bC;}
	public final String getBCName() {return bC.getText();}
	
	public final JButton getBD() {return bD;}
	public final String getBDName() {return bD.getText();}
	
	public final JButton getBE() {return bE;}
	public final String getBEName() {return bE.getText();}
	
	public final JButton getBF() {return bF;}
	public final String getBFName() {return bF.getText();}
	
	public final JButton getB0() {return b0;}
	public final String getB0Name() {return b0.getText();}
	
	public final JButton getB1() {return b1;}
	public final String getB1Name() {return b1.getText();}
	
	public final JButton getB2() {return b2;}
	public final String getB2Name() {return b2.getText();}
	
	public final JButton getB3() {return b3;}
	public final String getB3Name() {return b3.getText();}
	
	public final JButton getB4() {return b4;}
	public final String getB4Name() {return b4.getText();}
	
	public final JButton getB5() {return b5;}
	public final String getB5Name() {return b5.getText();}
	
	public final JButton getB6() {return b6;}
	public final String getB6Name() {return b6.getText();}
	
	public final JButton getB7() {return b7;}
	public final String getB7Name() {return b7.getText();}
	
	public final JButton getB8() {return b8;}
	public final String getB8Name() {return b8.getText();}
	
	public final JButton getB9() {return b9;}
	public final String getB9Name() {return b9.getText();}
	
	public final JButton getBAdd() {return bAdd;}
	public final String getBAddName() {return bAdd.getText();}
	
	public final JButton getBSub() {return bSub;}
	public final String getBSubName() {return bSub.getText();}
	
	public final JButton getBMul() {return bMul;}
	public final String getBMulName() {return bMul.getText();}
	
	public final JButton getBDiv() {return bDiv;}
	public final String getBDivName() {return bDiv.getText();}
	
	public final JButton getBMod() {return bMod;}
	public final String getBModName() {return bMod.getText();}
	
	public final JButton getBEq() {return bEq;}
	public final String getBEqName() {return bEq.getText();}
	
	public final JButton getBDel() {return bDel;}
	public final String getBDelName() {return bDel.getText();}
	
	public final JButton getBClr() {return bClr;}
	public final String getBClrName() {return bClr.getText();}
	
	public final JButton getBCE() {return bCE;}
	public final String getBCEName() {return bCE.getText();}
	
	public final JButton getBWORD() {return bWORD;}
	public final String getBWORDName() {return bWORD.getText();}
	
	public final JButton getBPlusMinus() {return bPlusMinus;}
	public final String getBPlusMinusName() {return bPlusMinus.getText();}
	
	public final JButton getBPower() {return bUp;}
	public final String getBPowerName() {return bUp.getText();}
	
	public final JButton getBOParen() {return bOParen;}
	public final String getBOParenName() {return bOParen.getText();}
	
	public final JButton getBCParen() {return bCParen;}
	public final String getBCParenName() {return bCParen.getText();}
	
	
}
