package com.tapas.java;

public class Product {
   private  int id;
   private String name;
   private String catagory;
   private  float price;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCatagory() {
        return catagory;
    }
    public float getPrice() {
        return price;
    }
    
    public Product(int id, String name, String catagory, float price) {

	this.id = id;
	this.name = name;
	this.catagory = catagory;
	this.price = price;
    }
    @Override
    public String toString() {
	return "Product [id=" + id + ", name=" + name + ", catagory=" + catagory + ", price=" + price + "]";
    }
    

}
