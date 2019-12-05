package lab4_command.problem;

import java.util.Stack;

public class CommandManager implements Colleague{
	private Stack<Command> history, undoHistory;
	private BtnStateMediator mediator;
	private Colleague view;

	CommandManager() {
		history = new Stack<Command>();
		undoHistory = new Stack<Command>();
	}

	public void submit(Command cmd) {
		cmd.execute();
		history.push(cmd);
		undoHistory.clear();
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
			cmd.execute();
			history.push(cmd);
		}
	}
	private void checkstate() {
		if(history.empty())
			mediator.forwardstate(view, "pop", false);
	}
	@Override
	public void receivestate(String btnName, boolean state) {
		// TODO Auto-generated method stub
		
	}

}
