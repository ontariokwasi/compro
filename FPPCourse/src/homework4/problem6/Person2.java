package homework4.problem6;

public class Person2 implements Cloneable{
	 String name;
	 Computer2 computer;
	
	Person2(String name, Computer2 computer){
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
		Person2 p2copy = (Person2) super.clone();
		p2copy.computer = (Computer2) this.computer.clone();
		return p2copy;
	}
	@Override
	public String toString() {
		return "Person Name: "+name+"\n"+computer;
	}
}
