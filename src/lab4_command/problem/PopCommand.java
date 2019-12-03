package lab4_command.problem;

public class PopCommand implements Command {
	private VStack stack; // the stack object
	private String pushstring; // the string to push on the stack

	PopCommand(VStack stack, String pushstring) {
		this.stack = stack;
		this.pushstring = pushstring;
	}

	@Override
	public void execute() {
		stack.pop();
	}
	
}
