package model;

public class MeterConversionArea implements Observer{

	private double cm;
	private double meters;

	public MeterConversionArea() {
	
	}



	@Override
	public void update(double cm) {
		this.cm = cm;
		
	}

	@Override
	public void convert() {
		meters = cm / 100;
		//System.out.println(meters);
		
	}

	public double getMeters() {
		return meters;
	}



}
