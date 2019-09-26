package homework2.problem5;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyDate {
	
	MyDate(int dayOfMonth, int month, int year){
		LocalDate ldate = LocalDate.of(year, month, dayOfMonth);	
		System.out.println("MM/dd/yyyy: "+ldate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
		System.out.println("MMMM dd,yyyy: "+ldate.format(DateTimeFormatter.ofPattern("MMMM dd,yyyy")));
		System.out.println("DDD yyyy: "+ldate.format(DateTimeFormatter.ofPattern("DDD yyyy")));
	}
	
	MyDate(int dayOfMonth, String month, int year){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d-MMMM-yyyy");
		LocalDate ldate = LocalDate.parse(dayOfMonth+"-"+month+"-"+year,dtf);
		System.out.println("MM/dd/yyyy: "+ldate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
		System.out.println("MMMM dd,yyyy: "+ldate.format(DateTimeFormatter.ofPattern("MMMM dd,yyyy")));
		System.out.println("DDD yyyy: "+ldate.format(DateTimeFormatter.ofPattern("DDD yyyy")));
	}
	MyDate(int dayOfYear, int year){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("D-yyyy");
		LocalDate ldate = LocalDate.parse(dayOfYear+"-"+year,dtf);
		System.out.println("MM/dd/yyyy: "+ldate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
		System.out.println("MMMM dd,yyyy: "+ldate.format(DateTimeFormatter.ofPattern("MMMM dd,yyyy")));
		System.out.println("DDD yyyy: "+ldate.format(DateTimeFormatter.ofPattern("DDD yyyy")));
	}
	
	public static void main(String [] args) {
		//new MyDate(111, 2019);
		while(true) {
			System.out.println("Enter 1 for format: MM/DD/YYYY \n"
					+ "Enter 2 for format: Month DD, YYYY \n"
					+ "Enter 3 for format: DDD YYYY\n" 
					+ "Enter 4 to exit\nChoose your Choice :\n");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			boolean quit = false;
			switch (choice) {
			case 1:
				System.out.println("Choice: 1\nEnter Month:");
				int month = sc.nextInt();
				System.out.println("Enter Day:");
				int day = sc.nextInt();
				System.out.println("Enter Year:");
				int year = sc.nextInt();
				new MyDate(day, month, year);
				break;
			case 2:
				System.out.println("Choice: 2\nEnter Month in text:");
				String month1 = sc.next();
				System.out.println("Enter Day:");
				int day1 = sc.nextInt();
				System.out.println("Enter Year:");
				int year1 = sc.nextInt();
				new MyDate(day1, month1, year1);
				break;
			case 3:
				System.out.println("Choice: \nEnter Day of Year:");
				int doy = sc.nextInt();
				System.out.println("Enter Year:");
				int year2 = sc.nextInt();
				new MyDate(doy, year2);
				break;
			case 4:
				quit = true;
				System.out.println("Terminated");
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
			if(quit) 
				break;
			else {
				System.out.println("Do you want to Continue? (y/n):");
				Scanner sc1 = new Scanner(System.in);
				String yn = sc1.nextLine();
				if(yn.equals("n")) {
					System.out.println("Terminated");
					sc1.close();
					break;
				}
			}
			//sc.close();
		}
	}

}
