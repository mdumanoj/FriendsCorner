package com.fc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="user.findAll", query="SELECT e FROM User e")
public class User {

	@Id
	@GeneratedValue
	@Column(name="userId")
	private int user_id;
	
	@Column(name="name")
	private String user_name;
	
	@Column(name="email")
	private String user_email;
	
	@Column(name="password")
	private String user_password;
	
	@Column(name="phone")
	private String user_phone;
	
	@Column(name="gender")
	private String user_gender;
	
	@Column(name="relationshipStatus")
	private String user_relationshipStatus;
	
	@Column(name="dateOfBirth")
	private String user_dateOfBirth;
	
	@Column(name="school")
	private String user_school;
	
	@Column(name="college")
	private String user_college;
	
	@Column(name="work")
	private String user_work;
	
	@Column(name="nationality")
	private String user_nationality;
	
	@Column(name="city")
	private String user_city;
	
	@Column(name="state")
	private String user_state;
	
	@Column(name="country")
	private String user_country;
	
	@Column(name="profilePicUrl")
	private String user_profilePicUrl;
	
	@Column(name="status")
	private String user_status;

	

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}

	public String getUser_relationshipStatus() {
		return user_relationshipStatus;
	}

	public void setUser_relationshipStatus(String user_relationshipStatus) {
		this.user_relationshipStatus = user_relationshipStatus;
	}

	public String getUser_dateOfBirth() {
		return user_dateOfBirth;
	}

	public void setUser_dateOfBirth(String user_dateOfBirth) {
		this.user_dateOfBirth = user_dateOfBirth;
	}

	public String getUser_school() {
		return user_school;
	}

	public void setUser_school(String user_school) {
		this.user_school = user_school;
	}

	public String getUser_college() {
		return user_college;
	}

	public void setUser_college(String user_college) {
		this.user_college = user_college;
	}

	public String getUser_work() {
		return user_work;
	}

	public void setUser_work(String user_work) {
		this.user_work = user_work;
	}

	public String getUser_nationality() {
		return user_nationality;
	}

	public void setUser_nationality(String user_nationality) {
		this.user_nationality = user_nationality;
	}

	public String getUser_city() {
		return user_city;
	}

	public void setUser_city(String user_city) {
		this.user_city = user_city;
	}

	public String getUser_state() {
		return user_state;
	}

	public void setUser_state(String user_state) {
		this.user_state = user_state;
	}

	public String getUser_country() {
		return user_country;
	}

	public void setUser_country(String user_country) {
		this.user_country = user_country;
	}

	public String getUser_profilePicUrl() {
		return user_profilePicUrl;
	}

	public void setUser_profilePicUrl(String user_profilePicUrl) {
		this.user_profilePicUrl = user_profilePicUrl;
	}

	public String getUser_status() {
		return user_status;
	}

	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}

	
}