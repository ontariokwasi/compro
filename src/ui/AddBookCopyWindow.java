package ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import business.Book;
import business.SystemController;
import dataaccess.DataAccessFacade;
import dataaccess.TestData;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddBookCopyWindow extends Stage implements LibWindow {
	// fields
	@FXML
	private ComboBox<String> cboBook;
	@FXML
	private TextField txtCopiedNum;
	@FXML
	private Button btnCancel;
	@FXML
	private Button btnAdd;

	// variable
	public static final AddBookCopyWindow INSTANCE = new AddBookCopyWindow();
	private boolean isInitialized = false;
	private String bookId = null;
	private int copiedNums;

	@SuppressWarnings("unchecked")
	@Override
	public void init() {
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("addBookCopy.fxml"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		cboBook = (ComboBox<String>) root.lookup("#cboBook");
		txtCopiedNum = (TextField) root.lookup("#txtCopiedNum");
		btnCancel = (Button) root.lookup("#btnCancel");
		btnAdd = (Button) root.lookup("#btnAdd");

		// setBooks
		SystemController sc = new SystemController();
		List<String> bookIds = sc.allBookIds();
		// System.out.println(bookIds.toString());
		cboBook.getItems().addAll(bookIds);

		btnCancel.setOnAction(e -> {
			Start.hideAllWindows();
			Start.primStage().show();

		});

		btnAdd.setOnAction(e -> addCopiedBook(e));

		Scene scene = new Scene(root);
		setScene(scene);
	}

	@Override
	public boolean isInitialized() {
		// TODO Auto-generated method stub
		return isInitialized;
	}

	@Override
	public void isInitialized(boolean val) {
		isInitialized = val;
	}

	public void addCopiedBook(ActionEvent e) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("");
		try {
			bookId = cboBook.getSelectionModel().getSelectedItem();
			copiedNums = Integer.parseInt(txtCopiedNum.getText().trim());
			if(bookId == null) throw new NullPointerException("Please select a book");
			if(copiedNums < 1) throw new NumberFormatException("Number of copies should be a positive integer value");
			Book book = SystemController.getBook(bookId);
			for (int i = 0; i < copiedNums; i++)
				book.addCopy();
			TestData.saveBook(book);
			alert.setContentText(copiedNums + " copies added to book(" + bookId + ")");
			alert.setTitle("Success");

		} catch (NumberFormatException | NullPointerException ex) {
			alert.setAlertType(AlertType.ERROR);
			alert.setContentText("Please select a book");
			if(ex.getClass().getSimpleName().equals("NumberFormatException"))
				alert.setContentText("Number of copies should be a positive integer value");
		}
		alert.show();

	}

}
