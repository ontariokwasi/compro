package ui;

import java.io.IOException;
import java.util.HashMap;

import business.Author;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CheckoutBookWindow extends Stage implements LibWindow{
	//fields
	@FXML
	private TextField txtMemberID;
	@FXML
	private TextField txtISBN;
	@FXML
	private Button btnCheckout;
	@FXML
	private TableView<String> lvRecords;
	
	public static final CheckoutBookWindow INSTANCE = new CheckoutBookWindow();
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
			root = FXMLLoader.load(getClass().getResource("checkoutBook.fxml"));

		} catch (IOException e1) {
			e1.printStackTrace();
		}
		txtMemberID = (TextField) root.lookup("#txtMemberID");
		txtISBN = (TextField) root.lookup("#txtISBN");
		btnCheckout = (Button) root.lookup("#btnCheckout");
		lvRecords = (TableView<String>) root.lookup("#lvRecords");
		lvRecords.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		TableColumn<String, String> c1 = new TableColumn<String, String>();
		c1.setMinWidth(0.5f);
		//c1.setCellValueFactory(value);
		TableColumn<String, String> c2 = new TableColumn<String, String>();
		c2.setMinWidth(0.5f);
		lvRecords.getColumns().add(c1);
		lvRecords.getColumns().add(c2);
		lvRecords.getColumns().get(0).setText("item1");
		lvRecords.getColumns().get(1).setText("item2");
		lvRecords.getItems().add("Book ISBN");
		lvRecords.getItems().add("CopyNumber");
		Scene scene = new Scene(root);
		setScene(scene);	
	}

}
