package lab5_state;

public class FifthGear implements Transmission{

	private Mediator mediator;
	FifthGear(Mediator mediator){
		this.mediator = mediator;
	}

	@Override
	public Transmission changeSpeed(int speed) {
		setShiftState(getGearNumber()); //update UI
		
		if(speed < 56)
			return (new FourthGear(mediator)).changeSpeed(speed);
		return this;
		
	}

	@Override
	public int getGearNumber() {
		return 5;
	}

	@Override
	public void setShiftState(int shiftstate) {
		mediator.updateUI(shiftstate);
		
	}

}
