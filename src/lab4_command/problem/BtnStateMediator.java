package lab4_command.problem;

public class BtnStateMediator {
	void forwardstate(Colleague col, String btnName, boolean state) {
		col.receivestate(btnName, state);
	}
}
