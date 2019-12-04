package lab4_command.problem;

import java.util.Stack;

public class CommandManager {
	private Stack<Command> history, undoHistory;

	CommandManager() {
		history = new Stack<Command>();
		undoHistory = new Stack<Command>();
	}

	public void submit(Command cmd) {
		cmd.execute();
		history.push(cmd);
	}

	public void undo() {
		if (!history.empty()) {
			Command cmd = history.pop();
			cmd.undo();
			undoHistory.push(cmd);
		}
	}
	
	public void redo() {
		if (!undoHistory.empty()) {
			Command cmd = undoHistory.pop();
			submit(cmd);
		}
	}

}
