package com.tapas.java;
//Find the cheapest product from Pone catagory 
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/*
   Product p1 =  new Product(101,"Java","Book",150);
   Product p2 =  new Product(102,"Spring","Book",300);
   Product p3 =  new Product(103,"HTML","Book",100);
   Product p4 =  new Product(104,"CSS","Book",250);
   Product p5 =  new Product(105,"Nokia","Phone",3000);
   Product p6 =  new Product(106,"Samsung","Phone",1500);
   Product p7 =  new Product(107,"Lenovo","Phone",2500);
   Product p8 =  new Product(108,"Sampo","Phone",250);
   
*/
public class StreamFunctionExample {

    public static void main(String[] args) {
	
	Product p1 =  new Product(101,"Java","Book",150);
	   Product p2 =  new Product(102,"Spring","Book",300);
	   Product p3 =  new Product(103,"HTML","Book",100);
	   Product p4 =  new Product(104,"CSS","Book",250);
	   Product p5 =  new Product(105,"Nokia","Phone",3000);
	   Product p6 =  new Product(106,"Samsung","Phone",1500);
	   Product p7 =  new Product(107,"Lenovo","Phone",2500);
	   Product p8 =  new Product(108,"Sampo","Beauty",250);

	   List<Product> product = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);
	   /*	   Product  cheapProduct=product.stream().filter(n->n.getCatagory().equalsIgnoreCase("Phone")).min(Comparator.comparing(Product::getPrice)).get();
	   	   System.out.println(cheapProduct);*/
	  Product maxProduct= product.stream().filter(n->n.getCatagory().equalsIgnoreCase("Book")).max(Comparator.comparing(Product::getPrice)).get();
	  System.out.println(maxProduct);
    }

}
