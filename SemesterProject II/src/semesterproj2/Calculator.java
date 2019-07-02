package semesterproj2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.util.Stack;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener, SwingConstants{
	
	private ButtonPanel buttonPanel;
	private CenterPanel centerPanel;
	private TopPanel topPanel;
	
	int num, ans;
	int calculation, numType = 1;
	
	public Calculator() {
		
		buttonPanel = new ButtonPanel();
		centerPanel = new CenterPanel();
		topPanel = new TopPanel();
		
		add(buttonPanel, BorderLayout.SOUTH);
		add(centerPanel, BorderLayout.CENTER);
		add(topPanel, BorderLayout.NORTH);
		
		buttonPanel.getBA().addActionListener(this);
		buttonPanel.getBB().addActionListener(this);
		buttonPanel.getBC().addActionListener(this);
		buttonPanel.getBD().addActionListener(this);
		buttonPanel.getBE().addActionListener(this);
		buttonPanel.getBF().addActionListener(this);
		buttonPanel.getB0().addActionListener(this);
		buttonPanel.getB1().addActionListener(this);
		buttonPanel.getB2().addActionListener(this);
		buttonPanel.getB3().addActionListener(this);
		buttonPanel.getB4().addActionListener(this);
		buttonPanel.getB5().addActionListener(this);
		buttonPanel.getB6().addActionListener(this);
		buttonPanel.getB7().addActionListener(this);
		buttonPanel.getB8().addActionListener(this);
		buttonPanel.getB9().addActionListener(this);
		buttonPanel.getBDel().addActionListener(this);
		buttonPanel.getBClr().addActionListener(this);
		buttonPanel.getBCE().addActionListener(this);
		buttonPanel.getBAdd().addActionListener(this);
		buttonPanel.getBSub().addActionListener(this);
		buttonPanel.getBMul().addActionListener(this);
		buttonPanel.getBDiv().addActionListener(this);
		buttonPanel.getBMod().addActionListener(this);
		buttonPanel.getBEq().addActionListener(this);
		buttonPanel.getBPlusMinus().addActionListener(this);
		buttonPanel.getBWORD().addActionListener(this);
		buttonPanel.getBPower().addActionListener(this);
		buttonPanel.getBOParen().addActionListener(this);
		buttonPanel.getBCParen().addActionListener(this);
		
		centerPanel.getBHex().addActionListener(this);
		centerPanel.getBDec().addActionListener(this);
		centerPanel.getBOct().addActionListener(this);
		centerPanel.getBBin().addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
	    // A button  
		if (( (JButton) e.getSource()).getText() == buttonPanel.getBAName()) {
	          topPanel.setText(topPanel.getText() + buttonPanel.getBAName());
	          getNumType();
	       } 
	    // B button  
		if (( (JButton) e.getSource()).getText() == buttonPanel.getBBName()) {
	          topPanel.setText(topPanel.getText() + buttonPanel.getBBName());
	          getNumType();
	       } 
	    // C button  
		if (( (JButton) e.getSource()).getText() == buttonPanel.getBCName()) {
	          topPanel.setText(topPanel.getText() + buttonPanel.getBCName());
	          getNumType();
	       } 
	    // D button  
		if (( (JButton) e.getSource()).getText() == buttonPanel.getBDName()) {
	          topPanel.setText(topPanel.getText() + buttonPanel.getBDName());
	          getNumType();
	       } 
	    // E button  
		if (( (JButton) e.getSource()).getText() == buttonPanel.getBEName()) {
	          topPanel.setText(topPanel.getText() + buttonPanel.getBEName());
	          getNumType();
	       } 
	    // F button  
		if (( (JButton) e.getSource()).getText() == buttonPanel.getBFName()) {
	          topPanel.setText(topPanel.getText() + buttonPanel.getBFName());
	          getNumType();
	       } 
		// 0 button  
		if (( (JButton) e.getSource()).getText() == buttonPanel.getB0Name()) {
	        	topPanel.setText(topPanel.getText() + buttonPanel.getB0Name());
	        	getNumType();
	       } 
	      // 1 button
	      else if (( (JButton) e.getSource()).getText() == buttonPanel.getB1Name()) {
	          topPanel.setText(topPanel.getText() + buttonPanel.getB1Name()); 
	          getNumType();
	       }
	      // 2 button
	      else if (( (JButton) e.getSource()).getText() == buttonPanel.getB2Name()) {
	          topPanel.setText(topPanel.getText() + buttonPanel.getB2Name());
	          getNumType();
	       }
	      // 3 button
	      else if (( (JButton) e.getSource()).getText() == buttonPanel.getB3Name()) {
	          topPanel.setText(topPanel.getText() + buttonPanel.getB3Name());
	          getNumType();
	       }
	      // 4 button
	      else if (( (JButton) e.getSource()).getText() == buttonPanel.getB4Name()) {
	          topPanel.setText(topPanel.getText() + buttonPanel.getB4Name());
	          getNumType();
	       }
	      // 5 button
	      else if (( (JButton) e.getSource()).getText() == buttonPanel.getB5Name()) {
	          topPanel.setText(topPanel.getText() + buttonPanel.getB5Name());
	    	  getNumType();
	       }
	      // 6 button
	      else if (( (JButton) e.getSource()).getText() == buttonPanel.getB6Name()) {
	          topPanel.setText(topPanel.getText() + buttonPanel.getB6Name());
	          getNumType();
	       }
	      // 7 button
	      else if (( (JButton) e.getSource()).getText() == buttonPanel.getB7Name()) {
	          topPanel.setText(topPanel.getText() + buttonPanel.getB7Name());
	          getNumType();
	       }
	      // 8 button
	      else if (( (JButton) e.getSource()).getText() == buttonPanel.getB8Name()) {
	          topPanel.setText(topPanel.getText() + buttonPanel.getB8Name());
	          getNumType();
	       }
	      // 9 button
	      else if (( (JButton) e.getSource()).getText() == buttonPanel.getB9Name()) {
	          topPanel.setText(topPanel.getText() + buttonPanel.getB9Name());
	          getNumType();
	      }	 
	      // PlusMinus button
	      else if (( (JButton) e.getSource()).getText() == buttonPanel.getBPlusMinusName()) {     
	    	  int getNum = Integer.parseInt(topPanel.getText());
	    	  
	    	  int newNum = getNum *= -1;
	    	  
	    	  topPanel.setText(Integer.toString(newNum));
	      }	
	      // Delete button
	      else if(( (JButton) e.getSource()).getText() == buttonPanel.getBDelName()) {
	    	  int length = topPanel.getText().length();
	    	  int number = topPanel.getText().length() - 1;
	    	  String store;
	    	  
	    	  if(length > 0) {
	    		  StringBuilder back = new StringBuilder(topPanel.getText());
	    		  back.deleteCharAt(number);
	    		  store = back.toString();
	    		  topPanel.setText(store);
		          getNumType();
	    	  }
	      }   
	      // Clear button
	      else if(( (JButton) e.getSource()).getText() == buttonPanel.getBClrName()){
	    	  topPanel.setText("");
	    	  topPanel.setOpLabelText(" ");
	    	  centerPanel.hexVal.setText("0");
	    	  centerPanel.decVal.setText("0");
	    	  centerPanel.octVal.setText("0");
	    	  centerPanel.binVal.setText("0");
	      }
	      // CE button
	      else if(( (JButton) e.getSource()).getText() == buttonPanel.getBCEName()){
	    	  topPanel.setText("");
	    	  centerPanel.hexVal.setText("0");
	    	  centerPanel.decVal.setText("0");
	    	  centerPanel.octVal.setText("0");
	    	  centerPanel.binVal.setText("0");
	      }
	      // Up arrow button
	      else if(( (JButton) e.getSource()).getText() == buttonPanel.getBPowerName()){
	    	  if(buttonPanel.bLsh.getText() == "Lsh" && buttonPanel.bRsh.getText() == "Rsh") {
	    		  buttonPanel.bLsh.setText("RoL");
	    		  buttonPanel.bRsh.setText("RoR");
	    	  }
	    	  else {
	    		  buttonPanel.bLsh.setText("Lsh");
	    		  buttonPanel.bRsh.setText("Rsh");
	    	  }
	      }
	      // Addition button
	      else if(( (JButton) e.getSource()).getText() == buttonPanel.getBAddName()){
	    	  num = Integer.parseInt(topPanel.getText());
	    	  topPanel.setText("");
	    	  topPanel.setOpLabelText(topPanel.getOpLabelText()+ num + " + ");
	      }
	      // Subtraction button
	      else if(( (JButton) e.getSource()).getText() == buttonPanel.getBSubName()){
	    	  num = Integer.parseInt(topPanel.getText());
	    	  topPanel.setText("");
	    	  topPanel.setOpLabelText(topPanel.getOpLabelText() + num + " - ");
	      }
	      // Multiplication button
	      else if(( (JButton) e.getSource()).getText() == buttonPanel.getBMulName()){
	    	  num = Integer.parseInt(topPanel.getText());
	    	  topPanel.setText("");
	    	  topPanel.setOpLabelText(topPanel.getOpLabelText() + num + " * ");
	      }
	      // Division button
	      else if(( (JButton) e.getSource()).getText() == buttonPanel.getBDivName()){
	    	  num = Integer.parseInt(topPanel.getText());
	    	  topPanel.setText("");
	    	  topPanel.setOpLabelText(topPanel.getOpLabelText() + num + " / ");
	      }
	      // Mod button
	      else if(( (JButton) e.getSource()).getText() == buttonPanel.getBModName()){
	    	  num = Integer.parseInt(topPanel.getText());
	    	  topPanel.setText("");
	    	  topPanel.setOpLabelText(topPanel.getOpLabelText() + num + " % ");
	      }
	      // Equal button
	      else if(( (JButton) e.getSource()).getText() == buttonPanel.getBEqName()){
	    	  
	    	 if(topPanel.getOpLabelText().endsWith(" / ") && topPanel.getText().equals("0")) 
	    	 {
	    		 topPanel.setOpLabelText(" ");
	    		 topPanel.setText("Cannot divide by zero");
	    	 }
	    	 else if(topPanel.getOpLabelText().endsWith(" % ") && topPanel.getText().equals("0")) 
	    	 {
	    		 topPanel.setOpLabelText(" ");
	    		 topPanel.setText("Result is undefined");
	    	 }
	    	 else {
		    	 topPanel.setOpLabelText(topPanel.getOpLabelText() + topPanel.getText());
		    	 topPanel.setText(Integer.toString(evaluate(topPanel.getOpLabelText())));
		    	 getNumType();
		    	 topPanel.setOpLabelText(" ");
	    	 }
	    	  
	    	  

	      }
	      // Open paren button
	      else if(( (JButton) e.getSource()).getText() == buttonPanel.getBOParenName()){
	    	  if(topPanel.getText() == "")
	    		  topPanel.setText("(");
	    	  else
	    		  num = Integer.parseInt(topPanel.getText());
	    	  
	    	  topPanel.setText("");
	    	  topPanel.setOpLabelText(topPanel.getOpLabelText() + num + " ( ");
	      }
	      // Close paren button
	      else if(( (JButton) e.getSource()).getText() == buttonPanel.getBCParenName()){
	    	  num = Integer.parseInt(topPanel.getText());
	    	  topPanel.setText("");
	    	  topPanel.setOpLabelText(topPanel.getOpLabelText() + num + " ) ");
	      }
	      // WORD button
	      else if(( (JButton) e.getSource()).getText() == buttonPanel.getBWORDName()){
	    	  
	    	  if(buttonPanel.bWORD.getText() == "WORD")
	    		  buttonPanel.bWORD.setText("QWORD");
	    	  else if(buttonPanel.bWORD.getText() == "QWORD")
	    		  buttonPanel.bWORD.setText("DWORD");
	    	  else if(buttonPanel.bWORD.getText() == "DWORD")
	    		  buttonPanel.bWORD.setText("BYTE");
	    	  else
	    		  buttonPanel.bWORD.setText("WORD");
	      }
	      // HEX button
	      else if(( (JButton) e.getSource()).getText() == centerPanel.getBHexName()){
	    	  
	    	  if(numType == 2) {
	    		  topPanel.setText(dec2Hex(Integer.parseInt(topPanel.getText())));
	    	  }
	    	  else if(numType == 3) {
	    		  topPanel.setText(dec2Hex(oct2Dec(Integer.parseInt(topPanel.getText()))));
	    	  }
	    	  else if(numType == 4) {
	    		  topPanel.setText(dec2Hex(bin2Dec(topPanel.getText())));
	    	  }
	    	  
	    	  numType = 1;
	    	  
	    	  centerPanel.hexButton.setForeground(Color.BLUE);
	    	  centerPanel.decButton.setForeground(Color.BLACK);
	    	  centerPanel.octButton.setForeground(Color.BLACK);
	    	  centerPanel.binButton.setForeground(Color.BLACK);
	    	  
	    	  buttonPanel.bA.setEnabled(true);
	    	  buttonPanel.bB.setEnabled(true);
	    	  buttonPanel.bC.setEnabled(true);
	    	  buttonPanel.bD.setEnabled(true);
	    	  buttonPanel.bE.setEnabled(true);
	    	  buttonPanel.bF.setEnabled(true);
	    	  buttonPanel.b9.setEnabled(true);
	    	  buttonPanel.b8.setEnabled(true);
	    	  buttonPanel.b7.setEnabled(true);
	    	  buttonPanel.b6.setEnabled(true);
	    	  buttonPanel.b5.setEnabled(true);
	    	  buttonPanel.b4.setEnabled(true);
	    	  buttonPanel.b3.setEnabled(true);
	    	  buttonPanel.b2.setEnabled(true);
	    	  
	      }
	      // DEC button
	      else if(( (JButton) e.getSource()).getText() == centerPanel.getBDecName()){
	    	  
	    	  if(numType == 1) {
	    		  topPanel.setText(Integer.toString(hex2Dec(topPanel.getText())));
	    	  }
	    	  else if(numType == 3) {
	    		  topPanel.setText(Integer.toString(oct2Dec(Integer.parseInt(topPanel.getText()))));
	    	  }
	    	  else if(numType == 4) {
	    		  topPanel.setText(Integer.toString(bin2Dec(topPanel.getText())));
	    	  }
	    	  
	    	  numType = 2;
	    	  
	    	  centerPanel.hexButton.setForeground(Color.BLACK);
	    	  centerPanel.decButton.setForeground(Color.BLUE);
	    	  centerPanel.octButton.setForeground(Color.BLACK);
	    	  centerPanel.binButton.setForeground(Color.BLACK);
	    	  
	    	  buttonPanel.bA.setEnabled(false);
	    	  buttonPanel.bB.setEnabled(false);
	    	  buttonPanel.bC.setEnabled(false);
	    	  buttonPanel.bD.setEnabled(false);
	    	  buttonPanel.bE.setEnabled(false);
	    	  buttonPanel.bF.setEnabled(false);
	    	  
	    	  buttonPanel.b9.setEnabled(true);
	    	  buttonPanel.b8.setEnabled(true);
	    	  buttonPanel.b7.setEnabled(true);
	    	  buttonPanel.b6.setEnabled(true);
	    	  buttonPanel.b5.setEnabled(true);
	    	  buttonPanel.b4.setEnabled(true);
	    	  buttonPanel.b3.setEnabled(true);
	    	  buttonPanel.b2.setEnabled(true);
	    	 
	      }
	      // OCT button
	      else if(( (JButton) e.getSource()).getText() == centerPanel.getBOctName()){	    	  
	    	  
	    	  if(numType == 1) {
	    		  topPanel.setText(Integer.toOctalString(hex2Dec(topPanel.getText())));
	    	  }
	    	  else if(numType == 2) {
	    		  topPanel.setText(Integer.toOctalString(Integer.parseInt(topPanel.getText())));
	    	  }
	    	  else if(numType == 4) {
	    		  topPanel.setText(Integer.toOctalString(bin2Dec(topPanel.getText())));
	    	  }
	    	  
	    	  numType = 3;
	    	  
	    	  centerPanel.hexButton.setForeground(Color.BLACK);
	    	  centerPanel.decButton.setForeground(Color.BLACK);
	    	  centerPanel.octButton.setForeground(Color.BLUE);
	    	  centerPanel.binButton.setForeground(Color.BLACK);
	    	  
	    	  buttonPanel.bA.setEnabled(false);
	    	  buttonPanel.bB.setEnabled(false);
	    	  buttonPanel.bC.setEnabled(false);
	    	  buttonPanel.bD.setEnabled(false);
	    	  buttonPanel.bE.setEnabled(false);
	    	  buttonPanel.bF.setEnabled(false);
	    	  buttonPanel.b9.setEnabled(false);
	    	  buttonPanel.b8.setEnabled(false);

	    	  buttonPanel.b7.setEnabled(true);
	    	  buttonPanel.b6.setEnabled(true);
	    	  buttonPanel.b5.setEnabled(true);
	    	  buttonPanel.b4.setEnabled(true);
	    	  buttonPanel.b3.setEnabled(true);
	    	  buttonPanel.b2.setEnabled(true);
	      }
	      // BIN button
	      else if(( (JButton) e.getSource()).getText() == centerPanel.getBBinName()){	    	  
	    	  
	    	  if(numType == 1) {
	    		  topPanel.setText(hex2Bin(topPanel.getText()));
	    	  }
	    	  else if(numType == 2) {
	    		  topPanel.setText(Integer.toBinaryString(Integer.parseInt(topPanel.getText())));
	    	  }
	    	  else if(numType == 3) {
	    		  topPanel.setText(dec2Bin(oct2Dec(Integer.parseInt(topPanel.getText()))));
	    	  }
	    	  
	    	  numType = 4;
	    	  
	    	  centerPanel.hexButton.setForeground(Color.BLACK);
	    	  centerPanel.decButton.setForeground(Color.BLACK);
	    	  centerPanel.octButton.setForeground(Color.BLACK);
	    	  centerPanel.binButton.setForeground(Color.BLUE);
	    	  
	    	  buttonPanel.bA.setEnabled(false);
	    	  buttonPanel.bB.setEnabled(false);
	    	  buttonPanel.bC.setEnabled(false);
	    	  buttonPanel.bD.setEnabled(false);
	    	  buttonPanel.bE.setEnabled(false);
	    	  buttonPanel.bF.setEnabled(false);
	    	  buttonPanel.b9.setEnabled(false);
	    	  buttonPanel.b8.setEnabled(false);
	    	  buttonPanel.b7.setEnabled(false);
	    	  buttonPanel.b6.setEnabled(false);
	    	  buttonPanel.b5.setEnabled(false);
	    	  buttonPanel.b4.setEnabled(false);
	    	  buttonPanel.b3.setEnabled(false);
	    	  buttonPanel.b2.setEnabled(false);
	      }
		
	}
	
	public void getNumType() {
		switch(numType) {
		
		case 1: // When the calculator is in hex mode
	          centerPanel.hexVal.setText(topPanel.getText());
	          centerPanel.decVal.setText(Integer.toString(hex2Dec(topPanel.getText())));
	          centerPanel.octVal.setText(Integer.toOctalString(hex2Dec(topPanel.getText())));
	          centerPanel.binVal.setText(hex2Bin(topPanel.getText()));
	          break;
		case 2: // When in dec mode
	          centerPanel.hexVal.setText(dec2Hex(Integer.parseInt(topPanel.getText())));
	          centerPanel.decVal.setText(topPanel.getText());
	          centerPanel.octVal.setText(Integer.toOctalString(Integer.parseInt(topPanel.getText())));
	          centerPanel.binVal.setText(Integer.toBinaryString(Integer.parseInt(topPanel.getText())));
			break;
		case 3: // When in oct mode
	          centerPanel.hexVal.setText(dec2Hex(oct2Dec(Integer.parseInt(topPanel.getText()))));
	          centerPanel.decVal.setText(Integer.toString(oct2Dec(Integer.parseInt(topPanel.getText()))));
	          centerPanel.octVal.setText(topPanel.getText());
	          centerPanel.binVal.setText(dec2Bin(oct2Dec(Integer.parseInt(topPanel.getText()))));
			break;
		case 4: // When in bin mode
	          centerPanel.hexVal.setText(dec2Hex(bin2Dec(topPanel.getText())));
	          centerPanel.decVal.setText(Integer.toString(bin2Dec(topPanel.getText())));
	          centerPanel.octVal.setText(Integer.toOctalString(bin2Dec(topPanel.getText())));
	          centerPanel.binVal.setText(topPanel.getText());
			break;
	          
	          default:
		          centerPanel.hexVal.setText(dec2Hex(Integer.parseInt(topPanel.getText())));
		          centerPanel.decVal.setText(topPanel.getText());
		          centerPanel.octVal.setText(Integer.toOctalString(Integer.parseInt(topPanel.getText())));
		          centerPanel.binVal.setText(Integer.toBinaryString(Integer.parseInt(topPanel.getText())));
		          break;
		
		}
	}
	
	// Method for performing PEMDAS
    public static int evaluate(String expression) { 
        char[] tokens = expression.toCharArray(); 
  
         // Stack for numbers: 'values' 
        Stack<Integer> values = new Stack<Integer>(); 
  
        // Stack for Operators: 'ops' 
        Stack<Character> ops = new Stack<Character>(); 
  
        for (int i = 0; i < tokens.length; i++) 
        { 
             // Current token is a whitespace, skip it 
            if (tokens[i] == ' ') 
                continue; 
  
            // Current token is a number, push it to stack for numbers 
            if (tokens[i] >= '0' && tokens[i] <= '9') 
            { 
                StringBuffer sbuf = new StringBuffer(); 
                // There may be more than one digits in number 
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') 
                    sbuf.append(tokens[i++]); 
                values.push(Integer.parseInt(sbuf.toString())); 
            } 
  
            // Current token is an opening brace, push it to 'ops' 
            else if (tokens[i] == '(') 
                ops.push(tokens[i]); 
  
            // Closing brace encountered, solve entire brace 
            else if (tokens[i] == ')') 
            { 
                while (ops.peek() != '(') 
                  values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
                ops.pop(); 
            } 
  
            // Current token is an operator. 
            else if (tokens[i] == '+' || tokens[i] == '-' || 
                     tokens[i] == '*' || tokens[i] == '/') 
            { 
                // While top of 'ops' has same or greater precedence to current 
                // token, which is an operator. Apply operator on top of 'ops' 
                // to top two elements in values stack 
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) 
                  values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
  
                // Push current token to 'ops'. 
                ops.push(tokens[i]); 
            } 
        } 
  
        // Entire expression has been parsed at this point, apply remaining 
        // ops to remaining values 
        while (!ops.empty()) 
            values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
  
        // Top of 'values' contains result, return it 
        return values.pop(); 
    } 
  
    // Returns true if 'op2' has higher or same precedence as 'op1', 
    // otherwise returns false. 
    public static boolean hasPrecedence(char op1, char op2) 
    { 
        if (op2 == '(' || op2 == ')') 
            return false; 
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) 
            return false; 
        else
            return true; 
    } 
  
    // A utility method to apply an operator 'op' on operands 'a'  
    // and 'b'. Return the result. 
    public static int applyOp(char op, int b, int a) 
    { 
        switch (op) 
        { 
        case '+': 
            return a + b; 
        case '-': 
            return a - b; 
        case '*': 
            return a * b; 
        case '/': 
            if (b == 0) 
                throw new
                UnsupportedOperationException("Cannot divide by zero"); 
            return a / b; 
        } 
        return 0; 
    } 
	
	// Method for performing math operations
	public void arithmetic_op() {
		switch(calculation) {
		
		case 1:	// Addition
			ans = num + Integer.parseInt(topPanel.getText());
			topPanel.setText(Integer.toString(ans));
			break;
			
		case 2:	// Subtraction
			ans = num - Integer.parseInt(topPanel.getText());
			topPanel.setText(Integer.toString(ans));
			break;
			
		case 3:	// Multiplication
			ans = num * Integer.parseInt(topPanel.getText());
			topPanel.setText(Integer.toString(ans));
			break;
			
		case 4:	// Division
			if(Integer.parseInt(topPanel.getText()) == 0) {
				numType = 6;
				topPanel.setText("Cannot divide by zero");
				topPanel.setOpLabelText(" ");
				centerPanel.hexVal.setText("");
				centerPanel.decVal.setText("");
				centerPanel.octVal.setText("");
				centerPanel.binVal.setText("");
			}
			else {
				ans = num / Integer.parseInt(topPanel.getText());
				topPanel.setText(Integer.toString(ans));
			}
			break;
			
		case 5:	// Modulo
			if(Integer.parseInt(topPanel.getText()) == 0) {
				numType = 6;
				topPanel.setText("Result is undefined");
				topPanel.setOpLabelText(" ");
				centerPanel.hexVal.setText("");
				centerPanel.decVal.setText("");
				centerPanel.octVal.setText("");
				centerPanel.binVal.setText("");
			}
			else {
				ans = num % Integer.parseInt(topPanel.getText());
				topPanel.setText(Integer.toString(ans));
			}
			break;
			
		
		
		}
	}
	
	// Create string for dec to hex
	public static String dec2Hex(int value) {
		String result = "";
		return dec2Hex(value, result);
	}
	
	// Method to make dec to hex
	public static String dec2Hex(int value, String result) {
		int remainder = value % 16;
		String remain = remainder >= 10 ? String.valueOf((char)('A' + remainder % 10)) : String.valueOf(remainder);
		
		if(value / 16 == 0)
			return remain + result;
		else
			return dec2Hex(value / 16, remain + result);
	}
	
	// Method to convert hex to dec
	public static int hex2Dec(String value) {
		String digits = "0123456789ABCDEF";
		
		value = value.toUpperCase();
		
		int val = 0;
		
		for(int i = 0; i < value.length(); i++)
		{
			char c = value.charAt(i);
			int d = digits.indexOf(c);
			val = 16 * val + d;
		}
		
		return val;
	}
	
	// Method to convert hex to bin
	public static String hex2Bin(String s) {
		return new BigInteger(s, 16).toString(2);
	}
	
	// Method to convert oct to dec
	public static int oct2Dec(int octal) {
		int dec = 0, i = 0;
		
		while(octal != 0) {
			dec += (octal % 10) * Math.pow(8, i);
			++i;
			octal /= 10;
		}
		
		return dec;
	}
	
	// Method to convert dec to bin
	public static String dec2Bin(int value) {
		
		String result = "";
		return dec2Bin(value, result);
	}
	
	// Recursive method
	public static String dec2Bin(int value, String result) {
		
		if(value / 2 == 0)
			return (value % 2) + result;
		else 
			return dec2Bin(value / 2, (value % 2) + result);
	}
	
	// Method to convert bin to dec
	public static int bin2Dec(String binary) {
		
		int index = 0;
		int n = binary.length() - 1;
		int result = 0;
		return bin2Dec(binary, index, n, result);
	}
	
	// Recursive method
	public static int bin2Dec(String binary, int index, int n, int result) {
		
		result += (Integer.parseInt(binary.charAt(index) + "") * (int)Math.pow(2, n));
		
		if(n == 0)
			return result;
		else
			return bin2Dec(binary, index + 1, n - 1, result);
	}


}