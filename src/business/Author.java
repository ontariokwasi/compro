package business;

import java.io.Serializable;

final public class Author extends Person implements Serializable {
	private String bio;
	private boolean credential;
	public boolean isCredential() {
		return credential;
	}


	public void setCredential(boolean credential) {
		this.credential = credential;
	}


	public String getBio() {
		return bio;
	}
	

	public Author(String f, String l, String t, Address a, String bio) {
		super(f, l, t, a);
		this.bio = bio;
		credential = false;
	}

	private static final long serialVersionUID = 7508481940058530471L;

}
