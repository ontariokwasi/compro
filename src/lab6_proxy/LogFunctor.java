package lab6_proxy;

public class LogFunctor implements IFunctor{

	@Override
	public void pre() {
		System.out.println("Pre");
		
	}

	@Override
	public void post() {
		System.out.println("Post");
		
	}

}
