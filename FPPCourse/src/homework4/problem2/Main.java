package homework4.problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		DeptEmployee prof1 = new Professor("Gideon Akomeng", LocalDate.of(2005, 8, 21), 2000.0);
		DeptEmployee prof2 = new Professor("Philip Sarfo", LocalDate.of(2009, 6, 3), 1500.0);
		DeptEmployee prof3 = new Professor("Adeoye Adesina", LocalDate.of(2015, 4, 2), 1000.0);
		
		DeptEmployee sec1 = new Secretary("Justina Aniclo", LocalDate.of(2005, 9, 10), 1200.0);
		DeptEmployee sec2 = new Secretary("Mina Sena", LocalDate.of(2008, 2, 12), 1300.0);
		
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = prof1;
		department[1] = prof2;
		department[2] = prof3;
		department[3] = sec1;
		department[4] = sec2;
		
		System.out.print("Do you to see the sum of all Professor and Secretary salary in the department? (Y/N):");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if(input.equals("Y")) {
			double salary = 0.0;
			for(DeptEmployee emp : department) {
				System.out.println(emp.getName() + ":" +emp.computeSalary());
				salary += emp.computeSalary();
			}
			System.out.println(salary);
		}
		
	}

}
