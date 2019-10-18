package lab8.prob3;

import java.util.function.Function;

public class MyClass {
	private String x;
	private int y;
	

	public MyClass(String x, int y) {
		this.x = x;
		this.y = y;
	}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((x == null) ? 0 : x.hashCode());
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	void myMethod(MyClass cl) {
		Function<MyClass, Boolean> isEqual = this::equals;
		 System.out.println(isEqual.apply(cl));
	}


	public static void main(String[] args) {
		MyClass ob1 = new MyClass("First", 1);
		MyClass ob2 = new MyClass("Second", 2);
		
		//compare ob1 to itself, should return true
		ob1.myMethod(ob1);
		
		//compare ob1 to ob2, should return false
		ob1.myMethod(ob2);

	}

}
