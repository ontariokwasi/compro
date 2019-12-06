package lab5_state;

public class Mediator {
	private IShift ui;
	Mediator(IShift ui){
		this.ui = ui;
	}
	public void updateUI(int shift) {
		ui.setShiftState(shift);
		System.out.println(shift);
	}
	
}
