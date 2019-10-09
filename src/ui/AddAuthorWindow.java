package ui;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import business.Address;
import business.Author;
import business.ControllerInterface;
import business.LibraryMember;
import business.SystemController;
import dataaccess.TestData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddAuthorWindow extends Stage implements LibWindow{
	//fields
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
	private ComboBox<String> cboCredential;
	@FXML
	private TextArea txaBio;
	@FXML
	private Button btnAdd;
	@FXML
	private Button btnCancel;

	
	public static final AddAuthorWindow INSTANCE = new AddAuthorWindow();

	private boolean isInitialized = false;

	@Override
	public boolean isInitialized() {
		return isInitialized;
	}

	@Override
	public void isInitialized(boolean val) {
		isInitialized = val;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public void init() {
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("addAuthor.fxml"));

		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		cboCredential = (ComboBox<String>) root.lookup("#cboCredential");
		cboCredential.getItems().add("No");
		cboCredential.getItems().add("Yes");

		txtFirstName = (TextField) root.lookup("#txtFirstName");
		txtLastName = (TextField) root.lookup("#txtLastName");
		txtPhone = (TextField) root.lookup("#txtPhone");
		txtStreet = (TextField) root.lookup("#txtStreet");
		txtCity = (TextField) root.lookup("#txtCity");
		txtState = (TextField) root.lookup("#txtState");
		txtZip = (TextField) root.lookup("#txtZip");
		txaBio = (TextArea) root.lookup("#txaBio");
		btnAdd = (Button) root.lookup("#btnAdd");
		btnCancel = (Button) root.lookup("#btnCancel");
		
		btnCancel.setOnAction(e -> {
			AddBookWindow.alert.close();
		});
		btnAdd.setOnAction(e -> addAuthor(e));
		
		Scene scene = new Scene(root);
		setScene(scene);
	}
	
	public void addAuthor(ActionEvent e) {
		try {

			String credentials = cboCredential.getSelectionModel().getSelectedItem();
			String firstName = txtFirstName.getText().trim();
			String lastName = txtLastName.getText().trim();
			String phone = txtPhone.getText().trim();
			String street = txtStreet.getText().trim();
			String city = txtCity.getText().trim();
			String state = txtState.getText().trim();
			String zip = txtZip.getText().trim();
			String txaBio = txtZip.getText().trim();
			String[] values = { credentials, firstName, lastName, phone, street, city, state, zip, txaBio };

			for (String s : values) {
				if (s.length() == 0)
					throw new NullPointerException();
			}
			String key = firstName+" "+lastName;
			AddBookWindow.authors.put(key, new Author(firstName, lastName, phone, new Address(street, city, state, zip), txaBio));
			System.out.println("FromAU: "+AddBookWindow.authors);
			//Alert successAlert = new Alert(Alert.AlertType.CONFIRMATION, "", ButtonType.YES, ButtonType.NO);
			
			  Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
			  successAlert.setContentText("Author added to book.");
			  successAlert.setTitle("Success!"); successAlert.setHeaderText("");
			  successAlert.showAndWait();
			  //TextField [] fields = { txtFirstName, txtLastName, txtPhone, txtStreet, txtCity, txtState, txtZip, txtZip };
			  //WindowFormData.reset(fields);
			 AddBookWindow.alert.close();
			//ButtonType results = successAlert.getResult();
			//if(results.getText().equals("NO")) {
			/*
			 * Start.hideAllWindows(); AddBookWindow.INSTANCE.show();
			 */
			//}
			
			//

		} catch (NullPointerException ex) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setContentText("All fields are required");
			alert.setTitle("Validation Failed!");
			alert.setHeaderText("");
			alert.showAndWait();
		}
	}

}
