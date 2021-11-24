package model;

import java.util.ArrayList;


/**
 *  ValueToConvert encapsulates the values in
 *  centimeters that are specified by the user in the CentimetersConversionArea JTextArea.
 *  When the ValueToConvert‘state changes, ValueToConvert notifies FeetConversionArea and
 *  MeterConversionArea.
 *  
 *  this is the SUBJECT in the observer design pattern.
 *  
 *  This will get updated when the controller updates it.
 */	

public class ValueToConvert {
	
	private ArrayList<Observer> observers;
	double cm;


	public ValueToConvert() {

		observers = new ArrayList<Observer>();

	}

	public void add(Observer newObserver) {
		observers.add(newObserver);
	}
	
	private void notifyObserver() {
		for(Observer observer :observers) {
			observer.update(cm);
		}
	}

	public void setCm(double cm) {
		this.cm = cm;
		System.out.println("notified");
		notifyObserver();
	}
	
}
