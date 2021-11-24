package model;

public class ConvertMeasurement implements Command {

	Observer shapeBox;
	
	public ConvertMeasurement(Observer newShapeBox) {
		this.shapeBox = newShapeBox;
	}

	public void execute() {
		shapeBox.convert();
		
	}

}
