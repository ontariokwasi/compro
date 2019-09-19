package homework8.problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Marketing {
	
	private String employeeName;
	private String productName;
	private Double salesAmount;

	/**
	 * 
	 */
	public Marketing(String employeeName,String productName,Double salesAmount) {
		this.employeeName = employeeName;
		this.productName  = productName;
		this.salesAmount  = salesAmount;
	}
	
	
	
	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public Double getSalesAmount() {
		return salesAmount;
	}



	public void setSalesAmount(Double salesAmount) {
		this.salesAmount = salesAmount;
	}



	@Override
	public String toString() {
		return "[Employee name: "+this.employeeName+",Product name: "+this.productName+",Sales amount: "+this.salesAmount+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this != obj) return false;
		if(getClass() != obj.getClass()) return false;
		Marketing marketing = (Marketing) obj;
		return employeeName.equals(marketing.getEmployeeName()) &&
				productName.equals(marketing.getProductName()) && salesAmount.equals(marketing.getSalesAmount());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Marketing> marketingList = new ArrayList<>();
		marketingList.add(new Marketing("Philip Sarfo","Hp Laptop",9.0));
		marketingList.add(new Marketing("Bill Gates","Lenovo",90.9));
		marketingList.add(new Marketing("Zullu Kafka","Dell",23390.0));
		
		marketingList.remove(new Marketing("Zullu Kafka","Dell",90.0));
		
		System.out.println(marketingList.size());
		
		//Sales amount sorting
		Collections.sort(marketingList,(salesAmt1,salesAmt2)->{
			return salesAmt1.getSalesAmount().compareTo(salesAmt2.getSalesAmount());
		});
		
		
		System.out.println(listMoreThan1000(marketingList));
		

	}
	
	public static List<Marketing> listMoreThan1000(List<Marketing> list){
		List<Marketing> newList = new ArrayList<Marketing>();
		
		list.forEach(e->{
			if(e.getSalesAmount() > 1000)
				newList.add(e);
		});
		
		Collections.sort(list, (employee1,employee2)->{
			return employee1.getEmployeeName().compareTo(employee2.getEmployeeName());
		});
		
		return newList;
	}

}