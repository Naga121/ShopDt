package com.naga.std;

public class ShopDetails {
	private int sid;
	private String sname;
	ShopDetails(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
	}
	public int getSid() {
		return sid;
	}
	public String getSname() {
		return sname;
	}
	void printShopdt() {
		System.out.println( sid+","+sname);
	}

}
