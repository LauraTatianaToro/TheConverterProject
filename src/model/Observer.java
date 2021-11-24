package model;

public interface Observer {

	/*
	 * The observers in the Observer design pattern get notified when ValueToConvert changes. The feetConversion and mConversion 
	 * boxes inherit from this class.
	 * 
	 * This can also act as the interface in the command pattern. This class gets notified when the command
	 * classes children are told to execute.
	 * 
	 */
	
	//defined in each box (cm and m)
	void update(double cm);
	
	//command
	void convert();

}
