package lab5_state;

public class ParkedGear implements Transmission{

	private Mediator mediator;
	ParkedGear(Mediator mediator){
		this.mediator = mediator;
	}

	@Override
	public Transmission changeSpeed(int speed) {
		setShiftState(getGearNumber()); //update UI
		
		if(speed > 0)
			return (new FirstGear(mediator)).changeSpeed(speed);
		return this;
	}

	@Override
	public int getGearNumber() {
		return 0;
	}

	@Override
	public void setShiftState(int shiftstate) {
		mediator.updateUI(shiftstate);
		
	}
}
