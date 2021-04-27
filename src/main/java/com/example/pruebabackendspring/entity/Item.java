package com.example.pruebabackendspring.entity;

public class Item implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Product product;
	private int quantity;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Item(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
	public Item() {
		super();
	}
	

	
	
	
	
}
