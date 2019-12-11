package lab7_abstractfactory;

public class FactoryPatternLab {

	public static void main(String[] args) {
		
		IphoneFactory iphoneS = new IphoneSFactory(); //
		IphoneFactory iphonePlus = new IphonePlusFactory();
		
		Iphone6 i6s = iphoneS.createIphone6();
		Iphone7 i7plus = iphonePlus.createIphone7();
		Iphone8 i8plus = iphonePlus.createIphone8();
		System.out.println(i6s);
		System.out.println(i7plus);
		System.out.println(i8plus);
	}

}
