package homework2.problem5;

import java.time.LocalDate;

public class Testdate {

	public static void main(String[] args) {
		LocalDate ldate = LocalDate.of(2019, 2, 1).minusMonths(1);
		System.out.println(ldate.getMonthValue()+" "+ ldate.getYear());

	}

}
