package ui;

import javafx.scene.control.TextField;

public class WindowFormData {
	public static void reset(TextField []fields) {
		for(TextField c : fields) {
			c.setText("");
		}
	}
}
