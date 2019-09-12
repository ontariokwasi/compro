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

	}

}
