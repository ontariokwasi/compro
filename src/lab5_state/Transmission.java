package lab5_state;

public interface Transmission extends IShift{
	Transmission changeSpeed(int speed);
	int getGearNumber();

}
