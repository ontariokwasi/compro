package ui;

import java.io.IOException;
import java.io.Serializable;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddNewLibMemberWindow extends Stage implements LibWindow{
	//fields
	@FXML
	private ComboBox<String> cboType;
	@FXML
	private TextField txtFirstName;
	@FXML
	private TextField txtLastName;
	@FXML
	private TextField txtPhone;
	@FXML
	private TextField txtStreet;
	@FXML
	private TextField txtCity;
	@FXML
	private TextField txtState;
	@FXML
	private TextField txtZip;
	@FXML
	private Button btnBackMain;
	@FXML
	private Button btnAdd;
	@FXML
	private Button btnCancel;

	//
	public void cancel(ActionEvent e) {
		Start.hideAllWindows();
		Start.primStage().show();
	}
	
	@Override
	public void init() {
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("addNewLibMember.fxml"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		Scene scene = new Scene(root);
		setScene(scene);
		
	}

	public static final AddNewLibMemberWindow INSTANCE = new AddNewLibMemberWindow();

	private boolean isInitialized = false;

	public boolean isInitialized() {
		return isInitialized;
	}

	public void isInitialized(boolean val) {
		isInitialized = val;
	}
	
}
