package lab7_abstractfactory;

public class IphonePlusFactory implements IphoneFactory{

	@Override
	public Iphone6 createIphone6() {
		
		return new Iphone6Plus();
	}

	@Override
	public Iphone7 createIphone7() {
		
		return new Iphone7Plus();
	}

	@Override
	public Iphone8 createIphone8() {
	
		return new Iphone8Plus();
	}

}
