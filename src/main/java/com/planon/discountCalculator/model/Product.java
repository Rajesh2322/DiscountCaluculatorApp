package com.planon.discountCalculator.model;

import java.time.LocalDate;

public class Product {

	private String name;
	private ProductType type;
	private double price;
	private LocalDate expiryDate;

	public Product(String name, ProductType type, double price, LocalDate expiryDate) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.expiryDate = expiryDate;
	}

	public String getName() {
		return name;
	}

	public ProductType getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

}
