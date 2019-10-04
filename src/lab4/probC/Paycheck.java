package lab4.probC;

public final class Paycheck {
	//fields
	private double grossPay;
	private final double fica = 0.23;
	private final double state = 0.05;
	private final double local = 0.01;
	private final double medicare = 0.03;
	private final double socialSecurity = 0.075;
	
	//constructor	
	Paycheck(double grossPay) {
		this.grossPay = grossPay;
	}
	
	//functions
	public void print() {
		System.out.println("Paystub:");
		System.out.println("\tGross Pay: " + grossPay);
		System.out.println("\tFica: " + fica);
		System.out.println("\tState: " + state);
		System.out.println("\tLocal: " + local);
		System.out.println("\tMedicare: " + medicare);
		System.out.println("\tSocial Security: " + socialSecurity);
		System.out.println("\tNET PAY: " + getNetPay());
	}
	public double getNetPay() {
		double taxes = (fica + state + local + medicare + socialSecurity)*grossPay;
		double netPay = grossPay - taxes;
		return netPay;
	}
}
