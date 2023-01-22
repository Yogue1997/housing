package com.housing.app.landlord;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="house")
public class Landlord {
	
	@Id
	private int id;
	
	
	private int bedroom;
	private int price;
	private int bathroom;
	private String address;
	private int zipcode;
	private String city;
	private String state;
	private String portrait;
	private String type;
	
	
	public Landlord() {
		// TODO Auto-generated constructor stub
	}



	public Landlord(int id, int bedroom, int price, int bathroom, String address, int zipcode, String city,
			String state, String portrait, String type) {
		super();
		this.id = id;
		this.bedroom = bedroom;
		this.price = price;
		this.bathroom = bathroom;
		this.address = address;
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
		this.portrait = portrait;
		this.type = type;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getBedroom() {
		return bedroom;
	}



	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getBathroom() {
		return bathroom;
	}



	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getZipcode() {
		return zipcode;
	}



	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}
	
	
	public String getPortrait() {
		return portrait;
	}
	
	public void setPortrait (String portrait) {
		this.portrait = portrait;
	}
	
	
	public String getType() {
		return type;
	}
	
	public void setType (String type) {
		this.type = type;
	}
	

}
