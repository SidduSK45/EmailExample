package com.mail.dto;

import org.springframework.stereotype.Component;

@Component
public class MailDTO {
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MailDTO [email=" + email + "]";
	}

}
