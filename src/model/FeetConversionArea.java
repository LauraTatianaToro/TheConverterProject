package model;

public class FeetConversionArea implements Observer {

	private double cm;
	private double feet;
	
	public FeetConversionArea()  {
		
	}


	@Override
	public void update(double cm) {
		this.cm = cm;
		//System.out.println("Ready to conver to feet!");

		
	}

	@Override
	public void convert() {
		feet = (cm / 30.48);
		//System.out.println("feet is " + feet);

		
	}

	public double getFeet() {
		return feet;
	}

	
	

}
