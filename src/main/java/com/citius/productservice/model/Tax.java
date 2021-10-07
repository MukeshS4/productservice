package com.citius.productservice.model;

public class Tax {
	private int id;
	private int pid;
	private double tax;
	

	public Tax() {
		// TODO Auto-generated constructor stub
	}

	public Tax(int id, int pid, double tax) {
		this.id = id;
		this.pid = pid;
		this.tax = tax;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}
