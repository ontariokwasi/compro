package homework4.problem6;

public class Computer2 extends Computer implements Cloneable{
	public Computer2(String manufacturer, String processor, int ramSize, double processorSpeed) {
		super(manufacturer, processor, ramSize, processorSpeed);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return (Computer2) super.clone();
	}
}
