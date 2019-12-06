package lab5_state;

public class ThirdGear implements Transmission{

	private Mediator mediator;
	ThirdGear(Mediator mediator){
		this.mediator = mediator;
	}

	@Override
	public Transmission changeSpeed(int speed) {
		setShiftState(getGearNumber()); //update UI
		
		if(speed > 30)
			return (new FourthGear(mediator)).changeSpeed(speed);
		else if(speed < 11)
			return (new SecondGear(mediator)).changeSpeed(speed);
		return this;
	}

	@Override
	public int getGearNumber() {
		return 3;
	}

	@Override
	public void setShiftState(int shiftstate) {
		mediator.updateUI(shiftstate);
		
	}

}
