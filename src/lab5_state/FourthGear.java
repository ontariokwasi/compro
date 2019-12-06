package lab5_state;

public class FourthGear implements Transmission{

	private Mediator mediator;
	FourthGear(Mediator mediator){
		this.mediator = mediator;
	}

	@Override
	public Transmission changeSpeed(int speed) {
		setShiftState(getGearNumber()); //update UI
		
		if(speed > 55)
			return (new FifthGear(mediator)).changeSpeed(speed);
		else if(speed < 31)
			return (new ThirdGear(mediator)).changeSpeed(speed);
		return this;
	}

	@Override
	public int getGearNumber() {
		return 4;
	}

	@Override
	public void setShiftState(int shiftstate) {
		mediator.updateUI(shiftstate);
		
	}

}
