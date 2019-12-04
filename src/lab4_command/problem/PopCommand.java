package lab4_command.problem;

public class PopCommand implements Command {
	private VStack stack; // the stack object
	private String pushstring; // the string to push on the stack

	PopCommand(VStack stack) {
		this.stack = stack;
	}

	@Override
	public void execute() {
		pushstring = (String) stack.pop();
	}

	@Override
	public void undo() {
		stack.push(pushstring);
	}
	
}
