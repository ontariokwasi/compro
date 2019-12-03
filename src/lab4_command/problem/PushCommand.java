package lab4_command.problem;

public class PushCommand implements Command {
	private VStack stack; // the stack object
	private String pushstring; // the string to push on the stack

	PushCommand(VStack stack, String pushstring) {
		this.stack = stack;
		this.pushstring = pushstring;
	}

	@Override
	public void execute() {
		if (!pushstring.equals(""))
			stack.push(pushstring);
	}

}
