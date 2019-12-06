package lab5_state;

public class FirstGear implements Transmission{
	private Mediator mediator;
	FirstGear(Mediator mediator){
		this.mediator = mediator;
	}

	@Override
	public Transmission changeSpeed(int speed) {
		setShiftState(getGearNumber()); //update UI
		
		if(speed > 5)
			return (new SecondGear(mediator)).changeSpeed(speed);
		else if(speed < 1)
			return (new ParkedGear(mediator)).changeSpeed(speed);
		return this;
	}

	@Override
	public int getGearNumber() {
		return 1;
	}

	@Override
	public void setShiftState(int shiftstate) {
		mediator.updateUI(shiftstate);
		
	}

}
