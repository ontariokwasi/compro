package lab3_composite;

import java.util.*;

public class Cabinet {
	private Board board;
	private Vector<Drive> drivelist;

	public void setBoard(Board b) {
		board = b;
		drivelist = new Vector<>();
	}

	public void addDrive(Drive d) {
		drivelist.addElement(d);
	}

	public double netPrice() {
		return 6.00;
	}

	public double discountPrice() {
		return 3.00;
	}

	public double computePrice() {
		double tmp = netPrice();
		if (board != null)
			tmp += board.computePrice();
		for (Object drive : drivelist)
			tmp += ((Drive) drive).computePrice();
		return tmp;
	}
}
