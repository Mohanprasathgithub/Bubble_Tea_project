package com.example.mohan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact_us {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrementing primary key
	    private Long id;
	    private String name;
	    private String email;
	    private Long phone_number;
	    private String city;
	    private String comment;
		
		public Contact_us() {
			super();
			// TODO Auto-generated constructor stub
		}

		
		public Contact_us(Long id, String name, String email, long phone_number, String city, String comment) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.phone_number = phone_number;
			this.city = city;
			this.comment = comment;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public Long getPhone_number() {
			return phone_number;
		}


		public void setPhone_number(long phone_number) {
			this.phone_number = phone_number;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getComment() {
			return comment;
		}


		public void setComment(String comment) {
			this.comment = comment;
		}
	    
	    
}
