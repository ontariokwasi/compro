package lab7_abstractfactory;

public class IphoneSFactory implements IphoneFactory{

	@Override
	public Iphone6 createIphone6() {
		
		return new Iphone6S();
	}

	@Override
	public Iphone7 createIphone7() {
		
		return new Iphone7S();
	}

	@Override
	public Iphone8 createIphone8() {
		
		return new Iphone8S();
	}

}
