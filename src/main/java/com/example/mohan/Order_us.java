package com.example.mohan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order_us {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrementing primary key
	private int id;
	private String name;
	private long phone_number;
	private String fruit_flavours;
	private int count;
	private String chocolate_flavours;
	private int count_1;
	
	
	public Order_us() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param id
	 * @param name
	 * @param phone_number
	 * @param fruit_flavours
	 * @param count
	 * @param chocolate_flavours
	 * @param count_1
	 */
	public Order_us(int id, String name, long phone_number, String fruit_flavours, int count, String chocolate_flavours,
			int count_1) {
		super();
		this.id = id;
		this.name = name;
		this.phone_number = phone_number;
		this.fruit_flavours = fruit_flavours;
		this.count = count;
		this.chocolate_flavours = chocolate_flavours;
		this.count_1 = count_1;
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


	public long getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}


	public String getFruit_flavours() {
		return fruit_flavours;
	}


	public void setFruit_flavours(String fruit_flavours) {
		this.fruit_flavours = fruit_flavours;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public String getChocolate_flavours() {
		return chocolate_flavours;
	}


	public void setChocolate_flavours(String chocolate_flavours) {
		this.chocolate_flavours = chocolate_flavours;
	}


	public int getCount_1() {
		return count_1;
	}


	public void setCount_1(int count_1) {
		this.count_1 = count_1;
	}

	
	
}
