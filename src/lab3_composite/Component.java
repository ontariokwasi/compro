package lab3_composite;

import java.util.List;

public interface Component {
	List<Component> getSub();
	double computePrice();
}
