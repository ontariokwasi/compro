package ui;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import business.Book;
import business.BookCopy;
import business.CheckoutRecord;
import business.LibraryMember;
import business.SystemController;
import dataaccess.TestData;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CheckoutBookWindow extends Stage implements LibWindow {
	// fields
	@FXML
	private TextField txtMemberID;
	@FXML
	private TextField txtISBN;
	@FXML
	private Button btnCheckout;
	@FXML
	private Button btnCancel;
	@FXML
	private TableView<List<String>> lvRecords;

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
		btnCancel = (Button) root.lookup("#btnCancel");
		lvRecords = (TableView<List<String>>) root.lookup("#lvRecords");
		lvRecords.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		TableColumn<List<String>, String> c1 = new TableColumn<>();
		TableColumn<List<String>, String> c2 = new TableColumn<>();

		c1.setMinWidth(0.4f);
		c2.setMinWidth(0.4f);
		c1.setCellValueFactory(v -> {
			return new SimpleStringProperty(v.getValue().get(0));
		});
		c2.setCellValueFactory(v -> {
			return new SimpleStringProperty(v.getValue().get(1));
		});

		lvRecords.getColumns().add(c1);
		lvRecords.getColumns().addAll(c2);

		btnCheckout.setOnAction(e -> {
			String memberID = txtMemberID.getText().trim();
			String isbn = txtISBN.getText().trim();
			if (SystemController.getMember(memberID) == null)
				new Alert(Alert.AlertType.ERROR, "Member not found!").showAndWait();
			else if (!SystemController.findbook(isbn)
					|| !SystemController.hasAvailableCopy(SystemController.getBook(isbn)))
				new Alert(Alert.AlertType.ERROR, "Book not available").showAndWait();
			else {
				Book book = SystemController.getBook(isbn);
				BookCopy bc = SystemController.getAvailableCopy(book);
				int copynum = bc.getCopyNum();
				LocalDate checkoutdate = LocalDate.now();
				LocalDate duedate = checkoutdate.plusDays(book.getMaxCheckoutLength());
				bc.changeAvailability();
				TestData.saveBook(book);
				//add to member's checkout records
				CheckoutRecord cr = new CheckoutRecord(isbn, copynum, checkoutdate, duedate);
				LibraryMember lm = SystemController.getMember(memberID);
				lm.addCheckoutRecord(cr);
				TestData.saveMember(lm);
				
				// add records to tableview
				lvRecords.getItems().add(new ArrayList<String>(Arrays.asList("Member ID", memberID)));
				lvRecords.getItems().add(new ArrayList<String>(Arrays.asList("Book (ISBN)", isbn)));
				lvRecords.getItems().add(new ArrayList<String>(Arrays.asList("Copy Number", copynum+"")));
				lvRecords.getItems().add(new ArrayList<String>(Arrays.asList("Checkout Date",
						checkoutdate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")))));
				lvRecords.getItems().add(new ArrayList<String>(
						Arrays.asList("Due Date", duedate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")))));
				
				Alert alert = new Alert(Alert.AlertType.INFORMATION, "Book has been successfully checked out to "+memberID);
				alert.setHeaderText("");
				alert.setTitle("Success!");
				alert.show();
				TextField fields[] = {txtISBN, txtMemberID};
				WindowFormData.reset(fields);
			}
		});
		btnCancel.setOnAction(e -> {
			Start.hideAllWindows();
			Start.primStage().show();
		});
		
		Scene scene = new Scene(root);
		setScene(scene);
	}

}
