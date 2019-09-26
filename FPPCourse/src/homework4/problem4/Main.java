package homework4.problem4;

public class Main {

	public static void main(String[] args) {
		CommissionEmployee ce = new CommissionEmployee("Gideon", "Akomeng", "123-456-789", 500, 0.20);
		HourlyEmployee he = new HourlyEmployee("Philip", "Owusu", "123-321-234", 10, 30);
		SalariedEmployee se = new SalariedEmployee("Adeoye", "Adesina", "213-321-432", 350);
		BasePlusCommissionEmployee bce = new BasePlusCommissionEmployee("Justina", "Selorm", "432-456-987", 5000, 0.10, 300);
		BasePlusCommissionEmployee bce2 = new BasePlusCommissionEmployee("Marlwyn", "Ayibontey", "432-456-987", 1000, 0.10, 100);
		
		Employee[] emps = {ce, he, se, bce, bce2};
		
		//Test toString for the objects and total Salary
		double totalSalary = 0.0;
		for(Employee emp : emps) {
			totalSalary += emp.getPayment();
			System.out.println(emp);
		}
		System.out.println("\nTotal Salaries: "+totalSalary);
		System.out.println(String.format("%.2f", 20.0));
		System.out.println(emps.length);
		int []testarr = {1,2,3,5};
		System.out.println(new Main().isfibo(testarr, 0));
		System.out.println(new Main().fibo(6, 0, 1, "0,1"));
	}
	boolean isfibo(int arr[], int i) {
		if(i+2 >= arr.length && i > 0) return true;
		if(i+2 >= arr.length && i <= 0) return false;
		if(arr[i]+arr[i+1] !=arr[i+2]) return false;
		return isfibo(arr, i+1);
	}
	String fibo(int c, int f, int s, String fib) {
		if(c <=0) return fib;
		int t = f+s;
		fib += ","+t;
		return fibo(c-1, s, t, fib);
	}

}
