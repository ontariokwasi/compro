package ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import business.Author;
import business.Book;
import business.SystemController;
import dataaccess.TestData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddBookWindow extends Stage implements LibWindow {
	// fields
	@FXML
	private TextField txtTitle;
	@FXML
	private TextField txtIsbn;
	@FXML
	private ComboBox<String> cboAuthors;
	@FXML
	private TextArea txaAuthorListDisplay;
	@FXML
	private Button btnAddNewAuthor;
	@FXML
	private ComboBox<Integer> cbocheckoutcopy;
	@FXML
	private TextField txtCopies;
	@FXML
	private Button btnAdd;
	@FXML
	private Button btnCancel;

	public static final AddBookWindow INSTANCE = new AddBookWindow();
	public static HashMap<String, Author> authors = new HashMap<String, Author>();
	public static Alert alert;

	private boolean isInitialized = false;
	private HashMap<String, Author> allAuthors;

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
			root = FXMLLoader.load(getClass().getResource("addNewBook.fxml"));

		} catch (IOException e1) {
			e1.printStackTrace();
		}

		txtTitle = (TextField) root.lookup("#txtTitle");
		txtIsbn = (TextField) root.lookup("#txtIsbn");
		cboAuthors = (ComboBox<String>) root.lookup("#cboAuthors");
		txaAuthorListDisplay = (TextArea) root.lookup("#txaAuthorListDisplay");
		btnAddNewAuthor = (Button) root.lookup("#btnAddNewAuthor");
		cbocheckoutcopy = (ComboBox<Integer>) root.lookup("#cbocheckoutcopy");
		txtCopies = (TextField) root.lookup("#txtCopies");
		btnAdd = (Button) root.lookup("#btnAdd");
		btnCancel = (Button) root.lookup("#btnCancel");
		
		btnAddNewAuthor.setOnAction(e ->{
			//Start.hideAllWindows();
			/*
			 * if (!AddAuthorWindow.INSTANCE.isInitialized()) {
			 * AddAuthorWindow.INSTANCE.init(); } AddAuthorWindow.INSTANCE.show();
			 */
			alert = new Alert(AlertType.INFORMATION,"", ButtonType.CLOSE);
			AddAuthorWindow.INSTANCE.init();
			alert.getDialogPane().setContent(AddAuthorWindow.INSTANCE.getScene().getRoot());
			alert.setHeaderText("");
			alert.setTitle("Add Author");
			alert.showAndWait();
			StringBuilder sb = new StringBuilder();
			Set<String> keys = authors.keySet();
			keys.forEach(key -> sb.append(key+"\n"));
			System.out.println("FromAB: "+keys);
			txaAuthorListDisplay.setText(sb.toString());
		});
		btnCancel.setOnAction(e -> {
			Start.hideAllWindows();
			Start.primStage().show();
		});
		
		btnAdd.setOnAction(e -> addBook(e));
		
		//set number of days the book can be checkedOut 
		cbocheckoutcopy.getItems().add(7);
		cbocheckoutcopy.getItems().add(21);
		
		//set Authors
		setAuthors(SystemController.allAuthors());
		
		//on selected Author
		cboAuthors.setOnAction(e -> {
			String author = cboAuthors.getSelectionModel().getSelectedItem();
			//add author to view
			txaAuthorListDisplay.setText(txaAuthorListDisplay.getText()+"\n"+author);
			//add author to selected list
			AddBookWindow.authors.put(author, allAuthors.get(author));
			setAuthors(author);
		});
		Scene scene = new Scene(root);
		setScene(scene);
	}
	
	//set authors method
	public void setAuthors(List<Author> authors) {
		allAuthors = new HashMap<String, Author>();
		authors.forEach(author -> {
			allAuthors.put(author.getFirstName()+" "+author.getLastName(), author);
			});
		cboAuthors.getItems().addAll(allAuthors.keySet());
	}
	
	public void setAuthors(String removeAuthor) {
		allAuthors.remove(removeAuthor);
		cboAuthors.getItems().addAll(allAuthors.keySet());
	}
	
	public void addBook(ActionEvent e) {
		try {

			int numcheckout = cbocheckoutcopy.getSelectionModel().getSelectedItem();
			String title = txtTitle.getText().trim();
			String isbn = txtIsbn.getText().trim();
			String authorlist = txaAuthorListDisplay.getText().trim();
			String numCopy = txtCopies.getText().trim();
			
			if(authorlist.length() == 0) throw new NullPointerException("Book should have at least one Author");
			if(title.length() == 0) throw new NullPointerException("Book title is required");
			if(isbn.length() == 0) throw new NullPointerException("ISBN of book is required");
			int copies = Integer.parseInt(numCopy);
			List<Author> bookAuthors = new ArrayList<Author>();
			bookAuthors.addAll(AddBookWindow.authors.values());
			Book book = new Book(isbn, title, numcheckout, bookAuthors);
			for(int i = 0; i < copies; i++)
				book.addCopy();
			TestData.saveBook(book);
			
			  Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
			  successAlert.setContentText("Book has been added to Library");
			  successAlert.setTitle("Success!"); successAlert.setHeaderText("");
			  successAlert.showAndWait();
			  
			  Start.hideAllWindows(); 
			  Start.primStage().show();

		} catch (NullPointerException | NumberFormatException ex) {
			String msg = ex.getMessage();
			if(ex.getClass().getSimpleName().equals("NumberFormatException"))
				msg = "Book copies should be a number";
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setContentText(msg);
			alert.setTitle("Validation Failed!");
			alert.setHeaderText("");
			alert.showAndWait();
		}
	}

}
