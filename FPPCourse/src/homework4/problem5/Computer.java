package homework4.problem5;

import java.util.Objects;

public class Computer {
	String manufacturer;
	String processor;
	int ramSize;
	double processorSpeed;
	
	Computer(String manufacturer, String processor, int ramSize, double processorSpeed){
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed = processorSpeed;
	}

	public int getRamSize() {
		return ramSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}
	
	public double computePower() {
		return ramSize*processorSpeed;
	}
	
	@Override
	public String toString() {
		return "Manufacturer: "+manufacturer+"\nProcessor:"+processor+"\n"+"RAM Size: "+ramSize+"\nProcessor Speeed: "+processorSpeed;	
	}
	
	@Override
	public boolean equals(Object comp) {
		if(comp == null) return false;
		if(!(comp instanceof Computer)) return false;
		Computer com = (Computer) comp;
		if(com.processor == this.processor && com.manufacturer == this.manufacturer && com.processorSpeed == this.processorSpeed && com.ramSize == this.ramSize) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		//Java 8 way
		//return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
		
		//Java 7 way
		int hv = 31;
		hv += manufacturer.hashCode();
		hv += processor.hashCode();
		hv += (int) ramSize;
		long f1 = Double.doubleToLongBits(processorSpeed);
		hv += (int)(f1^(f1 >>> 32));
		return hv;
	}
	
	
	
}
