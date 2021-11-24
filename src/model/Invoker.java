package model;


/*
 * This causes the execute method to be called in all the commands children.
 */
public class Invoker {
	
	Command command;

	public Invoker(Command newCommand) {
		command = newCommand;
	}

	public void invoke() {
		command.execute();
	}
	
}
