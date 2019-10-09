package ui;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import business.Address;
import business.ControllerInterface;
import business.LibraryMember;
import business.Person;
import business.SystemController;
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

public class EditLibMember extends Stage implements LibWindow {

	// fields
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

	public void editMember(ActionEvent e) {
		try {

			String memberID = cboType.getSelectionModel().getSelectedItem();
			String firstName = txtFirstName.getText().trim();
			String lastName = txtLastName.getText().trim();
			String phone = txtPhone.getText().trim();
			String street = txtStreet.getText().trim();
			String city = txtCity.getText().trim();
			String state = txtState.getText().trim();
			String zip = txtZip.getText().trim();
			String[] values = { memberID, firstName, lastName, phone, street, city, state, zip };

			for (String s : values) {
				if (s.length() == 0)
					throw new NullPointerException();
			}
			//
			// String memberID = TestData.createMemberID();
			LibraryMember libraryMember = new LibraryMember(memberID, firstName, lastName, phone,
					new Address(street, city, state, zip));
			TestData.saveMember(libraryMember);
			Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
			successAlert.setContentText("Library member (" + memberID + ") has been modified successfully!");
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
	@SuppressWarnings("unchecked")
	@Override
	public void init() {
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("editLibMember.fxml"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		cboType = (ComboBox<String>) root.lookup("#cboType");
		ControllerInterface ci = new SystemController();
		List<String> ids = ci.allMemberIds();
		Collections.sort(ids);
		cboType.getItems().addAll(ids);

		txtFirstName = (TextField) root.lookup("#txtFirstName");
		txtLastName = (TextField) root.lookup("#txtLastName");
		txtPhone = (TextField) root.lookup("#txtPhone");
		txtStreet = (TextField) root.lookup("#txtStreet");
		txtCity = (TextField) root.lookup("#txtCity");
		txtState = (TextField) root.lookup("#txtState");
		txtZip = (TextField) root.lookup("#txtZip");
		btnAdd = (Button) root.lookup("#btnAdd");
		//On memberID selected Action Listener
		cboType.setOnAction(e ->{
			String id = cboType.getSelectionModel().getSelectedItem();
			//System.out.println(SystemController.getMember(id));
			Person libMember = (Person) SystemController.getMember(id);
			
			txtFirstName.setText(libMember.getFirstName());
			txtLastName.setText(libMember.getLastName()); 
			txtPhone.setText(libMember.getTelephone());
			Address libMemberAdd = libMember.getAddress();
			txtStreet.setText(libMemberAdd.getStreet());
			txtCity.setText(libMemberAdd.getCity());
			txtState.setText(libMemberAdd.getState()); 
			txtZip.setText(libMemberAdd.getZip());
		});
		//editMember Action Listener
		btnAdd.setOnAction(e -> {
			//
			editMember(e);
		});
		
		Scene scene = new Scene(root);
		setScene(scene);

	}

	public static final EditLibMember INSTANCE = new EditLibMember();

	private boolean isInitialized = false;

	public boolean isInitialized() {
		return isInitialized;
	}

	public void isInitialized(boolean val) {
		isInitialized = val;
	}

}
