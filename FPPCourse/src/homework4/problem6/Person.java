package homework4.problem6;

public class Person implements Cloneable{
	 String name;
	 Computer computer;
	
	Person(String name, Computer computer){
		this.name = name;
		this.computer = computer;
	}
	//setter for name
	public void setName(String name) {
		this.name = name;
	}
	//override clone
	@Override
	public Object clone() throws CloneNotSupportedException {
		return (Person) super.clone();
	}
	@Override
	public String toString() {
		return "Person Name: "+name+"\n"+computer;
	}
}
