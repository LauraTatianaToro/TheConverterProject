package controller;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.*;

/**
 * The Controller comprises a class that retrieves each value specified by the user in the
 * CentimetersConversionArea JTextArea and sets the new state of ValueToConvert with it.
 */
public class StateChanger {

	//create feetarea and meterarea, and ValueToConvert object
	//gettext from cm Jtextfield and update ValueToConvert
	//create two new convert measurements, and an invoker
	//invoker.execute, then get the output and set the output
	//when user selects menu, cm = gettext
	
	String cm;
	int intCm;
	ValueToConvert valueToConvert = new ValueToConvert();
	static FeetConversionArea feetConversion = new FeetConversionArea();
	static MeterConversionArea meterConversion = new MeterConversionArea();
	
	ConvertMeasurement convertFMeasurement = new ConvertMeasurement(feetConversion);
	ConvertMeasurement convertMMeasurement = new ConvertMeasurement(meterConversion);

	Invoker invoker;
	
		
	public StateChanger(String cm, JTextArea feetArea, JTextArea meterArea) {
		this.cm = cm;
		if (isInputCorrect(cm) == true) {
			intCm =  Integer.parseInt(cm);
			System.out.println(cm);

		} else {
			System.out.println("not an int");
			return;
		}
		
		valueToConvert.add(feetConversion);
		valueToConvert.add(meterConversion);
		valueToConvert.setCm(intCm);
		
		invoker = new Invoker(convertFMeasurement);
		invoker.invoke();
		
		invoker = new Invoker(convertMMeasurement);
		invoker.invoke();
		
		//convert double back to String
		String stringFeet = String.valueOf(feetConversion.getFeet());
		System.out.println("converted back to double " + stringFeet);
		
		String stringMeter = String.valueOf(meterConversion.getMeters());
		
		feetArea.setText(stringFeet +  " ft");
		meterArea.setText(stringMeter + " m");
		
	}
	
	
	

	/*
	 * A method to check whether the input is a valid integer.
	 */
	public boolean isInputCorrect(String cm) {
				
		try {
			Integer.parseInt(cm);
			
		} catch (Exception e) {
			return false;
		}
		
		return true;

	}
	
}
