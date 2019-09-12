package homework4.problem4;

public class Main {

	public static void main(String[] args) {
		CommissionEmployee ce = new CommissionEmployee("Gideon", "Akomeng", "123-456-789", 500, 0.20);
		HourlyEmployee he = new HourlyEmployee("Philip", "Owusu", "123-321-234", 10, 30);
		SalariedEmployee se = new SalariedEmployee("Adeoye", "Adesina", "213-321-432", 350);
		BasePlusCommissionEmployee bce = new BasePlusCommissionEmployee("Justina", "Selorm", "432-456-987", 5000, 0.10, 300);
		BasePlusCommissionEmployee bce2 = new BasePlusCommissionEmployee("Marlwyn", "Ayibontey", "432-456-987", 1000, 0.10, 100);
		
		Employee[] emps = {ce, he, se, bce, bce2};
		
		//Test toString for the objects and total
		for(Employee emp : emps) {
			System.out.println(emp);
		}

	}

}
