package model;

/*
 * This is the command interface for the Command Design pattern. It sends an execute to all the commands ( converting).
 * A child of this class would be the "convert" command class.
 */
public interface Command {

	public void execute();

}
