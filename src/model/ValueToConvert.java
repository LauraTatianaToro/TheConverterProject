package model;

import javax.swing.JTextField;

public class ValueToConvert {

	/**
	 *  ValueToConvert encapsulates the values in
	 *  centimeters that are specified by the user in the CentimetersConversionArea JTextArea.
	 *  When the ValueToConvert‘state changes, ValueToConvert notifies FeetConversionArea and
	 *  MeterConversionArea.
	 *  
	 *  this is the SUBJECT in the observer design pattern.
	 */
	public ValueToConvert() {
		// TODO Auto-generated constructor stub
	}

	
	/*
	 * A method to check whether the input is a valid integer.
	 */
	public boolean isInputCorrect(JTextField cmInput) {
		int input;
		
		try {
			Integer.parseInt(cmInput.getText());
			input = Integer.parseInt(cmInput.getText());
		} catch (Exception e) {
			return false;
		}
		
		return true;

	}
	
}
