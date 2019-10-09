package business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import business.Book;
import dataaccess.Auth;
import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;
import dataaccess.User;

public class SystemController implements ControllerInterface {
	public static Auth currentAuth = null;
	
	public void login(String id, String password) throws LoginException {
		DataAccess da = new DataAccessFacade();
		HashMap<String, User> map = da.readUserMap();
		if(!map.containsKey(id)) {
			throw new LoginException("ID " + id + " not found");
		}
		String passwordFound = map.get(id).getPassword();
		if(!passwordFound.equals(password)) {
			throw new LoginException("Password incorrect");
		}
		currentAuth = map.get(id).getAuthorization();
		
	}
	@Override
	public List<String> allMemberIds() {
		DataAccess da = new DataAccessFacade();
		List<String> retval = new ArrayList<>();
		retval.addAll(da.readMemberMap().keySet());
		return retval;
	}
	
	@Override
	public List<String> allBookIds() {
		DataAccess da = new DataAccessFacade();
		List<String> retval = new ArrayList<>();
		retval.addAll(da.readBooksMap().keySet());
		return retval;
	}
	
	//getMember
	public static LibraryMember getMember(String memberID) {
		DataAccess da = new DataAccessFacade();
		return da.readMemberMap().get(memberID);
	}
	
	//generate memberID
	public static String createMemberID() {
		DataAccessFacade readMember = new DataAccessFacade();
		Set<String> keys = readMember.readMemberMap().keySet();
		TreeSet<String> memberIDs = new TreeSet<String>();
		memberIDs.addAll(keys);
		int newID = Integer.parseInt(memberIDs.last()) + 1;
		return newID + "";
	}
	
	//get all authors
	public static List<Author> allAuthors() {
		DataAccess da = new DataAccessFacade();
		List<Author> authors = new ArrayList<>();
		List<Book> books = new ArrayList<Book>(da.readBooksMap().values());
		books.forEach(book -> authors.addAll(book.getAuthors()));
		return authors;
	}
	
}
