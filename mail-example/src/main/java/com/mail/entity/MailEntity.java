package com.mail.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "email")
public class MailEntity {
	@GenericGenerator(name = "Siddu", strategy = "increment")
	@GeneratedValue(generator = "Siddu")
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "email")
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MailEntity [id=" + id + ", email=" + email + "]";
	}

}
