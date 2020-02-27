package com.cs544.labs.lab02;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class CarApp {
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
			
			// create 3 Owners objects
			Owner o1 = new Owner("Daily Manna", "Kasoa");
			Owner o2 = new Owner("The King", "Dansoman");
			Owner o3 = new Owner("The royals", "Accra");
			
			//create 3 car objs
			Car c1 = new Car("BMW", "2019", 50000, o1);
			Car c2 = new Car("TESLA", "2019", 150000, o2);
			Car c3 = new Car("BENZ", "2020", 70000, o3);

			// save books to db
			session.persist(c1);
			session.persist(c2);
			session.persist(c3);

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
		 * Retrieve all saved Cars from the database and display to the console alongside their owners
		 */
		printAllOwners();
	}

	@SuppressWarnings("unchecked")
	static void printAllOwners() {
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
			List<Car> cars = session.createQuery("from Car").list();
			
			cars.forEach(car -> System.out.println(car));

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
