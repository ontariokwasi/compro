package com.cs544.labs.lab01;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class BookApp {
	private static final SessionFactory sessionFactory;
	private static final ServiceRegistry serviceRegistry;

	static {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		org.hibernate.Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		/**
		 * creating 3 books and adding to the database Ensure you commit to save to Db
		 * else it will hung in memory and will be cleared after session is closed
		 */
		try {
			// create 3 book objects
			Book b1 = new Book("Daily Manna", "1234", "Nic Sam", 35, new Date());
			Book b2 = new Book("The King", "4567", "Tim Tom", 20, new Date());
			Book b3 = new Book("The royals", "8901", "Ben Bob", 30, new Date());

			// save books to db
			session.persist(b1);
			session.persist(b2);
			session.persist(b3);

			// commit save to write to disk
			trans.commit();

		} catch (Exception e) {
			if (trans.isActive()) {
				System.out.println("Error occured, Rolling back");
				System.out.println(e.getMessage());
				trans.rollback();
			}
		} finally {
			if (session.isOpen())
				session.close();
		}

		/**
		 * Retrieve all saved Books from the database and display to the console
		 */
		printAllBooks();

		/**
		 * Retrieve a book and change its title & price Delete a book
		 */
		try {
			// open new session and begin transation
			session = sessionFactory.openSession();
			trans = session.beginTransaction();

			// Retrieve a book
			Book thirdbook = (Book) session.load(Book.class, 3); // retrieve the third book in the db; using the lazy
																	// method -load
			thirdbook.setTitle("A True Princess");
			thirdbook.setPrice(9.99);

			// update book
			session.update(thirdbook);
			
			// delete the second book from the db
			session.delete(session.get(Book.class, 2));
			
			// commit the transactions
			trans.commit();

		} catch (Exception e) {
			if (trans.isActive()) {
				System.out.println("Rolling back\n" + e.getMessage());
				trans.rollback();
			}
		} finally {
			if (session.isOpen())
				session.close();
		}

		/**
		 * Retrieve all saved Books from the database and display to the console
		 */
		printAllBooks();
	}

	@SuppressWarnings("unchecked")
	static void printAllBooks() {
		/**
		 * Retrieve all saved Books from the database and display to the console
		 */
		Session session = null;
		Transaction trans = null;
		try {
			// open new session and begin transation
			session = sessionFactory.openSession();
			trans = session.beginTransaction();

			// query to retrieve books from db
			List<Book> books = session.createQuery("from Book").list();
			System.out.println("\n\nBOOK TITLE\t\tISBN\t\tAUTHOR\t\tPRICE\t\tDATE");
			books.forEach(book -> System.out.println(book.getTitle() + "\t\t" + book.getISBN()
					+ "\t\t" + book.getAuthor() + "\t\t" + book.getPrice() + "\t\t" + book.getPublish_date()));

		} catch (Exception e) {
			if (trans.isActive()) {
				System.out.println("Rolling back\n" + e.getMessage());
				trans.rollback();
			}
		} finally {
			if (session.isOpen())
				session.close();
		}
	}
}
