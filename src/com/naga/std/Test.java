package com.naga.std;

public class Test {

	public static void main(String[] args) {
		ShopDetails sd=new ShopDetails(10,"Naga");
		ShopDetails sd1=new ShopDetails(20,"Raju");
		System.out.println(sd.getSid()+","+sd.getSname());
		System.out.println(sd1.getSid()+","+sd1.getSname());
		
		

	}

}
