package com.cs544.labs.lab02;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private String year;
	private double price;

	@ManyToOne(cascade = CascadeType.PERSIST)
	// @JoinColumn(name = "owner_id")
	@JoinTable(name = "car_owner")
	private Owner owner;

	public Car(String brand, String year, double price, Owner owner) {
		this.brand = brand;
		this.year = year;
		this.price = price;
		this.owner = owner;
	}

	public Car() {
		// default constructor for hibernate
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(String name, String address) {

		this.owner = new Owner(name, address);
	}

	public void setOwner(Owner owner) {

		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", year=" + year + ", price=" + price + ", owner=" + owner + "]";
	}

}
