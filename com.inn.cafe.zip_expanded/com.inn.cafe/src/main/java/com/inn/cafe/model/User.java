package com.inn.cafe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;


@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String contact;
	private String password;
	private String register_time;
	private String register_date;
	private String login_timein;
	private String login_timeout;
	private String user_role;
	public User(int id, String name, String email, String contact, String password,
			String register_time, String register_date, String login_timein, String login_timeout, String user_role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.password = password;
		this.register_time = register_time;
		this.register_date = register_date;
		this.login_timein = login_timein;
		this.login_timeout = login_timeout;
		this.user_role = user_role;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getcontact() {
		return contact;
	}
	public void setcontact(String contact) {
		this.contact = contact;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public String getRegister_time() {
		return register_time;
	}
	public void setRegister_time(String register_time) {
		this.register_time = register_time;
	}
	public String getRegister_date() {
		return register_date;
	}
	public void setRegister_date(String register_date) {
		this.register_date = register_date;
	}
	public String getLogin_timein() {
		return login_timein;
	}
	public void setLogin_timein(String login_timein) {
		this.login_timein = login_timein;
	}
	public String getLogin_timeout() {
		return login_timeout;
	}
	public void setLogin_timeout(String login_timeout) {
		this.login_timeout = login_timeout;
	}
	public String getUser_role() {
		return user_role;
	}
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	
	
}
