package inclass.lab7;

public enum MyEnum {
	COMPNAY("Microsoft"), SALES_TARGET(20000000);

	String val;
	int ival;

	MyEnum(String x) {
		val = x;
	}

	MyEnum(int x) {
		ival = x;
	}

	public String getStringValue() {
		return val;
	}

	public int getIntValue() {
		return ival;
	}

}
