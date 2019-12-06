package lab5_state;

public class SecondGear implements Transmission{

	private Mediator mediator;
	SecondGear(Mediator mediator){
		this.mediator = mediator;
	}

	@Override
	public Transmission changeSpeed(int speed) {
		setShiftState(getGearNumber()); //update UI
		
		if(speed > 10)
			return (new ThirdGear(mediator)).changeSpeed(speed);
		else if(speed < 6)
			return (new FirstGear(mediator)).changeSpeed(speed);
		return this;
	}

	@Override
	public int getGearNumber() {
		return 2;
	}

	@Override
	public void setShiftState(int shiftstate) {
		mediator.updateUI(shiftstate);
		
	}
}
