package ui;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import business.Address;
import business.LibraryMember;
import business.SystemController;
import dataaccess.Auth;
import dataaccess.DataAccessFacade;
import dataaccess.TestData;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddNewLibMemberWindow extends Stage implements LibWindow {
	// fields
	//@FXML
	//private ComboBox<String> cboType;
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

	public void addMember(ActionEvent e) {
		try {

			//String userType = cboType.getSelectionModel().getSelectedItem();
			String firstName = txtFirstName.getText().trim();
			String lastName = txtLastName.getText().trim();
			String phone = txtPhone.getText().trim();
			String street = txtStreet.getText().trim();
			String city = txtCity.getText().trim();
			String state = txtState.getText().trim();
			String zip = txtZip.getText().trim();
			String[] values = {firstName, lastName, phone, street, city, state, zip };

			for (String s : values) {
				if (s.length() == 0)
					throw new NullPointerException();
			}
			//
			String memberID = SystemController.createMemberID();
			LibraryMember libraryMember = new LibraryMember(memberID, firstName, lastName, phone,
					new Address(street, city, state, zip));
			TestData.saveMember(libraryMember);
			Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
			successAlert.setContentText("New library member created successfully!\nYour Member ID is: "+memberID);
			successAlert.setTitle("Success!");
			successAlert.setHeaderText("");
			successAlert.showAndWait();
			Start.hideAllWindows();
			Start.primStage().show();
			//

		} catch (NullPointerException ex) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setContentText("All fields are required");
			alert.setTitle("Validation Failed!");
			alert.setHeaderText("");
			alert.showAndWait();
		}
	}

	//
	@Override
	public void init() {
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("addNewLibMember.fxml"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		//
		/*
		 * cboType = (ComboBox<String>) root.lookup("#cboType");
		 * cboType.getItems().add(Auth.ADMIN.toString());
		 * cboType.getItems().add(Auth.LIBRARIAN.toString());
		 * cboType.getItems().add(Auth.BOTH.toString());
		 *///

		txtFirstName = (TextField) root.lookup("#txtFirstName");
		txtLastName = (TextField) root.lookup("#txtLastName");
		txtPhone = (TextField) root.lookup("#txtPhone");
		txtStreet = (TextField) root.lookup("#txtStreet");
		txtCity = (TextField) root.lookup("#txtCity");
		txtState = (TextField) root.lookup("#txtState");
		txtZip = (TextField) root.lookup("#txtZip");
		//
		btnAdd = (Button) root.lookup("#btnAdd");
		btnAdd.setOnAction(e -> {
			//
			addMember(e);
		});
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
