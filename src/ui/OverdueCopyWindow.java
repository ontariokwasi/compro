package ui;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class OverdueCopyWindow extends Stage implements LibWindow {
	// fields
	@FXML
	private ComboBox<String> txtISBN;
	@FXML
	private Button btnSearch;
	@FXML
	private Button btnCancel;
	@FXML
	private TableView<List<String>> lvRecords;

	public static final OverdueCopyWindow INSTANCE = new OverdueCopyWindow();
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
			root = FXMLLoader.load(getClass().getResource("overdueCopy.fxml"));

		} catch (IOException e1) {
			e1.printStackTrace();
		}

		txtISBN = (ComboBox<String>) root.lookup("#txtISBN");
		btnSearch = (Button) root.lookup("#btnSearch");
		btnCancel = (Button) root.lookup("#btnCancel");
		txtISBN.getItems().addAll(new SystemController().allBookIds());

		lvRecords = (TableView<List<String>>) root.lookup("#lvRecords");
		lvRecords.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		TableColumn<List<String>, String> colIsbn = new TableColumn<>();
		TableColumn<List<String>, String> colTitle = new TableColumn<>();
		TableColumn<List<String>, String> colCopyNum = new TableColumn<>();
		TableColumn<List<String>, String> colMemberId = new TableColumn<>();
		TableColumn<List<String>, String> colReturnDate = new TableColumn<>();

		colIsbn.setMaxWidth(80f);
		colTitle.setMaxWidth(150f);
		colCopyNum.setMaxWidth(60f);
		colMemberId.setMaxWidth(80f);
		colReturnDate.setMaxWidth(120f);

		colIsbn.setText("ISBN");
		colTitle.setText("TITLE");
		colCopyNum.setText("COPY");
		colMemberId.setText("MEMBER");
		colReturnDate.setText("DUE DATE");

		colIsbn.setCellValueFactory(v -> {
			return new SimpleStringProperty(v.getValue().get(0));
		});
		colTitle.setCellValueFactory(v -> {
			return new SimpleStringProperty(v.getValue().get(1));
		});
		colCopyNum.setCellValueFactory(v -> {
			return new SimpleStringProperty(v.getValue().get(2));
		});
		colMemberId.setCellValueFactory(v -> {
			return new SimpleStringProperty(v.getValue().get(3));
		});
		colReturnDate.setCellValueFactory(v -> {
			return new SimpleStringProperty(v.getValue().get(4));
		});

		lvRecords.getColumns().addAll(colIsbn, colTitle, colCopyNum, colMemberId, colReturnDate);

		btnSearch.setOnAction(e -> {
			String isbn = txtISBN.getSelectionModel().getSelectedItem().trim();

			if (!SystemController.findbook(isbn))
				new Alert(Alert.AlertType.ERROR, "Book not Found").showAndWait(); // this part may never run
			else {
				String title = SystemController.getBook(isbn).getTitle();
				HashMap<String, CheckoutRecord> overdueRecords = SystemController.getOverdueRecords(isbn);
				lvRecords.getItems().clear();
				if (!overdueRecords.isEmpty())
					// add records to tableview
					overdueRecords.forEach((id, record) -> lvRecords.getItems()
							.add(new ArrayList<String>(Arrays.asList(record.getIsbn(), title, record.getCopynum() + "",
									id, record.getDuedate().format(DateTimeFormatter.ofPattern("MM/dd/yyy"))))));
				else {
					Alert alert = new Alert(AlertType.WARNING, "No overdue records found for book(" + isbn + ")");
					alert.setHeaderText("");
					alert.setTitle("Record Not Found");
					alert.showAndWait();
				}

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
