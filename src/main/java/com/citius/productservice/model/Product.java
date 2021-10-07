package com.citius.productservice.model;

public class Product {
	private int id;
	private String name;
	private double netprice;
	private double tax;
	private double grossprice;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int id, String name, double netprice, double tax, double grossprice) {
		this.id = id;
		this.name = name;
		this.netprice = netprice;
		this.tax = tax;
		this.grossprice = grossprice;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getNetprice() {
		return netprice;
	}
	public void setNetprice(double netprice) {
		this.netprice = netprice;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getGrossprice() {
		return grossprice;
	}
	public void setGrossprice(double grossprice) {
		this.grossprice = grossprice;
	}
	
}
