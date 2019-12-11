package lab6_proxy;

public class Main {

	public static void main(String[] args) {
		Thing<String> t = new aThing<String>("A");
		t.compute("Hello");
		IFunctor func = new LogFunctor();
		t = new pThing<String>(t, func);
		t.compute("Hello");

	}

}
