package com.mail.dao;

import java.io.Serializable;

import com.mail.entity.MailEntity;

public interface MailDAO {
	public Serializable save(MailEntity entity);

}
