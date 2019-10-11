package ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import business.Author;
import business.Book;
import business.SystemController;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ViewBooksWindow extends Stage implements LibWindow {
	// fields
	@FXML
	private TableView<List<String>> lvRecords;

	public static final ViewBooksWindow INSTANCE = new ViewBooksWindow();
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
			root = FXMLLoader.load(getClass().getResource("allbooks.fxml"));

		} catch (IOException e1) {
			e1.printStackTrace();
		}

		lvRecords = (TableView<List<String>>) root.lookup("#lvRecords");
		lvRecords.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		TableColumn<List<String>, String> colIsbn = new TableColumn<>();
		TableColumn<List<String>, String> colTitle = new TableColumn<>();
		TableColumn<List<String>, String> author = new TableColumn<>();
		TableColumn<List<String>, String> totCopies = new TableColumn<>();
		TableColumn<List<String>, String> maxCheckout = new TableColumn<>();
		TableColumn<List<String>, String> avlCopies = new TableColumn<>();

		colIsbn.setMaxWidth(90f);
		colTitle.setMaxWidth(180f);
		author.setMaxWidth(130f);
		totCopies.setMaxWidth(80f);
		maxCheckout.setMaxWidth(75f);
		avlCopies.setMaxWidth(75f);

		colIsbn.setText("ISBN");
		colTitle.setText("TITLE");
		author.setText("AUTHOR(S)");
		maxCheckout.setText("MAX.\nCHEKOUT");
		totCopies.setText("TTL\nCOPIES");
		avlCopies.setText("AVL\nCOPIES");

		colIsbn.setCellValueFactory(v -> {
			return new SimpleStringProperty(v.getValue().get(0));
		});
		colTitle.setCellValueFactory(v -> {
			return new SimpleStringProperty(v.getValue().get(1));
		});
		author.setCellValueFactory(v -> {
			return new SimpleStringProperty(v.getValue().get(2));
		});
		maxCheckout.setCellValueFactory(v -> {
			return new SimpleStringProperty(v.getValue().get(3));
		});
		totCopies.setCellValueFactory(v -> {
			return new SimpleStringProperty(v.getValue().get(4));
		});
		avlCopies.setCellValueFactory(v -> {
			return new SimpleStringProperty(v.getValue().get(5));
		});

		HashMap<String, Book> allbooks = SystemController.getAllBooks();
		allbooks.forEach((id, book) -> {
			List<Author> bookauthors = book.getAuthors();
			StringBuilder sb = new StringBuilder();
			bookauthors.forEach(a -> sb.append(a.getFirstName() + " " + a.getLastName() + "\n"));
			lvRecords.getItems().add(new ArrayList<String>(Arrays.asList(id, book.getTitle(), sb.toString(),
					book.getMaxCheckoutLength()+"", book.getCopies().length + "", SystemController.totalAvailableCopies(book)+"")));
		});

		lvRecords.getColumns().addAll(colIsbn, colTitle, author, maxCheckout, totCopies, avlCopies);

		Scene scene = new Scene(root);
		setScene(scene);
	}

}
